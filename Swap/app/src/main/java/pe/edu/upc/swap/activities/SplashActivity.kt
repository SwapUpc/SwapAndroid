package pe.edu.upc.swap.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import pe.edu.upc.swap.R
import pe.edu.upc.swap.data.database.AppDatabase
import pe.edu.upc.swap.data.database.model.User

class SplashActivity : AppCompatActivity() {

    private var mDelayHandler: Handler? = null
    private var LAUNCH_DELAY: Long = 2500
    var users: MutableList<User> = ArrayList()

    private val mRunnable: Runnable = Runnable {
        if(!isFinishing){
            users = AppDatabase.getInstance(applicationContext).getDao().getAll()
            if(users.isNotEmpty()){
                users[0].flag
                if(users[0].flag){
                    startActivity(Intent(applicationContext, HomeActivity::class.java))
                    finish()
                }else{
                    startActivity(Intent(applicationContext, LoginActivity::class.java))
                    finish()
                }
            }else{
                startActivity(Intent(applicationContext, LoginActivity::class.java))
                finish()
            }
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        mDelayHandler = Handler()
        mDelayHandler!!.postDelayed(mRunnable, LAUNCH_DELAY)
    }

    override fun onDestroy() {
        if(mRunnable != null){
            mDelayHandler!!.removeCallbacks(mRunnable)
        }
        super.onDestroy()
    }
}

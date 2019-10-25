package pe.edu.upc.swap.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.widget.Toolbar
import androidx.viewpager.widget.ViewPager
import kotlinx.android.synthetic.main.activity_home.*
import pe.edu.upc.swap.R
import pe.edu.upc.swap.adapters.SectionsPagerAdapter
import pe.edu.upc.swap.data.database.AppDatabase
import pe.edu.upc.swap.data.database.model.User
import pe.edu.upc.swap.fragments.LessonFragment
import pe.edu.upc.swap.fragments.TeachersFragment

class HomeActivity : AppCompatActivity() {

    private var backPress = 0
    lateinit var toolbar: Toolbar
    var users: MutableList<User> = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        //region TabBar
        val viewPager: ViewPager = findViewById(R.id.nav_view)

        setupViewPager(viewPager)
        tabs.setupWithViewPager(viewPager)
        //endregion

        //region Toolbar
        toolbar = findViewById(R.id.toolbar_home)
        setSupportActionBar(toolbar)
        supportActionBar?.title = resources.getString(R.string.hint_title_home)
        //endregion

        users = AppDatabase.getInstance(applicationContext).getDao().getAll()
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        when (item.itemId){
            R.id.bt_logout -> {
                val intent = Intent(this, LoginActivity::class.java)
                Logout()
                startActivity(intent)
                return true
            }
            else -> super.onOptionsItemSelected(item)
        }
        return false
    }

    private fun Logout(){
        val index = users[0].id
        var user = User(index,"",false)
        AppDatabase.getInstance(applicationContext).getDao().update(user)
    }

    override fun onPause() {
        super.onPause()
        val viewPager: ViewPager = findViewById(R.id.nav_view)
        viewPager.currentItem = 0
    }

    override fun onStop() {
        super.onStop()
        val viewPager: ViewPager = findViewById(R.id.nav_view)
        viewPager.currentItem = 0
    }

    override fun onBackPressed() {
        backPress += 1
        if(backPress > 1){
            this.finishAffinity()
        } else {
            Toast.makeText(applicationContext, resources.getString(R.string.alert_exit),Toast.LENGTH_SHORT).show()
        }
    }

    private fun setupViewPager(viewPager: ViewPager){
        val adapter = SectionsPagerAdapter(supportFragmentManager)
        adapter.addFragment(TeachersFragment(), resources.getString(R.string.hint_title_teacher_fragment))
        adapter.addFragment(LessonFragment(), resources.getString(R.string.hint_title_lesson_fragment))
        viewPager.adapter = adapter
    }
}

package pe.edu.upc.swap.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_login.*
import pe.edu.upc.swap.R
import pe.edu.upc.swap.data.database.AppDatabase
import pe.edu.upc.swap.data.database.model.User
import pe.edu.upc.swap.data.network.RetrofitClient
import pe.edu.upc.swap.data.network.model.LoginRequest
import pe.edu.upc.swap.data.network.model.LoginResponse
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class LoginActivity : AppCompatActivity() {

    var token: String = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
    }

    fun clickLogin(view: View){
        val email = tUsername.text.toString().trim()
        val password = tPassword.text.toString().trim()

        var isValid: Boolean = true

        if(email.isEmpty()){
            tlUsername.error = resources.getString(R.string.alert_email)
            isValid = false
        } else {
            tlUsername.isErrorEnabled = false
        }

        if(password.isEmpty()){
            tlPassword.error = resources.getString(R.string.alert_password)
            isValid = false
        } else {
            tlPassword.isErrorEnabled = false
        }

        if(isValid){
            val request = LoginRequest(email, password)

            RetrofitClient.instance().userLogin(request)
                .enqueue(object : Callback<LoginResponse> {
                    override fun onFailure(call: Call<LoginResponse>, t: Throwable) {
                        Toast.makeText(applicationContext, resources.getString(R.string.hint_login_no_internet), Toast.LENGTH_SHORT).show()
                    }

                    override fun onResponse(
                        call: Call<LoginResponse>,
                        response: Response<LoginResponse>
                    ) {
                        if(response.body()?.result!! != 0){
                            token = response.body()!!.data

                            val users: MutableList<User> = AppDatabase.getInstance(view.context).getDao().getAll()

                            if(users.isEmpty()){
                                val user = User(1, token, true)
                                AppDatabase.getInstance(view.context)
                                    .getDao().insert(user)
                            }else{
                                val user = User(1, token, true)
                                AppDatabase.getInstance(view.context)
                                    .getDao().update(user)
                            }

                            val intent = Intent(applicationContext, HomeActivity::class.java)
                            intent.putExtra("token", token)
                            startActivity(intent)
                        } else {
                            Toast.makeText(applicationContext, resources.getString(R.string.hint_login_authorization), Toast.LENGTH_LONG).show()
                        }
                    }
                })
        }
    }

    fun clickSignUp(view: View){
        startActivity(Intent(applicationContext, SignUpActivity::class.java))
    }
}

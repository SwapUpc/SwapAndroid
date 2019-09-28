package com.upc.edu.swapapp.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Window
import android.widget.Toast
import com.upc.edu.swapapp.R
import com.upc.edu.swapapp.data.network.RetrofitClient
import com.upc.edu.swapapp.data.network.model.LoginRequest
import com.upc.edu.swapapp.data.network.model.LoginResponse
import kotlinx.android.synthetic.main.activity_main.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {

    var token: String = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btSignin.setOnClickListener {
            val email = tiEmail.text.toString().trim()
            val password = tiPassword.text.toString().trim()

            if (email.isEmpty()) {
                tiEmail.error = "Email required"
                tiEmail.requestFocus()
                return@setOnClickListener
            }

            if (password.isEmpty()) {
                tiPassword.error = "Password required"
                tiPassword.requestFocus()
                return@setOnClickListener
            }

            val request = LoginRequest(email, password)


            RetrofitClient.instance(token).userLogin(request)
                .enqueue(object : Callback<LoginResponse> {
                    override fun onFailure(call: Call<LoginResponse>, t: Throwable) {
                        Toast.makeText(applicationContext, "Error  Critico 2", Toast.LENGTH_LONG)
                            .show()
                    }

                    override fun onResponse(
                        call: Call<LoginResponse>,
                        response: Response<LoginResponse>
                    ) {
                        if (response.body()?.result!! != 0) {
                            token = response.body()!!.data

                            //Guardar data en celular (flag de log y token)
                            Toast.makeText(applicationContext, response.body()!!.message + " token -> " + response.body()!!.data, Toast.LENGTH_LONG).show()

                            val intent = Intent(applicationContext, HomeActivity::class.java)
                            intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK

                            startActivity(intent)

                        } else {
                            Toast.makeText(
                                applicationContext, "No esta autorizado", Toast.LENGTH_LONG
                            ).show()
                        }
                    }

                })

        }

        btNew.setOnClickListener {
            val intent = Intent(applicationContext, SignupActivity::class.java)
            intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK

            startActivity(intent)
        }

    }

    override fun onStart() {
        super.onStart()
    }
}

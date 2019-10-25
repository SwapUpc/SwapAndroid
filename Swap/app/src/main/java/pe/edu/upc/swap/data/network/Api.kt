package pe.edu.upc.swap.data.network

import pe.edu.upc.swap.data.network.model.Lesson
import pe.edu.upc.swap.data.network.model.*
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.POST

interface Api {

    @POST("authentication/signIn")
    fun userLogin(@Body request: LoginRequest): Call<LoginResponse>

    @POST("authentication/signUp")
    fun userSignUp(@Body request: SignUpRequest): Call<LoginResponse>

    @GET("lesson/teachers")
    fun listTeachers(@Header("Authorization") token: String): Call<List<Teacher>>

    @GET("lesson/views")
    fun listLesson(@Header("Authorization") token: String): Call<List<Lesson>>
}
package com.upc.edu.swapapp.data.network
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitClient {

    private var t: String = ""

    private const val BASE_URL = "https://swaprest.azurewebsites.net/api/"

    private val okHttpClient = OkHttpClient.Builder()
        .addInterceptor{ chain ->
            val original = chain.request()
                //TODO: Editar headers ?
            val requestBuilder = original.newBuilder()
                .addHeader("Authorization", t)
                .method(original.method(), original.body())

            val request = requestBuilder.build()
            chain.proceed(request)
        }.build()

    fun instance(token: String): Api {
        t = token
        val retrofit = Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .client(okHttpClient)
            .build()
        return retrofit.create(Api::class.java)
    }
}
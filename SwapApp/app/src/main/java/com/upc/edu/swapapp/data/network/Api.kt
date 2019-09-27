package com.upc.edu.swapapp.data.network

import com.upc.edu.swapapp.data.network.model.LoginRequest
import com.upc.edu.swapapp.data.network.model.LoginResponse
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.POST

interface Api {

    @POST("authentication/signIn")
    fun userLogin(@Body request: LoginRequest
    ): Call<LoginResponse>
}
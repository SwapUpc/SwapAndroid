package com.upc.edu.swapapp.data.network

import com.upc.edu.swapapp.data.network.model.*
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Query

interface Api {

    //Authentication
    @POST("authentication/signIn")
    fun postUserLogin(@Body request: LoginRequest
    ): Call<LoginResponse>

    @POST("authentication/signUp")
    fun postUserSingUp(@Body request: SingUpRequest
    ): Call<SingUpResponse>

    //Get
    /*TODO: Lo del get no sabia si ponerlo, como lo vi en el RetrofitClient --pieter */
    //Information
    @GET("information/language/{id}")
    fun getLanguage(@Query("id") id: Int):Call<LanguageResponse>

    @GET("information/country/{id}")
    fun getCountry(@Query("id") id: Int):Call<CountryResponse>

    @GET("information/level/{id}")
    fun getLevel(@Query("id") id: Int):Call<LevelResponse>

    @GET("information/rol/{id}")
    fun getRol(@Query("id") id: Int):Call<RolResponse>

    @GET("information/task/{id}")
    fun getTask(@Query("id") id: Int):Call<TaskResponse>

    @GET("information/wish/{id}")
    fun getWish(@Query("id") id: Int):Call<WishResponse>

    @GET("information/languages")
    fun getLanguages():Call<LanguagesResponse>

    @GET("information/countries")
    fun getCountries():Call<CountriesResponse>

    @GET("information/levels")
    fun getLevels():Call<LevelsResponse>

    @GET("information/tasks")
    fun getTasks():Call<TasksResponse>

    //Lesson



    /*TODO: PUT -> Update*/









}
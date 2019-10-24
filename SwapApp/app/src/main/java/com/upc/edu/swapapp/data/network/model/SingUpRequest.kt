package com.upc.edu.swapapp.data.network.model

class SingUpRequest (
    val name: String,
    val lastname: String,
    val email: String,
    val password: String,
    val birthday: String,
    val mobilephone: String,
    val description: String,
    val gender: String,
    val country: Int,
    val image: String,
    val languages: Array<Int>?,
    val wishes: Array<Int>?,
    val levels: Array<Int>?
)
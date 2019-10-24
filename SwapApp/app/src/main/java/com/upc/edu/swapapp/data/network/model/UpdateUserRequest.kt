package com.upc.edu.swapapp.data.network.model

class UpdateUserRequest (
    val name: String,
    val lastname: String,
    val password: String,
    val mobilephone: String,
    val description: String,
    val image: String,
    val languages: Array<Int>?,
    val wishes: Array<Int>?,
    val levels: Array<Int>?
)

package com.upc.edu.swapapp.data.network.model

import com.google.gson.annotations.SerializedName

class UserResponse {
    @SerializedName("id")
    var id = 0

    @SerializedName("name")
    var name = ""

    @SerializedName("lastname")
    var lastname = ""

    @SerializedName("email")
    var email = ""

    @SerializedName("password")
    var password = ""

    @SerializedName("birthday")
    var birthday = ""

    @SerializedName("mobilephone")
    var mobilephone = ""

    @SerializedName("description")
    var description = ""

    @SerializedName("active")
    var active = 0

    @SerializedName("gender")
    var gender = ""

    @SerializedName("country")
    var country = ""

    @SerializedName("token")
    var token = ""

    @SerializedName("rol")
    var rol = 0

    @SerializedName("image")
    var image = ""

    @SerializedName("image")
    var languages = arrayOf<String>("")
}
package com.upc.edu.swapapp.data.network.model

import com.google.gson.annotations.SerializedName

class TeacherResponse {
    @SerializedName("id")
    var id = 0

    @SerializedName("name")
    var name = ""

    @SerializedName("lastname")
    var lastname = ""

    @SerializedName("mobilephone")
    var mobilephone = ""

    @SerializedName("description")
    var description = ""

    @SerializedName("gender")
    var gender = ""

    @SerializedName("country")
    var country = ""

    @SerializedName("image")
    var image = ""

    @SerializedName("image")
    var languages = arrayOf<String>("")
}
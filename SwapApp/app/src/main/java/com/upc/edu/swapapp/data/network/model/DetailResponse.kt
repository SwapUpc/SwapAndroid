package com.upc.edu.swapapp.data.network.model

import com.google.gson.annotations.SerializedName

class DetailResponse {

    @SerializedName("id")
    var id = 0

    @SerializedName("student_id")
    var student_id = 0

    @SerializedName("teacher")
    var teacher = TeacherResponse()

    @SerializedName("latitude")
    var latitude = 0

    @SerializedName("lenght")
    var lenght = 0

    @SerializedName("day")
    var day = ""

    @SerializedName("task")
    var task = ""

    @SerializedName("description")
    var description = ""

    @SerializedName("status")
    var status = 0
}
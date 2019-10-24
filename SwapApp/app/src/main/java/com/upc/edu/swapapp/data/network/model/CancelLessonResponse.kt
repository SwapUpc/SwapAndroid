package com.upc.edu.swapapp.data.network.model

import com.google.gson.annotations.SerializedName

class CancelLessonResponse {
    @SerializedName("result")
    var result = 0

    @SerializedName("data")
    var data = ""

    @SerializedName("message")
    var message = ""
}
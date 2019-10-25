package pe.edu.upc.swap.data.network.model

import com.google.gson.annotations.SerializedName

class LoginResponse {
    @SerializedName("result")
    var result = 0

    @SerializedName("data")
    var data = ""

    @SerializedName("message")
    var message = ""
}
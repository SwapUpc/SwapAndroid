package pe.edu.upc.swap.data.network.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

class Teacher (
    @SerializedName("id")
    @PrimaryKey
    val id: Int,

    @SerializedName("name")
    val name: String,

    @SerializedName("lastname")
    val lastname: String,

    @SerializedName("mobilephone")
    val mobilephone: String,

    @SerializedName("description")
    val description: String,

    @SerializedName("gender")
    val gender: String,

    @SerializedName("country")
    val country: String,

    @SerializedName("image")
    val image: String,

    @SerializedName("languages")
    val languages: MutableList<String>
)
package pe.edu.upc.swap.data.network.model

import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

class Lesson (
    @SerializedName("id")
    val id: Int,

    @SerializedName("student_id")
    val student_id: Int,

    @SerializedName("day")
    val day: String,

    @SerializedName("task")
    val task: String,

    @SerializedName("description")
    val description: String,

    @SerializedName("status")
    val status: Int
)
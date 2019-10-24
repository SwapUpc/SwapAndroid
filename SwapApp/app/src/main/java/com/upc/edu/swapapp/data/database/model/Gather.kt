package com.upc.edu.swapapp.data.database.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

@Entity
data class Gather (

    @PrimaryKey
    val id: Long? = null,

    @ColumnInfo
    val name: String? = null,

    @ColumnInfo
    val lastname: String? = null,

    @ColumnInfo
    val mobilephone: String? = null,

    @ColumnInfo
    val description: String? = null,

    @ColumnInfo
    val gender: String? = null,

    @ColumnInfo
    val country: String? = null,

    @ColumnInfo
    val image: String? = null,

    @ColumnInfo
    val languages: List<String>? = null

){
}
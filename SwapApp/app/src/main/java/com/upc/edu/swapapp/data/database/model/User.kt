package com.upc.edu.swapapp.data.database.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class User (

    @PrimaryKey
    var id: Int?,

    @ColumnInfo(name = "name")
    var name: String?,

    @ColumnInfo(name = "fullname")
    var fullname: String?,

    @ColumnInfo(name = "languages")
    var languages: String?,

    @ColumnInfo(name = "token")
    var token: String?,

    @ColumnInfo(name = "logged")
    var logged: Boolean?
)
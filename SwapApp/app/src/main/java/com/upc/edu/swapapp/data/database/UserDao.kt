package com.upc.edu.swapapp.data.database

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.upc.edu.swapapp.data.database.model.User

@Dao
interface UserDao {

    @Query("select * from User")
    fun getAll(): List<User>

    @Insert
    fun insert(vararg user: User)

    @Query("select token from User where id = 1")
    fun getToken(): String?
}
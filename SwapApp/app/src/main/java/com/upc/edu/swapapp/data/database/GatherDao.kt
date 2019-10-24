package com.upc.edu.swapapp.data.database

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import com.upc.edu.swapapp.data.database.model.Gather
import androidx.room.Query

@Dao
interface GatherDao {

    @Query( "select * from gather")
    fun getAll(): List<Gather>

    @Query( "select * from gather where id=:id")
    fun findById(id : Int)

    @Delete
    fun deleteGather(vararg  gather: Gather)

    @Insert
    fun insertGather(vararg  gather: Gather)






}
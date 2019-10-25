package pe.edu.upc.swap.data.database.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class User (

    @PrimaryKey
    val id: Int,

    @ColumnInfo(name="token")
    val token: String,

    @ColumnInfo(name="flag")
    val flag: Boolean
)
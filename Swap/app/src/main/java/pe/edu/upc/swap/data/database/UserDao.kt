package pe.edu.upc.swap.data.database

import androidx.room.*
import pe.edu.upc.swap.data.database.model.User

@Dao
interface UserDao {

    @Query("select * from user where user.id = 1")
    fun getAll(): MutableList<User>

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    fun insert(vararg user: User)

    @Update
    fun update(vararg user: User)
}
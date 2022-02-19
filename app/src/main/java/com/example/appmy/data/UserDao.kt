package com.example.appmy.data

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Query

@Dao
interface UserDao {
    suspend fun addUser(user : User) // suspen la gi

    @Query(value = "SELECT * FROM user_table ORDER BY id ASC")
    fun readAllData(): LiveData<List<User>>
}
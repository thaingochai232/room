package com.example.appmy.data

import androidx.lifecycle.LiveData

// la kho luu tru
class UserRepository(private val userDao: UserDao) {

    val readAllData: LiveData<List<User>> = userDao.readAllData()

    suspend fun addUser(user: User){
        userDao.addUser(user)
    }
}

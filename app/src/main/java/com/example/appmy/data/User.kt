package com.example.appmy.data

import androidx.room.Entity
import androidx.room.PrimaryKey

// thuc the nay dai dien cho 1 bang la bang User
@Entity(tableName = "user_table")
data class User( // tai sao phai la data class // luc tao thi class User{} dau {} khac gi dau ()
    @PrimaryKey(autoGenerate = true) // khoa chinh
    val Id: Int,
    val firstName: String,
    val lastName: String,
    val age: Int
)
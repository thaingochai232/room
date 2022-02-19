package com.example.appmy.data

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [User:: class], version = 1, exportSchema = false) // entrities la gi, vi sao su dung o day // cai dong nay la gi
abstract class UserDatabase: RoomDatabase() { // tai sao lai dung lop truu tuong o day

    abstract fun UserDao(): UserDao

    companion object{
        @Volatile
        private var INSTANCE: UserDatabase? = null

        fun getDatabase(context: Context): UserDatabase{
            val tempIntence = INSTANCE
            if (tempIntence != null) {
                return tempIntence
            }
            synchronized(this) { // nay la gi
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    UserDatabase::class.java,
                    "user_table"
                ).build()
                INSTANCE = instance
                return  instance
            }
        }
    }
}
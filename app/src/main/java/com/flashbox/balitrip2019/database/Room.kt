package com.flashbox.balitrip2019.database

import android.content.Context
import androidx.room.*
import com.flashbox.balitrip2019.home.Home

@Dao
interface HomeDao{

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertAll(items: List<Home>)

    @Query("select * from home_table")
    fun getAllItems(): List<Home>

    @Query("delete from home_table")
    fun deleteAll()

    @Update
    fun insertData(home: Home): Int

    @Query("select data from home_table where id=:id")
    fun getData(id: Int): String
}

@Database(entities = [Home::class], version = 1)
abstract class AppDatabase : RoomDatabase(){
    abstract val homeDao: HomeDao
}

private lateinit var INSTANCE: AppDatabase

fun getAppDatabase(context: Context) : AppDatabase {
    synchronized(AppDatabase::class.java){
        if(!::INSTANCE.isInitialized){
            INSTANCE = Room.databaseBuilder(context.applicationContext,
                AppDatabase::class.java,
                "bali_database").fallbackToDestructiveMigration().build()
        }
    }
    return INSTANCE
}




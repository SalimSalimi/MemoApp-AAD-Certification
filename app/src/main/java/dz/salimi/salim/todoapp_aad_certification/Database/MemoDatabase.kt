package dz.salimi.salim.todoapp_aad_certification.Database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import dz.salimi.salim.todoapp_aad_certification.Database.Entities.Media
import dz.salimi.salim.todoapp_aad_certification.Database.Entities.Memo

@Database(entities=(arrayOf(Memo::class, Media::class)), version = 1, exportSchema = false)
abstract class MemoDatabase: RoomDatabase(){

    abstract fun MemoDaos()

    companion object {

        @Volatile
        private var INSTANCE: MemoDatabase? = null

        fun getDatabase(context: Context): MemoDatabase {
            val tempInstance = INSTANCE
            if (tempInstance != null) {
                return tempInstance
            }
            synchronized(this){
                val instance = Room.databaseBuilder(context.applicationContext,
                            MemoDatabase::class.java,
                            "memo_database").build()
                INSTANCE = instance
                return instance
            }
        }
    }
}
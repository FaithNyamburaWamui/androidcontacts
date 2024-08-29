package faithnyambura.io.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import faithnyambura.io.models.Contact


@Database(entities = arrayOf(Contact::class), version = 1)
abstract class ContactsDb: RoomDatabase(){
    abstract fun getContactsDao():ContactsDao
    companion object{
        private var database: ContactsDb? =null


        fun getDatabase(context: Context): ContactsDb{
            if(database==null){
                database = Room
                    .databaseBuilder(context, ContactsDb::class.java,"contacts_db")
                    .fallbackToDestructiveMigration()
                    .build()
            }
            return database as ContactsDb
        }
    }
}
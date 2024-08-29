package faithnyambura.io.database

import androidx.lifecycle.LiveData
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import faithnyambura.io.models.Contact

interface ContactsDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
  fun insertContacts(contact: Contact)

    @Query("SELECT * FROM contacts")
    fun getAllContacts(): LiveData<List<Contact>>

    @Query("SELECT * FROM contacts WHERE contactId = :contactId")
    fun getContactById(contactId: Int): LiveData<Contact>
}
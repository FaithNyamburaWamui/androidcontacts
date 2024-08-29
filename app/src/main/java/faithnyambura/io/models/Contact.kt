package faithnyambura.io.models

import android.provider.ContactsContract
import androidx.room.Dao
import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "contacts")
data class Contact(
    @PrimaryKey(autoGenerate = true) var contactId: Int,
    var name:String,
    var phoneNumber: String,
    var email: String,
    var avatar:String
)

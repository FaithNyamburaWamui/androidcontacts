package faithnyambura.io.repository

import faithnyambura.io.MyContactsApp
import faithnyambura.io.database.ContactsDb
import faithnyambura.io.models.Contact
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class ContactsRepository {
    val database = ContactsDb.getDatabase(MyContactsApp.appContext)
    val contactsDao=database.getContactsDao()

 suspend fun  saveContacts(contact: Contact){
     withContext(Dispatchers.IO){
         contactsDao.insertContacts(contact)
     }
 }
}
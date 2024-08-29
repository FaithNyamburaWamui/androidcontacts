package faithnyambura.io.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import faithnyambura.io.models.Contact
import faithnyambura.io.repository.ContactsRepository
import kotlinx.coroutines.launch

class ContactsViewModels: ViewModel() {
    val contactsRepo = ContactsRepository()

    fun saveContact(contact: Contact){
        viewModelScope.launch {
            contactsRepo.saveContacts(contact)
        }
    }
}
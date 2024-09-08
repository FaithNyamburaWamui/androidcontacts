package faithnyambura.io.ui

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import faithnyambura.io.models.Contact
import faithnyambura.io.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.rvContacts.layoutManager=LinearLayoutManager(this)
//         binding.rvContacts.layoutManager=LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false)
//        binding.rvContacts.layoutManager=GridLayoutManager(this,2)
        displayContacts()

        binding.addBtn.setOnClickListener {
            val intent=Intent(this,AddContactActivity::class.java)
            startActivity(intent)
        }
    }
    fun displayContacts(){
        val contact1= Contact(1,"Abraham","0712121212","andrew@gmail.com","")
        val contact2= Contact(2,"Samson","0712121212","samson@gmail.com","")
        val contact3= Contact(3,"Wyclife","0712121212","wyclife@gmail.com","")
        val contact4= Contact(4,"Brandon","0712121212","brandon@gmail.com","")
        val contact5= Contact(5,"Anne","0712121212","anne@gmail.com","")
        val contact6= Contact(6,"Esther","0712121212","esther@gmail.com","")
        val contact7= Contact(7,"Faith","0712121212","faith@gmail.com","")

        val contactsList= listOf(contact1,contact2,contact3,contact4,contact5,contact6,contact7)
        val contactAdapter= ContactAdapter(contactsList)
        binding.rvContacts.adapter=contactAdapter
    }

}
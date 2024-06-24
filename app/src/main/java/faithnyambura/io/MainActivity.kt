package faithnyambura.io

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
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
    }
    fun displayContacts(){
        val contact1=Contact("Abraham","0712121212","andrew@gmail.com","")
        val contact2=Contact("Samson","0712121212","samson@gmail.com","")
        val contact3=Contact("Wyclife","0712121212","wyclife@gmail.com","")
        val contact4=Contact("Brandon","0712121212","brandon@gmail.com","")
        val contact5=Contact("Anne","0712121212","anne@gmail.com","")
        val contact6=Contact("Esther","0712121212","esther@gmail.com","")
        val contact7=Contact("Faith","0712121212","faith@gmail.com","")

        val contactsList= listOf(contact1,contact2,contact3,contact4,contact5,contact6,contact7)
        val contactAdapter=ContactAdapter(contactsList)
        binding.rvContacts.adapter=contactAdapter
    }

}
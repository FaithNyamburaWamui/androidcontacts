package faithnyambura.io.ui

import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import faithnyambura.io.R
import faithnyambura.io.databinding.ActivityAddContactBinding

class AddContactActivity : AppCompatActivity() {
    lateinit var binding: ActivityAddContactBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityAddContactBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnSave.setOnClickListener {
            validateForm()
        }

    }

    fun validateForm(){
        var formErr=false
        val name=binding.nameText.text.toString()
        if(name.isBlank()){
            formErr=true
            binding.nameText.error="Name required"
        }

        val phone=binding.phoneNumber.text.toString()
        if(phone.isBlank()){
            formErr=true
            binding.phoneNumber.error="Number required"
        }

        val email=binding.emailText.text.toString()
        if(email.isBlank()){
            formErr=true
            binding.emailText.error="Email required"
        }
    }

}
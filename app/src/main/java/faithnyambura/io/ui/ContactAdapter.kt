package faithnyambura.io.ui

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import faithnyambura.io.databinding.ContactListItemBinding
import faithnyambura.io.models.Contact

class ContactAdapter (val contactsList:List<Contact>):RecyclerView.Adapter<ContactViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactViewHolder {
        val binding=ContactListItemBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return ContactViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ContactViewHolder, position: Int) {
        val contact = contactsList[position]
        holder.binding.tvName.text=contact.name
        holder.binding.tvPhoneNumber.text=contact.phoneNumber
        holder.binding.tvEmail.text = contact.email
    }

    override fun getItemCount(): Int {
        return contactsList.size
    }
}

class ContactViewHolder(var binding:ContactListItemBinding):RecyclerView.ViewHolder(binding.root){
}
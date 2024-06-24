package faithnyambura.io

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.card.MaterialCardView

class ContactAdapter (val contactsList:List<Contact>):RecyclerView.Adapter<ContactViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactViewHolder {
        var itemView=LayoutInflater.from(parent.context).inflate(R.layout.contact_list_item,parent,
            false
        )
        return ContactViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: ContactViewHolder, position: Int) {
        val contact = contactsList[position]
        holder.tvName.text=contact.name
        holder.tvPhoneNumber.text=contact.phoneNumber
        holder.tvEmail.text = contact.email
    }

    override fun getItemCount(): Int {
        return contactsList.size
    }
}

class ContactViewHolder(itemView:View):RecyclerView.ViewHolder(itemView){
    val tvName=itemView.findViewById<TextView>(R.id.tvName)
    val tvEmail=itemView.findViewById<TextView>(R.id.tvEmail)
    val tvPhoneNumber=itemView.findViewById<TextView>(R.id.tvPhoneNumber)
}
package com.example.recyclerview

import android.system.Os.bind
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil.bind
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerview.databinding.ItemPersonBinding
import com.example.recyclerview.databinding.ItemPersonBindingImpl

class PersonAdapter(val items: List<Person>,
                    private val clickListener: (person: Person) -> Unit) : RecyclerView.Adapter<PersonAdapter.PersonViewHolder>(){
    class PersonViewHolder(val binding: ItemPersonBind): RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PersonViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_person, parent, false)
        val viewHolder = PersonViewHolder(.bind(view))
        view.setOnClickListener{
            clickListener.invoke(items[viewHolder.adapterPosition])
        }

        return viewHolder
    }

    override fun getItemCount(): Int = items.size

    override fun onBindViewHolder(holder: PersonViewHolder, position: Int) {
        holder.binding.person = items[position]
    }
}



package com.example.recycleview.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

import androidx.recyclerview.widget.RecyclerView
import com.example.recycleview.R
import com.example.recycleview.model.MyContact

class ContactAdapter(val listContact : List<MyContact>) : RecyclerView.Adapter<ContactAdapter.ViewHolder>() {

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        val nama: TextView = itemView.findViewById(R.id.tv_nama)
        val noHp: TextView = itemView.findViewById(R.id.tv_no_hp)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.my_contact_item,parent,false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listContact.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.nama.text = listContact[position].name
        holder.noHp.text = listContact[position].noHp
    }
}
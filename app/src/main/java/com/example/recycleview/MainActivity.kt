package com.example.recycleview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.recycleview.Datasource.Datasource
import com.example.recycleview.adapter.ContactAdapter

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val listContact = Datasource().loadMyContact()

//        val adapter = ContactAdapter(listContact)

//        val layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL,false)

        val recyclerView = findViewById<RecyclerView>(R.id.recycler_view)
        recyclerView.adapter = ContactAdapter(listContact)

        recyclerView.setHasFixedSize(true)
    }
}
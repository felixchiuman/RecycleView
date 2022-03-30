package com.example.recycleview.Datasource

import com.example.recycleview.model.MyContact

class Datasource {
    fun loadMyContact(): List<MyContact>{
        return listOf<MyContact>(
            MyContact("qwerty", "123456789"),
            MyContact("qwerty", "123456789"),
            MyContact("qwerty", "123456789"),
            MyContact("qwerty", "123456789"),
            MyContact("qwerty", "123456789"),
            MyContact("qwerty", "123456789"),
            MyContact("qwerty", "123456789"),
            MyContact("qwerty", "123456789"),
            MyContact("qwerty", "123456789"),
            MyContact("qwerty", "123456789"),
            MyContact("qwerty", "123456789"),
            MyContact("qwerty", "123456789"),
        )
    }
}
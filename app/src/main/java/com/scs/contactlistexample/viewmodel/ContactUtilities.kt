package com.scs.contactlistexample.viewmodel

import com.scs.contactlistexample.model.Contact
import com.scs.contactlistexample.model.saveRoom

fun saveConstact(name: String, number: Int){
    saveRoom(name, number)
}

fun getContacts(): List<Contact>{

    return listOf()
}
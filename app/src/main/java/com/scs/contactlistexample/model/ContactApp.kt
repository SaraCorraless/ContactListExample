package com.scs.contactlistexample.model

import android.app.Application
import androidx.room.Room

class ContactApp: Application(){

    val room = Room.databaseBuilder(this, ContactDb::class.java, "contact").build()
}



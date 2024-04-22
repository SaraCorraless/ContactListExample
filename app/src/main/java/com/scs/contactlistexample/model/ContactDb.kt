package com.scs.contactlistexample.model

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(
    entities = [Contact::class],
    version = 1
)


abstract class ContactDb: RoomDatabase() {

    abstract fun ContactDao(): ContactDao
}
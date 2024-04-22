package com.scs.contactlistexample.model

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao
interface ContactDao {

    @Query("SELECT * FROM Contact")
    suspend fun getAll(): List<Contact>

    @Insert
    suspend fun insert(contact: Contact)

}
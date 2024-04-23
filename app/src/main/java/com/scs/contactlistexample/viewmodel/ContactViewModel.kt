package com.scs.contactlistexample.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.scs.contactlistexample.model.Contact
import com.scs.contactlistexample.model.ContactDao
import kotlinx.coroutines.launch

class ContactViewModel(): ViewModel() {

  val contact = MutableLiveData<Contact>()


    fun getAllContacts(){
        //do getAll of DAO
    }

}



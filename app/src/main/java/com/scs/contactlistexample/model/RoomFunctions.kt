package com.scs.contactlistexample.model

import android.content.Context
import android.widget.Toast
import androidx.compose.runtime.Composable
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.viewmodel.compose.viewModel


@Composable
fun saveRoom(app:ContactApp, context:Context, name: String, number: Int) {

    Toast.makeText(context, "Name: "+name+ "  Number: "+ number, Toast.LENGTH_LONG).show()

       // val contact = app.room.ContactDao().insert(Contact(1, "test", 2))


}

fun getRoom() : List<Context> {


    return listOf()
}
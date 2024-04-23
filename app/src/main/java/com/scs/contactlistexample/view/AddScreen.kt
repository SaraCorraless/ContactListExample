package com.scs.contactlistexample.view

import android.content.Context
import android.widget.Toast
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.scs.contactlistexample.model.Contact
import com.scs.contactlistexample.model.ContactApp
import com.scs.contactlistexample.model.saveRoom
import kotlinx.coroutines.launch

@Composable
fun addContact(){
    //db
    //val app = LocalContext.current as ContactApp
    val context = LocalContext.current

    var stateName by remember { mutableStateOf("") }
    var stateNumber by remember { mutableStateOf("") }



    Column(
        Modifier
            .fillMaxSize(),
        //.background(Color.Blue),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center) {

        Row(
            Modifier
                .height(70.dp)
                .width(300.dp)
            //.background(Color.Magenta)
        ) {

            OutlinedTextField(
                value = stateName,
                label = { Text(text = "Name") },
                onValueChange = {
                    stateName = it
                },
                singleLine = true
            )
        }

        Row(
            Modifier
                .height(70.dp)
                .width(300.dp))
        //.background(Color.Gray))
        {

            OutlinedTextField(
                value = stateNumber,
                label = { Text(text = "Number") },
                onValueChange = {
                    stateNumber = it
                },
                keyboardOptions = KeyboardOptions.Default.copy(keyboardType = KeyboardType.Number),
                singleLine = true
            )
        }

        Button(
            onClick = {Toast.makeText(context, "Name: "+stateName+ "  Number: "+ stateNumber, Toast.LENGTH_LONG).show()

            }
        ) {
            Text(text = "Add")
        }

    }

}


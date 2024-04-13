package com.scs.contactlistexample.view

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
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
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.HorizontalAlignmentLine
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.unit.dp

@Composable
fun addContact(){
    var text by remember { mutableStateOf(TextFieldValue("")) }

    Column(
        Modifier
            .fillMaxSize()
            .background(Color.Blue),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center) {

        Row(
            Modifier
                .height(70.dp)
                .width(300.dp)
                .background(Color.Magenta)
            ) {

            OutlinedTextField(
                value = "test",
                label = { Text(text = "prueba") },
                onValueChange = {
                    text
                }
            )
        }

        Row(
            Modifier
                .height(70.dp)
                .width(300.dp)
                .background(Color.Gray)) {

            OutlinedTextField(
                value = "test",
                label = { Text(text = "prueba") },
                onValueChange = {
                    text
                }
            )
        }
        
        Button(onClick = { /*TODO*/ }) {
            Text(text = "Add")
        }

    }

}
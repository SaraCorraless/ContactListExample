package com.scs.contactlistexample

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import com.scs.contactlistexample.model.Contact
import com.scs.contactlistexample.ui.theme.ContactListExampleTheme
import com.scs.contactlistexample.view.addContact
import com.scs.contactlistexample.view.showContacts

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ContactListExampleTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Main()
                }
            }
        }
    }
}

@Composable
fun Main() {
    val listContacts = remember {
        listOf(
            Contact("Sara", 1234),
            Contact("Susan", 5678)
        )
    }
    //addContact()
    showContacts(listContacts)
}

@Preview(showBackground = true)
@Composable
fun MainPreview() {
    ContactListExampleTheme {
        Main()
    }
}
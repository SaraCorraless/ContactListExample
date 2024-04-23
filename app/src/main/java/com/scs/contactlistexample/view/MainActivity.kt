package com.scs.contactlistexample.view

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.Observer
import com.scs.contactlistexample.navigation.NavigationHost
import com.scs.contactlistexample.ui.theme.ContactListExampleTheme
import com.scs.contactlistexample.viewmodel.ContactViewModel


class MainActivity : ComponentActivity() {

    private val contactViewModel : ContactViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        setContent {
            ContactListExampleTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {

                    contactViewModel.contact.observe(this, Observer {
                        
                    })
                    //Main()
                }
            }
        }
    }
}


@Composable
fun Main() {

   NavigationHost()
}

@Preview(showBackground = true)
@Composable
fun MainPreview() {
    ContactListExampleTheme {
        //Main(context)
    }
}

package com.scs.contactlistexample.view

import android.provider.ContactsContract.Contacts
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyItemScope
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.scs.contactlistexample.model.Contact
import com.scs.contactlistexample.navigation.ItemsMenu

@Composable
fun showContacts(): Unit {

    val listContacts = remember {
        listOf(
            Contact("Sara", 1234),
            Contact("Susan", 5678)
        )
    }
    LazyColumn(
        contentPadding = PaddingValues(horizontal = 16.dp, vertical = 8.dp)
    ){
        items (listContacts){ contact ->
            cardContact(contact = contact)
        }
    }
}

@Composable
fun cardContact(contact: Contact): Unit{
    val context = LocalContext.current

    Card(
        modifier = Modifier
            .padding(horizontal = 12.dp, vertical = 12.dp)
            .fillMaxWidth(), /*contentColor = Color.White,*/ shape = RoundedCornerShape(corner = CornerSize(16.dp)), /*elevation = 4.dp,*/ /*backgroundColor = Color.DarkGray*/
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(20.dp),
            Arrangement.Center
        ) {
            Text(
                text = contact.name,
                style = TextStyle(
                    color = Color.White,
                    fontSize = 20.sp,
                ),
                modifier = Modifier.align(Alignment.CenterHorizontally)
            )

            Text(
                text = contact.number.toString(),
                style = TextStyle(
                    color = Color.White,
                    fontSize = 16.sp
                ),
                modifier = Modifier.align(Alignment.CenterHorizontally)
            )

        }
    }
}
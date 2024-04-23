package com.scs.contactlistexample.navigation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountBox
import androidx.compose.material.icons.filled.Add
import androidx.compose.ui.graphics.vector.ImageVector
import java.util.Objects

data class ItemsMenu (val route: String, val title: String, val icon: ImageVector)

val listOfItemsMenu = listOf<ItemsMenu>(
    ItemsMenu(Screens.ListConstact.name, "Contacts", Icons.Filled.AccountBox),
    ItemsMenu(Screens.AddContact.name, "Add", Icons.Filled.Add)

)
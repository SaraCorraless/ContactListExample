package com.scs.contactlistexample.navigation

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.navigation.NavDestination.Companion.hierarchy
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.scs.contactlistexample.view.addContact
import com.scs.contactlistexample.view.showContacts




@Composable
fun NavigationHost() {
    val navHostController = rememberNavController()

    Scaffold(
        bottomBar = {
            NavigationBar {
                val navBackStackEntry by navHostController.currentBackStackEntryAsState()
                val currentDestination = navBackStackEntry?.destination

                listOfItemsMenu.forEach{ navItem ->
                    NavigationBarItem(
                        selected = currentDestination?.hierarchy?.any{ it.route == navItem.route} == true,
                        onClick = {
                            navHostController.navigate(navItem.route){
                                popUpTo(navHostController.graph.findStartDestination().id){
                                    saveState = true
                                }
                                launchSingleTop = true
                                restoreState = true
                            }
                        },
                        icon = {
                            Icon(
                                imageVector = navItem.icon,
                                contentDescription = null
                            )
                        },
                        label = {
                            Text(text = navItem.title)
                        }
                    )
                }
            }
        }
    ){paddingValues ->
        NavHost(navController = navHostController,
            startDestination = Screens.ListConstact.name,
            Modifier.padding(paddingValues)
        ) {
            composable(Screens.AddContact.name){
                addContact()

            }
            composable(Screens.ListConstact.name){
                showContacts()
            }
        }
    }
}

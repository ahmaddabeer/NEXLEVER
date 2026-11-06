package com.example.nexlever.presentation.navdrawer

import android.R.attr.data
import android.content.Intent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.DrawerState
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.ModalDrawerSheet
import androidx.compose.material3.ModalNavigationDrawer
import androidx.compose.material3.NavigationDrawerItem
import androidx.compose.material3.NavigationDrawerItemDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.core.net.toUri
import coil3.toCoilUri
import com.example.nexlever.R

@Composable
fun NavDrawer(drawerState: DrawerState) {


    val isSelected = remember { mutableStateOf(false) }
    var selectedItem = remember { mutableStateOf(0) }


    val navDrawertext = listOf("Nexus", "Blog", "Tasks", "Proof", "Internship")
    val urllist = listOf(
        "https://www.nexlevr.app/",
        "https://www.nexlevr.app/blog",
        "https://www.nexlevr.app/tasks",
        "https://www.nexlevr.app/proof",
        "https://www.nexlevr.app/proof"
    )

    val context = LocalContext.current
    ModalNavigationDrawer(
        drawerState = drawerState,
        gesturesEnabled = true,
        drawerContent = {

            ModalDrawerSheet {

                Box(
                    modifier = Modifier
                        .background(color = Color(0xFF0F0F10))
                        .fillMaxSize()

                ) {


                    Column(
                        modifier = Modifier.fillMaxSize(),

                        ) {

                        Image(
                            painter = painterResource(R.drawable.nexlevr_mark),
                            contentDescription = "",
                            modifier = Modifier
                                .size(50.dp)
                                .padding(top = 20.dp, start = 15.dp)
                        )

                        Spacer(modifier = Modifier.height(10.dp))

                        navDrawertext.forEachIndexed { index, name ->

                            NavigationDrawerItem(

                                modifier = if (selectedItem.value == index) Modifier
                                    .padding(
                                        horizontal = 8.dp
                                    )
                                    .border(
                                        1.dp,
                                        color = Color(0xFF2C2C2E),
                                        shape = RoundedCornerShape(12.dp)
                                    ) else Modifier.border(1.dp, color = Color.Transparent),
                                label = {
                                    Text(
                                        text = name,
                                        style = MaterialTheme.typography.titleMedium,
                                        color = Color(0xFFFAFBFA)
                                    )
                                },
                                selected = index == selectedItem.value,


                                onClick = {
                                    selectedItem.value = index










//
                                },


                                shape = RoundedCornerShape(12.dp),


                                colors = NavigationDrawerItemDefaults.colors(

                                    selectedContainerColor = Color(0xFF131215),
                                    selectedTextColor = Color.White,

                                    unselectedTextColor = Color(0xD2979A97),
                                ),


                                )
                        }


                    }

                }


            }
        }
    ) {


    }

}


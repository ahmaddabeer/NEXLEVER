package com.example.nexlever.presentation.ui.mainscreen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.DrawerValue
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.rememberDrawerState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.nexlever.R
import com.example.nexlever.presentation.navdrawer.NavDrawer
import kotlinx.coroutines.launch

@Composable
fun MainScreenTopItem(show:()-> Unit) {





    Box(
        modifier = Modifier
            .fillMaxWidth()
            .background(color = Color(0xFF0D0D0D))
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .height(90.dp)
                .padding(16.dp)
                .border(width = 1.dp, color = Color(0xFF2C2C2E), shape = RoundedCornerShape(12.dp))
                .background(color = Color(0xFF141417), shape = RoundedCornerShape(12.dp)),

            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {

            Image(
                painter = painterResource(R.drawable.nexlevr_mark),
                contentDescription = "nexlevr_mark",
                modifier = Modifier
                    .padding(start = 12.dp)
                    .size(40.dp)


            )



            Box(
                modifier = Modifier
                    .padding(end = 10.dp)
                    .height(40.dp)
                    .width(40.dp)

                    .background(
                        color = Color(0xFF28282A),
                        shape = RoundedCornerShape(12.dp)
                    )
                    .border(
                        width = 1.dp,
                        color = Color(0xFF3D3D3F),
                        shape = RoundedCornerShape(16.dp)
                    ),
                contentAlignment = Alignment.Center

            ) {

                IconButton(onClick = {

                    show()


                }) {

                    Icon(imageVector = Icons.Default.Menu, "Menu", tint = Color.White)
                }


            }


        }

    }

}

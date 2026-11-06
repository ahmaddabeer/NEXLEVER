package com.example.nexlever.presentation.ui.mainscreen.ScreenPart.screenpart2

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.unit.dp
import coil.compose.rememberImagePainter

@Composable
fun AnimatedCardForScreen2(item: String) {


    Card(
        modifier = Modifier
            .height(100.dp)
            .width(180.dp),
        colors = CardDefaults.cardColors(
            containerColor = Color(0xFF1D1D1D)
        ),
        shape = RectangleShape
    ) {

        Box(
            modifier = Modifier.fillMaxSize(),

            contentAlignment = Alignment.Center
            ) {

            Image(modifier = Modifier.padding(horizontal = 16.dp),


                painter = rememberImagePainter(item),
                contentDescription = "Project's"
            )
        }


    }


}
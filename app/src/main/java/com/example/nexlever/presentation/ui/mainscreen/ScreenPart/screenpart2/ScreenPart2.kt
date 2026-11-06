package com.example.nexlever.presentation.ui.mainscreen.ScreenPart.screenpart2

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.nexlever.data.VideoUrl

@Composable
fun ScreenPart2(videoUrl: List<VideoUrl>) {

    val color = arrayOf(
        0.8f to Color(0xFF0d0c0c),
        0.2f to Color.Yellow
    )

    val textGradient = listOf(Color.Yellow, Color.Red)

    val projectImage = listOf(
        "https://www.nexlevr.app/projects/project-01.png",
        "https://www.nexlevr.app/projects/project-02.png",
        "https://www.nexlevr.app/projects/project-03.png",
        "https://www.nexlevr.app/projects/project-04.png",
        "https://www.nexlevr.app/projects/project-05.png",
        "https://www.nexlevr.app/projects/project-06.png",
        "https://www.nexlevr.app/projects/project-07.png",
        "https://www.nexlevr.app/projects/project-08.png",
        "https://www.nexlevr.app/projects/project-09.png",
        "https://www.nexlevr.app/projects/project-10.png",
        "https://www.nexlevr.app/projects/project-11.png",
        "https://www.nexlevr.app/projects/project-12.png",
        "https://www.nexlevr.app/projects/project-13.png",
        "https://www.nexlevr.app/projects/project-14.png",
        "https://www.nexlevr.app/projects/project-15.png",
        "https://www.nexlevr.app/projects/project-16.png",
        "https://www.nexlevr.app/projects/project-17.png",
        "https://www.nexlevr.app/projects/project-18.png",
        "https://www.nexlevr.app/projects/project-19.png",
        "https://www.nexlevr.app/projects/project-20.png",
        "https://www.nexlevr.app/projects/project-21.png",
        "https://www.nexlevr.app/projects/project-22.png",
        "https://www.nexlevr.app/projects/project-23.png",
        "https://www.nexlevr.app/projects/project-24.png",
        "https://www.nexlevr.app/projects/project-25.png",
        "https://www.nexlevr.app/projects/project-26.png",
        "https://www.nexlevr.app/projects/project-27.png"
    )



    Box(
        modifier = Modifier

            .fillMaxWidth()
            .height(580.dp)
            .background(
                Brush.verticalGradient(

                    0.0f to Color(0xFF0D0D0D),
                    0.7f to Color(0xFF0D0D0D), // 70% tak pura kala
                    1.0f to Color(0xFF25200C)


                )
            )
            .padding(top = 25.dp)


    )
    {
        Canvas(modifier = Modifier.fillMaxSize()) {
            val gridSize = 50.dp.toPx() // हर ग्रिड बॉक्स का साइज़
            val lineColor = Color.White.copy(alpha = 0.15f) // हल्की पारदर्शी लाइन्स
            val strokeWidth = 1.dp.toPx()

            // 1. वर्टिकल लाइन्स (खड़ी लाइन्स) खींचना
            var x = 0f
            while (x < size.width) {
                drawLine(
                    color = lineColor,
                    start = Offset(x, 0f),
                    end = Offset(x, size.height),
                    strokeWidth = strokeWidth
                )
                x += gridSize
            }

            // 2. हॉरिजॉन्टल लाइन्स (आड़ी लाइन्स) खींचना
            var y = 0f
            while (y < size.height) {
                drawLine(
                    color = lineColor,
                    start = Offset(0f, y),
                    end = Offset(size.width, y),
                    strokeWidth = strokeWidth
                )
                y += gridSize
            }
        }

        Column(
            modifier = Modifier
                .fillMaxSize()
        ) {

            Spacer(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(28.dp)
            )
            Spacer(
                modifier = Modifier

                    .padding(start = 16.dp)
                    .height(2.dp)
                    .width(40.dp)
                    .background(
                        brush = Brush.horizontalGradient(
                            listOf(
                                Color.Yellow,
                                Color.Red,
                                Color.Magenta,
                                Color.Blue

                            )
                        )
                    )
            )

            Spacer(modifier = Modifier.height(10.dp))
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 16.dp)
                ,

                verticalAlignment = Alignment.CenterVertically,
            ) {

                Text(
                    text = "Build to ",
                    style = MaterialTheme.typography.titleLarge,
                    color = Color.White
                )
                Text(
                    text = "move.", style = TextStyle(

                        brush = Brush.horizontalGradient(
                            listOf(
                                Color.Yellow,
                                Color.Red,
                                Color.Magenta,
                                Color.Blue
                            )

                        ),
                        fontSize = 25.sp
                    )
                )
            }


            //show projecte's

            Spacer(modifier = Modifier.height(16.dp))
            Column(
                modifier = Modifier.fillMaxWidth(),
                verticalArrangement = Arrangement.spacedBy(16.dp)
            ) {

                LazyRow(horizontalArrangement = Arrangement.spacedBy(12.dp)) {

                    projectImage.forEach { item ->

                        item {

                            AnimatedCardForScreen2(item)


                        }
                    }

                }
                LazyRow(horizontalArrangement = Arrangement.spacedBy(12.dp)) {

                    projectImage.forEach { item ->

                        item {

                            AnimatedCardForScreen2(item)


                        }
                    }

                }
                LazyRow(horizontalArrangement = Arrangement.spacedBy(12.dp)) {

                    projectImage.forEach { item ->

                        item {

                            AnimatedCardForScreen2(item)


                        }
                    }

                }
                LazyRow(horizontalArrangement = Arrangement.spacedBy(12.dp)) {

                    projectImage.forEach { item ->

                        item {

                            AnimatedCardForScreen2(item)


                        }
                    }

                }
            }


        }
    }

}
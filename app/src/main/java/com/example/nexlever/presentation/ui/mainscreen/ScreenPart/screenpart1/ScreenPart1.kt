package com.example.nexlever.presentation.ui.mainscreen.ScreenPart.screenpart1

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyListState
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.unit.dp
import com.example.nexlever.data.VideoUrl
import com.example.nexlever.presentation.ui.mainscreen.cardmobile.Lazy_row_auto_scroll

@Composable
fun ScreenPart1(
    videoUrl: List<VideoUrl>,
    bg: Color,
    bg2: Color,
    bg3: Color,
    listState: LazyListState
) {


    val textGradient = listOf(Color.Yellow, Color.Red)



    Box(
        modifier = Modifier

            .fillMaxWidth()
            .height(550.dp)
            .background(
                brush = Brush.verticalGradient(
                    colors = listOf(bg, bg2, bg3) // डार्क बैकग्राउंड कलर्स
                )
            ),


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

            Column(
                modifier = Modifier
                    .padding(horizontal = 16.dp, vertical = 20.dp)
            )
            {
                Text(
                    text = "Rebuilding \n Systems ",
                    style = MaterialTheme.typography.displayMedium,
                    color = Color.White
                )
                Text(
                    text = " for the Next \n Generation ",
                    style = MaterialTheme.typography.displaySmall.copy(
                        brush = Brush.horizontalGradient(colors = textGradient),
                        fontStyle = FontStyle.Italic

                    ),

                    )
                Spacer(modifier = Modifier.height(8.dp))

                Text(
                    text = "Nexlevr is an AI studio that helps businesses build, launch, and grow while students learn by building real products for the future of work.",
                    style = MaterialTheme.typography.bodyMedium.copy(
                        color = Color(0xFFD7D1CC),

                        ),
                    modifier = Modifier.padding(horizontal = 8.dp)
                )

            }



            Spacer(modifier = Modifier.height(8.dp))

            Lazy_row_auto_scroll(videoUrl)

        }
    }
}


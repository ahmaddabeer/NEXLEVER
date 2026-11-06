package com.example.nexlever.presentation.ui.mainscreen.ScreenPart.screenpart3.card

import android.graphics.BlurMaskFilter
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowRightAlt
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Paint
import androidx.compose.ui.graphics.drawscope.drawIntoCanvas
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp

@Composable
fun Part3Card() {

    Card(
        modifier = Modifier
            .fillMaxWidth()
            .height(250.dp)
            // drawBehind ka use karke hum neeche ki taraf red glow paint karenge
            .drawBehind {
                val shadowColor = Color.Red.copy(alpha = 0.5f) // Red shadow ka color aur opacity
                val blurRadius = 40.dp.toPx() // Kitna zyada failana (blur) hai
                val offsetY = 15.dp.toPx()  // Niche ki side kitna zyada nikalna hai

                val paint = Paint().apply {
                    val frameworkPaint = asFrameworkPaint()
                    frameworkPaint.color = shadowColor.toArgb()
                    // Blur effect apply karne ke liye
                    frameworkPaint.maskFilter = BlurMaskFilter(
                        blurRadius,
                        BlurMaskFilter.Blur.NORMAL
                    )
                }

                drawIntoCanvas { canvas ->
                    // Card ke thoda neeche (offsetY) hum ek red shape draw kar rahe hain jo shadow banegi
                    canvas.drawRoundRect(
                        left = 0f,
                        top = offsetY,
                        right = size.width,
                        bottom = size.height + offsetY,
                        radiusX = 24.dp.toPx(), // Card ka corner radius
                        radiusY = 24.dp.toPx(),
                        paint = paint
                    )
                }
            },
        shape = RoundedCornerShape(24.dp),
        colors = CardDefaults.cardColors(
            containerColor = Color(0xFF1E1E24) // Card ka dark background color jaise image me hai
        ),
        elevation = CardDefaults.cardElevation(0.dp) // Default flat elevation taaki purani shadow na dikhe
    ) {

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(start = 26.dp),
            verticalArrangement = Arrangement.SpaceEvenly,

            ) {

            Text(
                "THE  NEXT  ERA  IS  HANDS-ON",
                color = Color.Yellow,
                style = MaterialTheme.typography.bodySmall
            )

            Row(modifier = Modifier.fillMaxWidth()) {

                Text(
                    text = "Build what's ",
                    color = Color.White,
                    style = MaterialTheme.typography.headlineLarge,
                    fontWeight = FontWeight.Bold
                )
                Text(
                    text = "next. ",
                    color = Color.Red,
                    style = MaterialTheme.typography.headlineLarge,
                    fontWeight = FontWeight.Bold
                )


            }

            Button(
                onClick = {},
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color.White
                ),
                modifier = Modifier
                    .width(200.dp)
            ) {
                Row() {

                    Text(text = "SEE THE PROOF ", color = Color.Black, fontWeight = FontWeight.Bold)
                    Icon(
                        imageVector = Icons.Default.ArrowRightAlt,
                        contentDescription = "ArrowrightAlt",
                        tint = Color.Black,
                    )
                }


            }

            Button(
                onClick = {},
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color.Transparent,


                    ), modifier = Modifier

                    .border(1.dp, color = Color.LightGray, shape = RoundedCornerShape(30.dp))

                    .width(220.dp)
            ) {
                Row() {

                    Text(
                        text = "START A CONVERSATION ",
                        color = Color.White,
                        fontWeight = FontWeight.Bold
                    )

                }


            }
        }
    }

}
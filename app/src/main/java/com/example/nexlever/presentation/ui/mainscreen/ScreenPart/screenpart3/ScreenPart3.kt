package com.example.nexlever.presentation.ui.mainscreen.ScreenPart.screenpart3

import android.content.Intent
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Circle
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.WatchLater
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.core.content.ContextCompat.startActivity
import coil3.toUri
import com.example.nexlever.MainActivity
import com.example.nexlever.R
import com.example.nexlever.presentation.ui.mainscreen.ScreenPart.screenpart3.card.Part3Card

@Composable
fun ScreenPart3(color: Color) {


    val textGradient = listOf(Color.Yellow, Color.Red)
    val context = LocalContext.current



    Spacer(
        modifier = Modifier
            .fillMaxWidth()
            .height(2.dp)
            .background(
                brush = Brush.horizontalGradient(
                    listOf(
                        Color.Red.copy(alpha = 0.5f),
                        Color.Yellow.copy(0.5f),
                        Color.White.copy(0.5f),
                        Color.Blue.copy(0.5f)
                    )
                )
            )
    )
    Box(
        modifier = Modifier

            .fillMaxWidth()
            .background(
                color = color
            ),


        ) {
        Canvas(
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight(0.3f)
        ) {
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
                .padding(horizontal = 16.dp, vertical = 20.dp)
        ) {

            Part3Card()

            Spacer(modifier = Modifier.height(26.dp))
            Image(
                painter = painterResource(R.drawable.nexlogo),
                contentDescription = "",
                modifier = Modifier
                    .size(40.dp)
//                    .background(
//                        Color(0xFFEEEEEE),
//                        shape = RectangleShape
//                    )
            )
            Spacer(modifier = Modifier.height(16.dp))

            Text(
                text = "AI studio for business systems and practical learning.",
                color = Color.LightGray
            )
            Spacer(modifier = Modifier.height(16.dp))


            // Linkdin

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(16.dp)
            ) {

                Box(
                    modifier = Modifier
                        .height(50.dp)
                        .width(50.dp)
                        .background(
                            color = Color(0xFF141416),
                            shape = RoundedCornerShape(16.dp)
                        )
                        .border(
                            width = 1.dp,
                            color = Color(0xFF2C2C2D),
                            shape = RoundedCornerShape(16.dp)
                        ) .clickable{
                            val intent = Intent(
                                Intent.ACTION_VIEW).apply{

                                data = android.net.Uri.parse("https://www.linkedin.com/company/nexlevr/home/")


                            }
                            context.startActivity(intent)


                        },
                    contentAlignment = Alignment.Center

                ) {

                    Image(
                        painter = painterResource(id = R.drawable.linkedin_logo_svgrepo_com),
                        contentDescription = "linkdin",
                        modifier = Modifier.size(24.dp)
                    )


                }

                //Instagram

                Box(
                    modifier = Modifier
                        .height(50.dp)
                        .width(50.dp)
                        .background(
                            color = Color(0xFF141416),
                            shape = RoundedCornerShape(16.dp)
                        )
                        .border(
                            width = 1.dp,
                            color = Color(0xFF2C2C2D),
                            shape = RoundedCornerShape(16.dp)
                        ) .clickable{
                            val intent = Intent(
                                Intent.ACTION_VIEW).apply{

                                data = android.net.Uri.parse("https://www.instagram.com/nexlevr/")


                            }
                            context.startActivity(intent)


                        },
                    contentAlignment = Alignment.Center

                ) {

                    Image(
                        painter = painterResource(id = R.drawable.instagram),
                        contentDescription = "linkdin",
                        modifier = Modifier.size(24.dp)

                    )


                }

                // Youtube


                Box(
                    modifier = Modifier
                        .height(50.dp)
                        .width(50.dp)
                        .background(
                            color = Color(0xFF141416),
                            shape = RoundedCornerShape(16.dp)
                        )
                        .border(
                            width = 1.dp,
                            color = Color(0xFF2C2C2D),
                            shape = RoundedCornerShape(16.dp)
                        ).clickable{
                            val intent = Intent(
                                Intent.ACTION_VIEW).apply{

                                data = android.net.Uri.parse("https://www.youtube.com/@janeeshpemmasani")


                            }
                            context.startActivity(intent)


                        },
                    contentAlignment = Alignment.Center

                ) {

                    Image(
                        painter = painterResource(id = R.drawable.youtube),
                        contentDescription = "linkdin",
                        modifier = Modifier.size(24.dp)
                    )


                }

                // Whatsapp

                Box(
                    modifier = Modifier
                        .height(50.dp)
                        .width(50.dp)
                        .background(
                            color = Color(0xFF141416),
                            shape = RoundedCornerShape(16.dp)
                        )
                        .border(
                            width = 1.dp,
                            color = Color(0xFF2C2C2D),
                            shape = RoundedCornerShape(16.dp)
                        ).clickable{
                            val intent = Intent(
                                Intent.ACTION_VIEW).apply{

                                data = android.net.Uri.parse("https://api.whatsapp.com/send/?phone=917603914829&text=Hi+NexLevr&type=phone_number&app_absent=0")


                            }
                            context.startActivity(intent)


                        },
                    contentAlignment = Alignment.Center

                ) {

                    Image(
                        painter = painterResource(id = R.drawable.whatsapp),
                        contentDescription = "linkdin",
                        modifier = Modifier.size(24.dp)
                    )


                }


            }

            Spacer(modifier = Modifier.height(20.dp))

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(10.dp),
                Alignment.CenterVertically
            )
            {

                Text(
                    text = "EXPLORE",
                    color = Color.Yellow,
                    style = MaterialTheme.typography.bodyLarge
                )

                Spacer(
                    modifier = Modifier
                        .width(30.dp)
                        .height(1.dp)
                        .background(
                            brush = Brush.horizontalGradient(
                                listOf(
                                    Color(
                                        0xFF615C21),Color(0xFF0A0A0D)
                                )
                            )
                        )
                )


            }
            Spacer(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(20.dp)
            )


            Column(verticalArrangement = Arrangement.spacedBy(12.dp)) {

                Text(text = "\u2022 Nexus", color = Color(0xFF9E9EA8))
                Text(text = "\u2022 Proof", color = Color(0xFF9E9EA8))
                Text(text = "\u2022 Blog", color = Color(0xFF9E9EA8))
                Text(text = "\u2022 Tasks", color = Color(0xFF9E9EA8))
                Text(text = "\u2022 Internship", color = Color(0xFF9E9EA8))

            }


            Spacer(modifier = Modifier.height(20.dp))
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(10.dp),
                Alignment.CenterVertically
            )
            {

                Text(
                    text = "CONTACT",
                    color = Color.Yellow,
                    style = MaterialTheme.typography.bodyLarge
                )

                Spacer(
                    modifier = Modifier
                        .width(30.dp)
                        .height(1.dp)
                        .background(
                            brush = Brush.horizontalGradient(
                                listOf(
                                    Color(
                                        0xFF615C21),Color(0xFF0A0A0D)
                                )
                            )
                        )
                )


            }
            Spacer(modifier = Modifier.height(20.dp))


            Text(
                text = "Question, sponsorships, or project collaborations.",
                color = Color(0xFF9E9EA8)
            )
            Spacer(modifier = Modifier.height(16.dp))

            Button(
                onClick = {},
                modifier = Modifier
                    .wrapContentWidth(), colors = ButtonDefaults.buttonColors(
                    containerColor = Color(0xFF1B1B26)
                ),
                shape = RoundedCornerShape(16.dp)
            ) {

                Row(verticalAlignment = Alignment.CenterVertically) {

                    Icon(
                        imageVector = Icons.Default.Email,
                        contentDescription = "gmail",
                        tint = Color.Red,
                        modifier = Modifier.size(20.dp)
                    )
                    Spacer(modifier = Modifier.width(10.dp))
                    Text(text = "nextlevr@gmail.com", color = Color.White)
                }

            }

            Spacer(modifier = Modifier.height(16.dp))

            Row(verticalAlignment = Alignment.CenterVertically) {

                Icon(
                    imageVector = Icons.Default.WatchLater,
                    contentDescription = "gmail",
                    tint = Color(0xFF9E9EA8),
                    modifier = Modifier.size(15.dp)
                )
                Spacer(modifier = Modifier.width(8.dp))
                Text(
                    text = "We reply within 24 hours",
                    color = Color(0xFF9E9EA8),
                    style = MaterialTheme.typography.bodySmall
                )
            }
            Spacer(modifier = Modifier.height(16.dp))

            Row(verticalAlignment = Alignment.CenterVertically) {

                Icon(
                    imageVector = Icons.Default.Circle,
                    contentDescription = "gmail",
                    tint = Color(0xFF9E9EA8),
                    modifier = Modifier.size(15.dp)
                )
                Spacer(modifier = Modifier.width(8.dp))
                Text(
                    text = "Remote-first team, global community.",
                    color = Color(0xFF9E9EA8),
                    style = MaterialTheme.typography.bodySmall
                )
            }


        }
    }

}

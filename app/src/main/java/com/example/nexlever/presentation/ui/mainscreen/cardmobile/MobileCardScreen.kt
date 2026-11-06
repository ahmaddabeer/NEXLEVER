package com.example.nexlever.presentation.ui.mainscreen.cardmobile

import androidx.annotation.OptIn
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import androidx.compose.ui.viewinterop.AndroidView
import androidx.media3.common.MediaItem
import androidx.media3.common.util.UnstableApi
import androidx.media3.exoplayer.ExoPlayer
import androidx.media3.ui.AspectRatioFrameLayout
import androidx.media3.ui.PlayerView
import com.example.nexlever.data.VideoUrl

@OptIn(UnstableApi::class)
@Composable
fun MobileCardScreen(url: VideoUrl) {


    val context = LocalContext.current


    val exoPlayer = remember(context) {

        ExoPlayer.Builder(context).build().apply {

            val mediaItem = MediaItem.fromUri(url.url)
            setMediaItem(mediaItem)
            prepare()
            volume  = 0f
            playWhenReady = true // auto play when loaded
        }
    }


    Card(
        modifier = Modifier
            .width(100.dp)
            .height(150.dp)
            .padding(horizontal = 8.dp)
            ,
        shape = RoundedCornerShape(16.dp),
        border = BorderStroke(1.dp, Color.White),
        elevation = CardDefaults.cardElevation(
            defaultElevation = 4.dp
        )
    ) {
        AndroidView(

            factory = { ctx ->
                PlayerView(ctx).apply {
                    player = exoPlayer
                    useController = false
                    resizeMode = AspectRatioFrameLayout.RESIZE_MODE_FIXED_HEIGHT

                }
            }, modifier = Modifier.fillMaxSize()

        )


    }


}


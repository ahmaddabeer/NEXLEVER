package com.example.nexlever.presentation.ui.mainscreen.cardmobile

import androidx.compose.foundation.gestures.scrollBy
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.graphicsLayer
import com.example.nexlever.data.VideoUrl
import kotlin.time.Duration.Companion.milliseconds

@Composable
fun Lazy_row_auto_scroll(
    videoUrl: List<VideoUrl>
) {
    if (videoUrl.isEmpty()) return

    val startIndex = Int.MAX_VALUE / 2
    val alignedStartIndex =
        startIndex - (startIndex % videoUrl.size)

    val listState = rememberLazyListState(
        initialFirstVisibleItemIndex = alignedStartIndex
    )

    // Automatic continuous scrolling
    LaunchedEffect(listState) {
        while (true) {
            listState.scrollBy(1f)
            kotlinx.coroutines.delay(16L.milliseconds)
        }
    }

    LazyRow(
        modifier = Modifier
            .fillMaxSize()
            .graphicsLayer(rotationZ = -5f),
        userScrollEnabled = false,
        state = listState,
    ) {
        items(
            count = Int.MAX_VALUE,
            key = { it }
        ) { index ->

            val videoUrl = videoUrl[index % videoUrl.size]

            // Yahan apna existing mobile card UI lagao
            MobileCardScreen(videoUrl)
        }
    }
}
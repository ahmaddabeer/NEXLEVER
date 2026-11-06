package com.example.nexlever.presentation.ui.mainscreen

import androidx.compose.foundation.gestures.scrollBy
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview(showSystemUi = true)
@Composable
fun MovieRow() {

    val listState = rememberLazyListState()

    val movies = listOf(
        "Avengers",
        "Iron Man",
        "Batman",
        "Spider-Man",
        "Superman",
        "Thor"
    )

    LaunchedEffect(Unit) {
        while (true) {
            listState.scrollBy(1f)
            kotlinx.coroutines.delay(16)
        }
    }

    LazyRow(
        state = listState
    ) {
        items(
            count = movies.size,
            key = { it }
        ) { index ->

            Card(
                modifier = Modifier
                    .padding(8.dp)
                    .size(180.dp, 120.dp)
            ) {
                Box(
                    contentAlignment = Alignment.Center
                ) {
                    Text(movies[index])
                }
            }
        }
    }
}

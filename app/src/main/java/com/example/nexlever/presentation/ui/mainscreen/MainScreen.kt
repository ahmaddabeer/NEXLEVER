package com.example.nexlever.presentation.ui.mainscreen

import androidx.compose.foundation.background
import androidx.compose.foundation.gestures.scrollBy
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.material3.DrawerValue
import androidx.compose.material3.Scaffold
import androidx.compose.material3.rememberDrawerState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.nexlever.data.VideoUrlRepository
import com.example.nexlever.presentation.navdrawer.NavDrawer
import com.example.nexlever.presentation.ui.mainscreen.ScreenPart.screenpart1.ScreenPart1
import com.example.nexlever.presentation.ui.mainscreen.ScreenPart.screenpart2.ScreenPart2
import com.example.nexlever.presentation.ui.mainscreen.ScreenPart.screenpart3.ScreenPart3
import kotlinx.coroutines.launch
import kotlin.time.Duration.Companion.milliseconds

@Composable
fun MainScreen(controller: NavHostController) {

    val drawerState = rememberDrawerState(initialValue = DrawerValue.Closed)
    val scrope = rememberCoroutineScope()

    val listState = rememberLazyListState()
    val context = LocalContext.current
    val videoUrl = remember {

        VideoUrlRepository(context).getVideoUrl()
    }





    //mobile card contineous running using louchedeffect

    LaunchedEffect(Unit) {
        while (true) {
            listState.scrollBy(1f)
            kotlinx.coroutines.delay(16.milliseconds)
        }
    }


    Scaffold(
        modifier = Modifier.fillMaxSize()
    ) { innerPadding ->


        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding)
        ) {


            MainScreenTopItem( {scrope.launch { drawerState.apply { if(isClosed) open() else close() }} })




            LazyColumn(modifier = Modifier.fillMaxSize()) {

                item {


                    ScreenPart1(
                        videoUrl,
                        Color(0xFF351525),
                        Color(0xFF171A3D),
                        Color(0xFF0B1533),
                        listState
                    )
                    ScreenPart2(videoUrl)
                    Spacer(
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(50.dp)
                            .background(color = Color(0xFF0D0D0D))
                    )

                    ScreenPart3(Color(0xFF0d0c0c))


                }


            }
        }


    }

    Box(modifier = Modifier.fillMaxWidth(0.5f).fillMaxHeight()){

        NavDrawer(drawerState)
    }

}




package com.example.nexlever.data

import android.content.Context
import kotlinx.serialization.json.Json
import org.json.JSONStringer

class VideoUrlRepository(
    private val context: Context
){



    fun getVideoUrl(): List<VideoUrl>{

        val jsonString = context.assets
            .open("videourl.json")
            .bufferedReader()
            .use {


                it.readText()
            }


        return  Json.decodeFromString(jsonString)
    }



}
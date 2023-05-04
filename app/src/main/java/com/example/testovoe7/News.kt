package com.example.testovoe7

import com.google.gson.annotations.SerializedName

data class News (

    @SerializedName("title") val title : String,
    @SerializedName("image") val image : String,
    @SerializedName("text") val text : String
)
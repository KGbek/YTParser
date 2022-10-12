package com.example.ytparser.model


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Medium(
    @SerialName("url")
    val url: String,
    @SerialName("width")
    val width: Int,
    @SerialName("height")
    val height: Int
)
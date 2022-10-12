package com.example.ytparser.model


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Snippet(
    @SerialName("publishedAt")
    val publishedAt: String,
    @SerialName("channelId")
    val channelId: String,
    @SerialName("title")
    val title: String,
    @SerialName("description")
    val description: String,
    @SerialName("thumbnails")
    val thumbnails: Thumbnails,
    @SerialName("channelTitle")
    val channelTitle: String,
    @SerialName("localized")
    val localized: Localized
)
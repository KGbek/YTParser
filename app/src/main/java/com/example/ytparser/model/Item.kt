package com.example.ytparser.model


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Item(
    @SerialName("kind")
    val kind: String,
    @SerialName("etag")
    val etag: String,
    @SerialName("id")
    val id: String,
    @SerialName("snippet")
    val snippet: Snippet,
    @SerialName("contentDetails")
    val contentDetails: ContentDetails
)
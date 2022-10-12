package com.example.ytparser.model


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class YouTubeApiResponse(
    @SerialName("kind")
    val kind: String,
    @SerialName("etag")
    val etag: String,
    @SerialName("nextPageToken")
    val nextPageToken: String,
    @SerialName("pageInfo")
    val pageInfo: PageInfo,
    @SerialName("items")
    val items: List<Item>
)
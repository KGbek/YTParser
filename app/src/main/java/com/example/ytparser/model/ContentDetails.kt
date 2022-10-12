package com.example.ytparser.model


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class ContentDetails(
    @SerialName("itemCount")
    val itemCount: Int
)
package com.example.ytparser.model


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Localized(
    @SerialName("title")
    val title: String,
    @SerialName("description")
    val description: String
)
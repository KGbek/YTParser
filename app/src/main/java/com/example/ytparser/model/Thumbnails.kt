package com.example.ytparser.model


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Thumbnails(
    @SerialName("default")
    val default: Default,
    @SerialName("medium")
    val medium: Medium,
    @SerialName("high")
    val high: High,
    @SerialName("standard")
    val standard: Standard,
    @SerialName("maxres")
    val maxres: Maxres
)
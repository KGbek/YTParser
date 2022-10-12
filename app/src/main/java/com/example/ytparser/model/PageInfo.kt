package com.example.ytparser.model


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class PageInfo(
    @SerialName("totalResults")
    val totalResults: Int,
    @SerialName("resultsPerPage")
    val resultsPerPage: Int
)
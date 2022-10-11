package com.example.ytparser.network.apiservice

import retrofit2.http.GET
import retrofit2.http.Query

interface YouTubeApiService {

    @GET("playlists")
    fun fetchPlaylists(
        @Query("part") part: String,
        @Query("channelId") id: String,
        @Query("maxResults") maxResult: Int,
        @Query("key") Apikey: String
    )
}
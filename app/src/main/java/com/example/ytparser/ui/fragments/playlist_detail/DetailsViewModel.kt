package com.example.ytparser.ui.fragments.playlist_detail

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.example.ytparser.core.Resource
import com.example.ytparser.model.YouTubeApiResponse
import com.example.ytparser.repository.Repository

class DetailsViewModel(private val repository: Repository): ViewModel() {

    fun fetchPlaylistItems(playlistId:String): LiveData<Resource<YouTubeApiResponse>>{
        return repository.fetchPlaylistItems(playlistId)
    }
}
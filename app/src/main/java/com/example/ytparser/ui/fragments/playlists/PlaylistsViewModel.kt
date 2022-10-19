package com.example.ytparser.ui.fragments.playlists

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.example.ytparser.core.Resource
import com.example.ytparser.model.YouTubeApiResponse
import com.example.ytparser.repository.Repository

class PlaylistsViewModel(private val repository: Repository): ViewModel() {

    fun fetchPlaylists() : LiveData<Resource<YouTubeApiResponse>> {
        return repository.fetchPlaylists()
    }
}

/*
private val _playlists = MutableLiveData<UIState<YouTubeApiResponse>>()
val playlists = _playlists as LiveData<UIState<YouTubeApiResponse>>
fun fetchPlaylists() {
        when(val response = repository.fetchPlaylists().value) {
            is Resource.Loading ->  {
                _playlists.value = UIState.Loading()
            }
            is Resource.Error -> {
                _playlists.value = UIState.Error(response.message.toString())
            }
            is Resource.Success -> {
                if (response.data != null) {
                    _playlists.value = UIState.Success(response.data)
                }
            }
            else -> throw RuntimeException("Data is empty")
        }
    }
 */
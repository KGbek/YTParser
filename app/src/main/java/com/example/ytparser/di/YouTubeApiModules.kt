package com.example.ytparser.di

import com.example.ytparser.network.client.provideApi
import com.example.ytparser.network.client.provideOkHttp
import com.example.ytparser.network.client.provideRetrofit
import com.example.ytparser.repository.Repository
import com.example.ytparser.ui.fragments.playlists.PlaylistsViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val youTubeAppModule = module {
    single {
        provideRetrofit(get())
    }
    factory {
        provideOkHttp()
    }
    single {
        provideApi(get())
    }
    single {
        Repository(get())
    }
    viewModel {
        PlaylistsViewModel(get())
    }
}
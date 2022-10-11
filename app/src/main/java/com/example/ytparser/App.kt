package com.example.ytparser

import android.app.Application
import com.example.ytparser.di.youTubeAppModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class App : Application() {

    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@App)
            modules(youTubeAppModule)
        }
    }
}
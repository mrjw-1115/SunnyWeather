package com.example.sunnyweather

import android.annotation.SuppressLint
import android.app.Application
import android.content.Context

class SunnyWeatherApplication : Application() {
    companion object {
        const val TOKEN = "KiiIRBpn4cC4kXtL"
        @SuppressLint("StaticFieldLeak")
        lateinit var context: Context
        }
    override fun onCreate() {
        super.onCreate()
        context = applicationContext
    }
}


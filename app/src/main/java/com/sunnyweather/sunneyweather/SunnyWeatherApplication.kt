package com.sunnyweather.sunneyweather

import android.app.Application
import android.content.Context

class SunnyWeatherApplication : Application() {
    companion object {
        lateinit var context: Context
        const val TOKEN = "t3t6NQAEfwkFCh6N"
    }

    override fun onCreate() {
        super.onCreate()
        context = applicationContext
    }
}
 package com.example.weatherapp

import android.app.Application
import com.example.weatherapp.di.components.AppComponent
import com.example.weatherapp.di.components.DaggerAppComponent

 class App: Application() {

    private lateinit var appComponent: AppComponent

    override fun onCreate() {
        initDagger()
        initInstance()
        super.onCreate()
    }

    private fun initDagger() {
        appComponent = DaggerAppComponent.builder()
            .withApplication(this)
            .build()
    }

    private fun initInstance() {
        instance = this
    }

    fun getAppComponent(): AppComponent = appComponent

    companion object {
        lateinit var instance: App
        private set
    }
}
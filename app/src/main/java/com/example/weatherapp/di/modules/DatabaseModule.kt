package com.example.weatherapp.di.modules

import android.app.Application
import androidx.room.Room
import com.example.weatherapp.data.repositories.database.WeatherDao
import com.example.weatherapp.data.repositories.database.WeatherDatabase
import com.example.weatherapp.domain.models.Weather
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class DatabaseModule {

    @Singleton
    @Provides
    fun provideDatabase(application: Application) = Room
        .databaseBuilder(application, WeatherDatabase::class.java, "WeatherDatabase")
        .build()
        .getWeatherDao()
}
package com.example.weatherapp.di.modules

import com.example.weatherapp.data.mappers.WeatherInfoMapper
import com.example.weatherapp.data.repositories.network.WeatherAPI
import com.example.weatherapp.data.repositories.WeatherRepositoryImpl
import com.example.weatherapp.data.repositories.database.WeatherDao
import com.example.weatherapp.data.repositories.database.WeatherDatabase
import com.example.weatherapp.domain.repositories.WeatherRepository
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class RepositoryModule {

    @Provides
    @Singleton
    fun provideWeatherRepository(weatherAPI: WeatherAPI,
                                 weatherInfoMapper: WeatherInfoMapper,
                                 weatherDao: WeatherDao
    ): WeatherRepository = WeatherRepositoryImpl(weatherAPI, weatherInfoMapper, weatherDao)
}
package com.example.weatherapp.di.modules

import com.example.weatherapp.data.repositories.interactor.WeatherInteractorImpl
import com.example.weatherapp.domain.interactor.WeatherInteractor
import com.example.weatherapp.domain.repositories.WeatherRepository
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class InteractorModule {

    @Singleton
    @Provides
    fun provideWeatherInteractor(weatherRepository: WeatherRepository): WeatherInteractor = WeatherInteractorImpl(weatherRepository)
}
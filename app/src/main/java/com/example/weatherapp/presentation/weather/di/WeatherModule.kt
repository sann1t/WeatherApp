package com.example.weatherapp.presentation.weather.di

import com.example.weatherapp.di.scopes.ActivityScope
import com.example.weatherapp.domain.interactor.WeatherInteractor
import com.example.weatherapp.presentation.weather.di.factory.WeatherViewModelFactory
import dagger.Module
import dagger.Provides

@Module
class WeatherModule {

    @ActivityScope
    @Provides
    fun provideViewModelFactory(weatherInteractor: WeatherInteractor): WeatherViewModelFactory = WeatherViewModelFactory(weatherInteractor)
}
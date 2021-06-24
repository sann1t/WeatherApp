package com.example.weatherapp.presentation.citiesactivity.di

import com.example.weatherapp.di.scopes.ActivityScope
import com.example.weatherapp.domain.repositories.WeatherRepository
import com.example.weatherapp.presentation.citiesactivity.di.factory.CitiesViewModelFactory
import dagger.Module
import dagger.Provides

@Module
class CitiesModule {

    @ActivityScope
    @Provides
    fun provideViewModelFactory(weatherRepository: WeatherRepository): CitiesViewModelFactory = CitiesViewModelFactory(weatherRepository)
}
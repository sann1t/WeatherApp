package com.example.weatherapp.presentation.weatheractivity.di.factory

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.weatherapp.domain.interactor.WeatherInteractor
import com.example.weatherapp.presentation.weatheractivity.viewmodel.WeatherViewModel

class WeatherViewModelFactory(private val weatherInteractor: WeatherInteractor
): ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return WeatherViewModel(weatherInteractor) as T
    }
}
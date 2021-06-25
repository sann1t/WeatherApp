package com.example.weatherapp.presentation.cities.di.factory

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.weatherapp.domain.repositories.WeatherRepository
import com.example.weatherapp.presentation.cities.viewmodel.CitiesViewModel

class CitiesViewModelFactory(private val weatherRepository: WeatherRepository): ViewModelProvider.Factory      {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return CitiesViewModel(weatherRepository) as T
    }
}
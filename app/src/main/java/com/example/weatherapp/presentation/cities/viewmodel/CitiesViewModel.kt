package com.example.weatherapp.presentation.cities.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.weatherapp.domain.models.WeatherInfo
import com.example.weatherapp.domain.repositories.WeatherRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class CitiesViewModel(
    private val weatherRepository: WeatherRepository
): ViewModel() {
    private val weatherLiveData = MutableLiveData<List<WeatherInfo>>()

    init {
        getWeather()
    }

    private fun getWeather() {
        viewModelScope.launch(Dispatchers.IO) {
            weatherLiveData.postValue(weatherRepository.getWeatherFromDatabase())
        }
    }

    fun getLiveData() = weatherLiveData
}
package com.example.weatherapp.domain.interactor

import com.example.weatherapp.domain.models.WeatherInfo

interface WeatherInteractor {
    suspend fun getWeatherByCityName(cityName: String): WeatherInfo
}
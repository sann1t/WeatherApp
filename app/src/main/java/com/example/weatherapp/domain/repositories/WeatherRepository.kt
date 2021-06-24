package com.example.weatherapp.domain.repositories

import com.example.weatherapp.data.models.database.WeatherInfoDatabase
import com.example.weatherapp.data.models.response.WeatherInfoResponse
import com.example.weatherapp.data.repositories.database.WeatherDao
import com.example.weatherapp.domain.models.WeatherInfo

interface WeatherRepository {
    suspend fun getWeatherByCityName(cityName: String): WeatherInfo
    fun insertToDatabase(weatherInfo: WeatherInfo)
    fun deleteDataBase(cityName: String)
    fun getWeatherByCityNameFromDatabase(cityName: String): WeatherInfo
    suspend fun getWeatherFromDatabase(): List<WeatherInfo>
}
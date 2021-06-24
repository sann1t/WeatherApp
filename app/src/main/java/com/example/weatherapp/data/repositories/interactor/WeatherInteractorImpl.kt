package com.example.weatherapp.data.repositories.interactor

import android.util.Log
import com.example.weatherapp.domain.interactor.WeatherInteractor
import com.example.weatherapp.domain.models.WeatherInfo
import com.example.weatherapp.domain.repositories.WeatherRepository
import java.lang.Exception

class WeatherInteractorImpl(private val weatherRepository: WeatherRepository): WeatherInteractor {

    override suspend fun getWeatherByCityName(cityName: String) = tryToGetWeatherAndUpdateDataBase(cityName)

    private suspend fun tryToGetWeatherAndUpdateDataBase(cityName: String): WeatherInfo {
        return try {
            getWeatherAndUpdateDataBase(cityName)
        } catch (e: Exception) {
            weatherRepository.getWeatherByCityNameFromDatabase(cityName)
        }
    }

    private suspend fun getWeatherAndUpdateDataBase(cityName: String): WeatherInfo {
        val weatherInfo = weatherRepository.getWeatherByCityName(cityName)
        updateWeatherInDatabase(cityName, weatherInfo)
        return weatherRepository.getWeatherByCityNameFromDatabase(cityName)
    }

    private fun updateWeatherInDatabase(cityName: String, weatherInfo: WeatherInfo) {
        weatherRepository.deleteDataBase(cityName)
        weatherRepository.insertToDatabase(weatherInfo)
    }
}
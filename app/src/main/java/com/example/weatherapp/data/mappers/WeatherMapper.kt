package com.example.weatherapp.data.mappers

import com.example.weatherapp.data.models.response.MainResponse
import com.example.weatherapp.data.models.database.WeatherDatabase
import com.example.weatherapp.domain.models.Weather

class WeatherMapper {
    fun mapToDomainFromResponse(mainResponse: MainResponse?) = Weather(
        mainResponse?.temp?.toInt(),
        mainResponse?.pressure,
        mainResponse?.humidity,
        mainResponse?.temp_min?.toInt(),
        mainResponse?.temp_max?.toInt()
    )
    fun mapToDatabaseFromDomain(weather: Weather?) = WeatherDatabase(
        weather?.temperature,
        weather?.pressure,
        weather?.humidity,
        weather?.minimumTemperature,
        weather?.maximumTemperature
    )
    fun mapToDomainFromDatabase(weatherDatabase: WeatherDatabase?) = Weather(
        weatherDatabase?.temperature,
        weatherDatabase?.pressure,
        weatherDatabase?.humidity,
        weatherDatabase?.minimumTemperature,
        weatherDatabase?.maximumTemperature
    )
}
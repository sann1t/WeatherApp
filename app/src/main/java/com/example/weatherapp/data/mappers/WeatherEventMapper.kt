package com.example.weatherapp.data.mappers

import com.example.weatherapp.data.models.database.WeatherEventDatabase
import com.example.weatherapp.data.models.response.WeatherResponse
import com.example.weatherapp.domain.models.WeatherEvent


class WeatherEventMapper {
    fun mapToDomainFromResponse(weatherResponse: List<WeatherResponse>?) = weatherResponse?.map { WeatherEvent(
        it.id,
        it.main,
        it.description,
        it.icon)
    }
    fun mapToDatabaseFromDomain(weatherEvent: List<WeatherEvent>?) = weatherEvent?.map { WeatherEventDatabase(
        it.id,
        it.weatherEvent,
        it.description,
        it.icon)
    }
    fun mapToDomainFromDatabase(weatherEventDatabase: List<WeatherEventDatabase>?) = weatherEventDatabase?.map { WeatherEvent(
            it.id,
            it.weatherEvent,
            it.description,
            it.icon)
    }
}

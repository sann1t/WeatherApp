package com.example.weatherapp.data.mappers

import com.example.weatherapp.data.models.database.WindDatabase
import com.example.weatherapp.data.models.response.WindResponse
import com.example.weatherapp.domain.models.Wind

class WindMapper {
    fun mapToDomainFromResponse(windResponse: WindResponse?) = Wind(
        windResponse?.speed?.toInt(),
        windResponse?.deg
    )
    fun mapToDatabaseFromDomain(wind: Wind?) = WindDatabase(
        wind?.speed,
        wind?.degreeDirection
    )
    fun mapToDomainFromDatabase(windDatabase: WindDatabase?) = Wind(
        windDatabase?.speed,
        windDatabase?.degreeDirection
    )
}
package com.example.weatherapp.data.mappers

import com.example.weatherapp.data.models.database.CoordinatesDatabase
import com.example.weatherapp.data.models.response.CoordResponse
import com.example.weatherapp.domain.models.Coordinates

class CoordinatesMapper {
    fun mapToDomainFromResponse(coordinatesResponse: CoordResponse?) = Coordinates(
            coordinatesResponse?.lon,
            coordinatesResponse?.lat
    )
    fun mapToDatabaseFromDomain(coordinates: Coordinates?) = CoordinatesDatabase(
        coordinates?.longitude,
        coordinates?.latitude
    )
    fun mapToDomainFromDatabase(coordinatesDatabase: CoordinatesDatabase?) = Coordinates(
        coordinatesDatabase?.longitude,
        coordinatesDatabase?.latitude
    )
}
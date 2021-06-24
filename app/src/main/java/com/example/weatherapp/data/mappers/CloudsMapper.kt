package com.example.weatherapp.data.mappers

import com.example.weatherapp.data.models.database.CloudsDatabase
import com.example.weatherapp.data.models.response.CloudsResponse
import com.example.weatherapp.domain.models.Clouds

class CloudsMapper {
    fun mapToDomainFromResponse(cloudsResponse: CloudsResponse?) = Clouds(cloudsResponse?.all)
    fun mapToDatabaseFromDomain(clouds: Clouds?) = CloudsDatabase(clouds?.density)
    fun mapToDomainFromDatabase(cloudsDatabase: CloudsDatabase?) = Clouds(cloudsDatabase?.density)
}
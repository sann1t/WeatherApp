package com.example.weatherapp.data.mappers

import com.example.weatherapp.data.models.database.SysDatabase
import com.example.weatherapp.data.models.response.SysResponse
import com.example.weatherapp.domain.models.Sys

class SysMapper {
    fun mapToDomainFromResponse(sysResponse: SysResponse?) = Sys(
        sysResponse?.type,
        sysResponse?.id,
        sysResponse?.message,
        sysResponse?.country,
        sysResponse?.sunrise,
        sysResponse?.sunset
    )
    fun mapToDatabaseFromDomain(sys: Sys?) = SysDatabase(
        sys?.type,
        sys?.id,
        sys?.message,
        sys?.country,
        sys?.sunrise,
        sys?.sunset
    )
    fun mapToDomainFromDatabase(sysDatabase: SysDatabase?) = Sys(
        sysDatabase?.type,
        sysDatabase?.id,
        sysDatabase?.message,
        sysDatabase?.country,
        sysDatabase?.sunrise,
        sysDatabase?.sunset
    )
}
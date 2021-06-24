package com.example.weatherapp.data.mappers

import com.example.weatherapp.data.models.database.WeatherInfoDatabase
import com.example.weatherapp.data.models.response.WeatherInfoResponse
import com.example.weatherapp.domain.models.WeatherInfo

class WeatherInfoMapper(
    private val coordinatesMapper: CoordinatesMapper,
    private val weatherEventMapper: WeatherEventMapper,
    private val weatherMapper: WeatherMapper,
    private val windMapper: WindMapper,
    private val cloudsMapper: CloudsMapper,
    private val sysMapper: SysMapper
) {
    fun mapToDomainFromResponse(weatherInfoResponse: WeatherInfoResponse?) = WeatherInfo(
        coordinatesMapper.mapToDomainFromResponse(weatherInfoResponse?.coordResponse),
        weatherEventMapper.mapToDomainFromResponse(weatherInfoResponse?.weatherResponse),
        weatherInfoResponse?.base,
        weatherMapper.mapToDomainFromResponse(weatherInfoResponse?.mainResponse),
        weatherInfoResponse?.visibility,
        windMapper.mapToDomainFromResponse(weatherInfoResponse?.windResponse),
        cloudsMapper.mapToDomainFromResponse(weatherInfoResponse?.cloudsResponse),
        weatherInfoResponse?.dt,
        sysMapper.mapToDomainFromResponse(weatherInfoResponse?.sysResponse),
        weatherInfoResponse?.id,
        weatherInfoResponse?.name,
        weatherInfoResponse?.cod
    )
    fun mapToDatabaseFromDomain(weatherInfo: WeatherInfo?) = WeatherInfoDatabase(
        coordinatesMapper.mapToDatabaseFromDomain(weatherInfo?.coordinates),
        weatherEventMapper.mapToDatabaseFromDomain(weatherInfo?.weatherEvents),
        weatherInfo?.base,
        weatherMapper.mapToDatabaseFromDomain(weatherInfo?.mainWeatherData),
        weatherInfo?.visibility,
        windMapper.mapToDatabaseFromDomain(weatherInfo?.wind),
        cloudsMapper.mapToDatabaseFromDomain(weatherInfo?.clouds),
        weatherInfo?.dt,
        sysMapper.mapToDatabaseFromDomain(weatherInfo?.sys),
        weatherInfo?.cityId,
        weatherInfo?.cityName!!,
        weatherInfo?.cod
    )
    fun mapToDomainFromDatabase(weatherInfoDatabase: WeatherInfoDatabase?) = WeatherInfo(
            coordinatesMapper.mapToDomainFromDatabase(weatherInfoDatabase?.coordinates),
            weatherEventMapper.mapToDomainFromDatabase(weatherInfoDatabase?.weatherEvents),
            weatherInfoDatabase?.base,
            weatherMapper.mapToDomainFromDatabase(weatherInfoDatabase?.mainWeatherData),
            weatherInfoDatabase?.visibility,
            windMapper.mapToDomainFromDatabase(weatherInfoDatabase?.wind),
            cloudsMapper.mapToDomainFromDatabase(weatherInfoDatabase?.clouds),
            weatherInfoDatabase?.dt,
            sysMapper.mapToDomainFromDatabase(weatherInfoDatabase?.sys),
            weatherInfoDatabase?.cityId,
            weatherInfoDatabase?.cityName,
            weatherInfoDatabase?.cod
    )
    fun listMapToDomainFromDatabase(weatherInfoDatabase: List<WeatherInfoDatabase>?) = weatherInfoDatabase?.map { WeatherInfo(
        coordinatesMapper.mapToDomainFromDatabase(it.coordinates),
        weatherEventMapper.mapToDomainFromDatabase(it.weatherEvents),
        it.base,
        weatherMapper.mapToDomainFromDatabase(it.mainWeatherData),
        it.visibility,
        windMapper.mapToDomainFromDatabase(it.wind),
        cloudsMapper.mapToDomainFromDatabase(it.clouds),
        it.dt,
        sysMapper.mapToDomainFromDatabase(it.sys),
        it.cityId,
        it.cityName,
        it.cod
        )
    }
}
package com.example.weatherapp.data.repositories

 import com.example.weatherapp.components.WEATHER_KEY
import com.example.weatherapp.data.mappers.WeatherInfoMapper
import com.example.weatherapp.data.models.database.WeatherInfoDatabase
import com.example.weatherapp.data.models.response.WeatherInfoResponse
 import com.example.weatherapp.data.repositories.database.WeatherDao
 import com.example.weatherapp.data.repositories.database.WeatherDatabase
import com.example.weatherapp.data.repositories.network.WeatherAPI
import com.example.weatherapp.domain.models.WeatherInfo
import com.example.weatherapp.domain.repositories.WeatherRepository
import java.lang.Exception

class WeatherRepositoryImpl(
    private val weatherAPI: WeatherAPI,
    private val weatherInfoMapper: WeatherInfoMapper,
    private val weatherDao: WeatherDao,
    ): WeatherRepository{

    override suspend fun getWeatherByCityName(cityName: String): WeatherInfo {
        val weatherInfoResponse = weatherAPI.getWeather(cityName, WEATHER_KEY)
        return weatherInfoMapper.mapToDomainFromResponse(weatherInfoResponse)
    }

    override fun insertToDatabase(weatherInfo: WeatherInfo) {
        val weatherInfoDatabase = weatherInfoMapper.mapToDatabaseFromDomain(weatherInfo)
        weatherDao.insertWeather(weatherInfoDatabase)
    }

    override fun deleteDataBase(cityName: String) {
        weatherDao.deleteWeather(cityName)
    }

    override fun getWeatherByCityNameFromDatabase(cityName: String): WeatherInfo {
        val weatherInfoDatabase = weatherDao.getWeatherByCityName(cityName)
        return weatherInfoMapper.mapToDomainFromDatabase(weatherInfoDatabase)
    }

    override suspend fun getWeatherFromDatabase(): List<WeatherInfo> {
        val weatherInfoDatabase = weatherDao.getWeather()
        return weatherInfoMapper.listMapToDomainFromDatabase(weatherInfoDatabase)!!
    }

}
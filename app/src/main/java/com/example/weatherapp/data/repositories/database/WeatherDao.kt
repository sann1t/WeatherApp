package com.example.weatherapp.data.repositories.database

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.example.weatherapp.data.models.database.WeatherInfoDatabase

@Dao
interface WeatherDao {

    @Insert
    fun insertWeather(weather: WeatherInfoDatabase)

    @Query("DELETE from weatherInfoDatabase WHERE cityName in(:cityName)")
    fun deleteWeather(cityName: String)

    @Query("SELECT * FROM weatherInfoDatabase")
    fun getWeather(): List<WeatherInfoDatabase>

    @Query("SELECT * FROM weatherInfoDatabase WHERE cityName LIKE :cityName")
    fun getWeatherByCityName(cityName: String): WeatherInfoDatabase
}
package com.example.weatherapp.data.repositories.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.weatherapp.data.models.database.WeatherInfoDatabase

@Database(entities = [WeatherInfoDatabase::class], version = 1, exportSchema = false)
abstract class WeatherDatabase: RoomDatabase() {
    abstract fun getWeatherDao(): WeatherDao
}
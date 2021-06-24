package com.example.weatherapp.data.models.database

import androidx.room.ColumnInfo
import androidx.room.Entity

data class WeatherDatabase (
	@ColumnInfo(name = "temperature")
	var temperature : Int?,
	@ColumnInfo(name = "pressure")
	var pressure : Int?,
	@ColumnInfo(name = "humidity")
	var humidity : Int?,
	@ColumnInfo(name = "minimumTemperature")
	var minimumTemperature : Int?,
	@ColumnInfo(name = "maximumTemperature")
	var maximumTemperature : Int?
)
package com.example.weatherapp.data.models.database

import androidx.room.ColumnInfo
import androidx.room.Entity

data class WeatherEventDatabase (
	@ColumnInfo(name = "id")
	var id : Int?,
	@ColumnInfo(name = "weatherEvent")
	var weatherEvent : String?,
	@ColumnInfo(name = "description")
	var description : String?,
	@ColumnInfo(name = "icon")
	var icon : String?
)
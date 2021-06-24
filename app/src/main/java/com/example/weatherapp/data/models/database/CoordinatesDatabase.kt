package com.example.weatherapp.data.models.database

import androidx.room.ColumnInfo
import androidx.room.Entity

data class CoordinatesDatabase (
	@ColumnInfo(name = "longitude")
	var longitude : Double?,
	@ColumnInfo(name = "latitude")
	var latitude : Double?
)
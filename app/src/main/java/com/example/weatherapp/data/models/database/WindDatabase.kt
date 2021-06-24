package com.example.weatherapp.data.models.database

import androidx.room.ColumnInfo
import androidx.room.Entity

data class WindDatabase (
	@ColumnInfo(name = "speed")
	var speed : Int?,
	@ColumnInfo(name = "degreeDirection")
	var degreeDirection : Int?
)
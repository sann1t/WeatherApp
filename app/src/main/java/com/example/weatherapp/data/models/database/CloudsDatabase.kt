package com.example.weatherapp.data.models.database

import androidx.room.ColumnInfo

data class CloudsDatabase (
	@ColumnInfo(name = "density")
	var density : Int?
)
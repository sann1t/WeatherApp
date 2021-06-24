package com.example.weatherapp.data.models.database

import androidx.room.ColumnInfo
import androidx.room.Entity

//На данный момент из документации не понятно
data class SysDatabase (
	@ColumnInfo(name = "type")
	var type : Int?,
	@ColumnInfo(name = "id")
	var id : Int?,
	@ColumnInfo(name = "message")
	var message : Double?,
	@ColumnInfo(name = "country")
	var country : String?,
	@ColumnInfo(name = "sunrise")
	var sunrise : Int?,
	@ColumnInfo(name = "sunset")
	var sunset : Int?
)
package com.example.weatherapp.data.models.database

import androidx.room.*

@Entity(tableName = "weatherInfoDatabase")
data class WeatherInfoDatabase (
	@Embedded
	var coordinates : CoordinatesDatabase? = null,
	@Embedded
	@Ignore
	var weatherEvents : List<WeatherEventDatabase>? = null,
	@ColumnInfo(name = "base")
	var base : String? = null,
	@Embedded
	var mainWeatherData : WeatherDatabase? = null,
	@ColumnInfo(name = "visibility")
	var visibility : Int? = null,
	@Embedded
	var wind : WindDatabase? = null,
	@Embedded
	var clouds: CloudsDatabase? = null,
	@ColumnInfo(name = "dt")
	//На данный момент из документации не понятно
	var dt : Int? = null,
	@Embedded
	//На данный момент из документации не понятно
	var sys : SysDatabase? = null,
	@ColumnInfo(name = "cityId")
	var cityId : Int? = null,
	@PrimaryKey
	@ColumnInfo(name = "cityName")
	var cityName : String = "",
	@ColumnInfo(name = "cod")
	//На данный момент из документации не понятно
	var cod : Int? = null
)
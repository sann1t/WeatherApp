package com.example.weatherapp.domain.models

data class WeatherInfo (
		val coordinates : Coordinates?,
		val weatherEvents : List<WeatherEvent>?,
		val base : String?,
		val mainWeatherData : Weather?,
		val visibility : Int?,
		val wind : Wind?,
		val clouds : Clouds?,
	//На данный момент из документации не понятно
		val dt : Int?,
	//На данный момент из документации не понятно
		val sys : Sys?,
		val cityId : Int?,
		val cityName : String?,
	//На данный момент из документации не понятно
		val cod : Int?
)
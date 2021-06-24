package com.example.weatherapp.domain.models

data class Weather (
		val temperature : Int?,
		val pressure : Int?,
		val humidity : Int?,
		val minimumTemperature : Int?,
		val maximumTemperature : Int?
)
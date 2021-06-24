package com.example.weatherapp.domain.models

//На данный момент из документации не понятно
data class Sys (
		val type : Int?,
		val id : Int?,
		val message : Double?,
		val country : String?,
		val sunrise : Int?,
		val sunset : Int?
)
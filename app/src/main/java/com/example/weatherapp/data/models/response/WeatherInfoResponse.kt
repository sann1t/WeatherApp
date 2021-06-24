package com.example.weatherapp.data.models.response

import com.google.gson.annotations.SerializedName


data class WeatherInfoResponse (

	@SerializedName("coord") val coordResponse : CoordResponse?,
	@SerializedName("weather") val weatherResponse : List<WeatherResponse>?,
	@SerializedName("base") val base : String?,
	@SerializedName("main") val mainResponse : MainResponse?,
	@SerializedName("visibility") val visibility : Int?,
	@SerializedName("wind") val windResponse : WindResponse?,
	@SerializedName("cloudsDatabase") val cloudsResponse : CloudsResponse?,
	@SerializedName("dt") val dt : Int?,
	@SerializedName("sys") val sysResponse : SysResponse?,
	@SerializedName("id") val id : Int?,
	@SerializedName("name") val name : String?,
	@SerializedName("cod") val cod : Int?
)
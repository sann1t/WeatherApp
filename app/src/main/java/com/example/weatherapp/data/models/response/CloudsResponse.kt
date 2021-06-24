package com.example.weatherapp.data.models.response

import com.google.gson.annotations.SerializedName

data class CloudsResponse (
	@SerializedName("all") val all : Int?
)
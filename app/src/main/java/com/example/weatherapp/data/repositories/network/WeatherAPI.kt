package com.example.weatherapp.data.repositories.network

import com.example.weatherapp.data.models.response.WeatherInfoResponse
import retrofit2.http.GET
import retrofit2.http.Query

interface WeatherAPI {
    @GET("weather?units=metric&lang=ru")
    suspend fun getWeather(@Query("q") cityName: String, @Query("appid") key: String): WeatherInfoResponse
}
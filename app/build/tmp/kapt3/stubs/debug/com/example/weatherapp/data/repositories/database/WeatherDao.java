package com.example.weatherapp.data.repositories.database;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u000e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\'J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\bH\'\u00a8\u0006\f"}, d2 = {"Lcom/example/weatherapp/data/repositories/database/WeatherDao;", "", "deleteWeather", "", "cityName", "", "getWeather", "", "Lcom/example/weatherapp/data/models/database/WeatherInfoDatabase;", "getWeatherByCityName", "insertWeather", "weather", "app_debug"})
public abstract interface WeatherDao {
    
    @androidx.room.Insert()
    public abstract void insertWeather(@org.jetbrains.annotations.NotNull()
    com.example.weatherapp.data.models.database.WeatherInfoDatabase weather);
    
    @androidx.room.Query(value = "DELETE from weatherInfoDatabase WHERE cityName in(:cityName)")
    public abstract void deleteWeather(@org.jetbrains.annotations.NotNull()
    java.lang.String cityName);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM weatherInfoDatabase")
    public abstract java.util.List<com.example.weatherapp.data.models.database.WeatherInfoDatabase> getWeather();
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM weatherInfoDatabase WHERE cityName LIKE :cityName")
    public abstract com.example.weatherapp.data.models.database.WeatherInfoDatabase getWeatherByCityName(@org.jetbrains.annotations.NotNull()
    java.lang.String cityName);
}
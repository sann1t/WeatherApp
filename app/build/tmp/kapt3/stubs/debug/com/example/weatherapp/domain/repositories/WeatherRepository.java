package com.example.weatherapp.domain.repositories;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0019\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0005H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\bJ\u0010\u0010\t\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u000bH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\fJ\u0010\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u0007H&\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000f"}, d2 = {"Lcom/example/weatherapp/domain/repositories/WeatherRepository;", "", "deleteDataBase", "", "cityName", "", "getWeatherByCityName", "Lcom/example/weatherapp/domain/models/WeatherInfo;", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getWeatherByCityNameFromDatabase", "getWeatherFromDatabase", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insertToDatabase", "weatherInfo", "app_debug"})
public abstract interface WeatherRepository {
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getWeatherByCityName(@org.jetbrains.annotations.NotNull()
    java.lang.String cityName, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.weatherapp.domain.models.WeatherInfo> p1);
    
    public abstract void insertToDatabase(@org.jetbrains.annotations.NotNull()
    com.example.weatherapp.domain.models.WeatherInfo weatherInfo);
    
    public abstract void deleteDataBase(@org.jetbrains.annotations.NotNull()
    java.lang.String cityName);
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.example.weatherapp.domain.models.WeatherInfo getWeatherByCityNameFromDatabase(@org.jetbrains.annotations.NotNull()
    java.lang.String cityName);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getWeatherFromDatabase(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.example.weatherapp.domain.models.WeatherInfo>> p0);
}
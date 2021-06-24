package com.example.weatherapp.data.repositories;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0019\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\fH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0012H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u000eH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0016"}, d2 = {"Lcom/example/weatherapp/data/repositories/WeatherRepositoryImpl;", "Lcom/example/weatherapp/domain/repositories/WeatherRepository;", "weatherAPI", "Lcom/example/weatherapp/data/repositories/network/WeatherAPI;", "weatherInfoMapper", "Lcom/example/weatherapp/data/mappers/WeatherInfoMapper;", "weatherDao", "Lcom/example/weatherapp/data/repositories/database/WeatherDao;", "(Lcom/example/weatherapp/data/repositories/network/WeatherAPI;Lcom/example/weatherapp/data/mappers/WeatherInfoMapper;Lcom/example/weatherapp/data/repositories/database/WeatherDao;)V", "deleteDataBase", "", "cityName", "", "getWeatherByCityName", "Lcom/example/weatherapp/domain/models/WeatherInfo;", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getWeatherByCityNameFromDatabase", "getWeatherFromDatabase", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insertToDatabase", "weatherInfo", "app_debug"})
public final class WeatherRepositoryImpl implements com.example.weatherapp.domain.repositories.WeatherRepository {
    private final com.example.weatherapp.data.repositories.network.WeatherAPI weatherAPI = null;
    private final com.example.weatherapp.data.mappers.WeatherInfoMapper weatherInfoMapper = null;
    private final com.example.weatherapp.data.repositories.database.WeatherDao weatherDao = null;
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getWeatherByCityName(@org.jetbrains.annotations.NotNull()
    java.lang.String cityName, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.weatherapp.domain.models.WeatherInfo> p1) {
        return null;
    }
    
    @java.lang.Override()
    public void insertToDatabase(@org.jetbrains.annotations.NotNull()
    com.example.weatherapp.domain.models.WeatherInfo weatherInfo) {
    }
    
    @java.lang.Override()
    public void deleteDataBase(@org.jetbrains.annotations.NotNull()
    java.lang.String cityName) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.example.weatherapp.domain.models.WeatherInfo getWeatherByCityNameFromDatabase(@org.jetbrains.annotations.NotNull()
    java.lang.String cityName) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getWeatherFromDatabase(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.example.weatherapp.domain.models.WeatherInfo>> p0) {
        return null;
    }
    
    public WeatherRepositoryImpl(@org.jetbrains.annotations.NotNull()
    com.example.weatherapp.data.repositories.network.WeatherAPI weatherAPI, @org.jetbrains.annotations.NotNull()
    com.example.weatherapp.data.mappers.WeatherInfoMapper weatherInfoMapper, @org.jetbrains.annotations.NotNull()
    com.example.weatherapp.data.repositories.database.WeatherDao weatherDao) {
        super();
    }
}
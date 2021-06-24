package com.example.weatherapp.di.modules;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007J\b\u0010\u0005\u001a\u00020\u0006H\u0007J\b\u0010\u0007\u001a\u00020\bH\u0007J\b\u0010\t\u001a\u00020\nH\u0007J8\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\bH\u0007J\b\u0010\u0015\u001a\u00020\u0010H\u0007J\b\u0010\u0016\u001a\u00020\u0012H\u0007\u00a8\u0006\u0017"}, d2 = {"Lcom/example/weatherapp/di/modules/MappersModule;", "", "()V", "provideCloudsMapper", "Lcom/example/weatherapp/data/mappers/CloudsMapper;", "provideCoordinatesMapper", "Lcom/example/weatherapp/data/mappers/CoordinatesMapper;", "provideSysMapper", "Lcom/example/weatherapp/data/mappers/SysMapper;", "provideWeatherEventMapper", "Lcom/example/weatherapp/data/mappers/WeatherEventMapper;", "provideWeatherInfoMapper", "Lcom/example/weatherapp/data/mappers/WeatherInfoMapper;", "coordinatesMapper", "weatherEventMapper", "weatherMapper", "Lcom/example/weatherapp/data/mappers/WeatherMapper;", "windMapper", "Lcom/example/weatherapp/data/mappers/WindMapper;", "cloudsMapper", "sysMapper", "provideWeatherMapper", "provideWindMapper", "app_debug"})
@dagger.Module()
public final class MappersModule {
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final com.example.weatherapp.data.mappers.WeatherInfoMapper provideWeatherInfoMapper(@org.jetbrains.annotations.NotNull()
    com.example.weatherapp.data.mappers.CoordinatesMapper coordinatesMapper, @org.jetbrains.annotations.NotNull()
    com.example.weatherapp.data.mappers.WeatherEventMapper weatherEventMapper, @org.jetbrains.annotations.NotNull()
    com.example.weatherapp.data.mappers.WeatherMapper weatherMapper, @org.jetbrains.annotations.NotNull()
    com.example.weatherapp.data.mappers.WindMapper windMapper, @org.jetbrains.annotations.NotNull()
    com.example.weatherapp.data.mappers.CloudsMapper cloudsMapper, @org.jetbrains.annotations.NotNull()
    com.example.weatherapp.data.mappers.SysMapper sysMapper) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final com.example.weatherapp.data.mappers.CoordinatesMapper provideCoordinatesMapper() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final com.example.weatherapp.data.mappers.WeatherEventMapper provideWeatherEventMapper() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final com.example.weatherapp.data.mappers.WeatherMapper provideWeatherMapper() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final com.example.weatherapp.data.mappers.WindMapper provideWindMapper() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final com.example.weatherapp.data.mappers.CloudsMapper provideCloudsMapper() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final com.example.weatherapp.data.mappers.SysMapper provideSysMapper() {
        return null;
    }
    
    public MappersModule() {
        super();
    }
}
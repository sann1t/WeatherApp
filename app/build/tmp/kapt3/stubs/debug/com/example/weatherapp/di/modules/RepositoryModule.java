package com.example.weatherapp.di.modules;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J \u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007\u00a8\u0006\u000b"}, d2 = {"Lcom/example/weatherapp/di/modules/RepositoryModule;", "", "()V", "provideWeatherRepository", "Lcom/example/weatherapp/domain/repositories/WeatherRepository;", "weatherAPI", "Lcom/example/weatherapp/data/repositories/network/WeatherAPI;", "weatherInfoMapper", "Lcom/example/weatherapp/data/mappers/WeatherInfoMapper;", "weatherDao", "Lcom/example/weatherapp/data/repositories/database/WeatherDao;", "app_debug"})
@dagger.Module()
public final class RepositoryModule {
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.example.weatherapp.domain.repositories.WeatherRepository provideWeatherRepository(@org.jetbrains.annotations.NotNull()
    com.example.weatherapp.data.repositories.network.WeatherAPI weatherAPI, @org.jetbrains.annotations.NotNull()
    com.example.weatherapp.data.mappers.WeatherInfoMapper weatherInfoMapper, @org.jetbrains.annotations.NotNull()
    com.example.weatherapp.data.repositories.database.WeatherDao weatherDao) {
        return null;
    }
    
    public RepositoryModule() {
        super();
    }
}
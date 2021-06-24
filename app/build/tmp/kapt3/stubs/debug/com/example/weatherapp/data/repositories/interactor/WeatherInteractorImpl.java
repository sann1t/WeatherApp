package com.example.weatherapp.data.repositories.interactor;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ\u0019\u0010\n\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ\u0019\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u0006H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000f"}, d2 = {"Lcom/example/weatherapp/data/repositories/interactor/WeatherInteractorImpl;", "Lcom/example/weatherapp/domain/interactor/WeatherInteractor;", "weatherRepository", "Lcom/example/weatherapp/domain/repositories/WeatherRepository;", "(Lcom/example/weatherapp/domain/repositories/WeatherRepository;)V", "getWeatherAndUpdateDataBase", "Lcom/example/weatherapp/domain/models/WeatherInfo;", "cityName", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getWeatherByCityName", "tryToGetWeatherAndUpdateDataBase", "updateWeatherInDatabase", "", "weatherInfo", "app_debug"})
public final class WeatherInteractorImpl implements com.example.weatherapp.domain.interactor.WeatherInteractor {
    private final com.example.weatherapp.domain.repositories.WeatherRepository weatherRepository = null;
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getWeatherByCityName(@org.jetbrains.annotations.NotNull()
    java.lang.String cityName, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.weatherapp.domain.models.WeatherInfo> p1) {
        return null;
    }
    
    private final void updateWeatherInDatabase(java.lang.String cityName, com.example.weatherapp.domain.models.WeatherInfo weatherInfo) {
    }
    
    public WeatherInteractorImpl(@org.jetbrains.annotations.NotNull()
    com.example.weatherapp.domain.repositories.WeatherRepository weatherRepository) {
        super();
    }
}
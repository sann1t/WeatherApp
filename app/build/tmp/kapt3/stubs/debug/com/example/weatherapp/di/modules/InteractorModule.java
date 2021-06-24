package com.example.weatherapp.di.modules;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007\u00a8\u0006\u0007"}, d2 = {"Lcom/example/weatherapp/di/modules/InteractorModule;", "", "()V", "provideWeatherInteractor", "Lcom/example/weatherapp/domain/interactor/WeatherInteractor;", "weatherRepository", "Lcom/example/weatherapp/domain/repositories/WeatherRepository;", "app_debug"})
@dagger.Module()
public final class InteractorModule {
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final com.example.weatherapp.domain.interactor.WeatherInteractor provideWeatherInteractor(@org.jetbrains.annotations.NotNull()
    com.example.weatherapp.domain.repositories.WeatherRepository weatherRepository) {
        return null;
    }
    
    public InteractorModule() {
        super();
    }
}
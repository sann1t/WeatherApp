package com.example.weatherapp.presentation.citiesactivity.viewmodel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0012\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006J\b\u0010\n\u001a\u00020\u000bH\u0002R\u001a\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lcom/example/weatherapp/presentation/citiesactivity/viewmodel/CitiesViewModel;", "Landroidx/lifecycle/ViewModel;", "weatherRepository", "Lcom/example/weatherapp/domain/repositories/WeatherRepository;", "(Lcom/example/weatherapp/domain/repositories/WeatherRepository;)V", "weatherLiveData", "Landroidx/lifecycle/MutableLiveData;", "", "Lcom/example/weatherapp/domain/models/WeatherInfo;", "getLiveData", "getWeather", "", "app_debug"})
public final class CitiesViewModel extends androidx.lifecycle.ViewModel {
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.example.weatherapp.domain.models.WeatherInfo>> weatherLiveData = null;
    private final com.example.weatherapp.domain.repositories.WeatherRepository weatherRepository = null;
    
    private final void getWeather() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.util.List<com.example.weatherapp.domain.models.WeatherInfo>> getLiveData() {
        return null;
    }
    
    public CitiesViewModel(@org.jetbrains.annotations.NotNull()
    com.example.weatherapp.domain.repositories.WeatherRepository weatherRepository) {
        super();
    }
}
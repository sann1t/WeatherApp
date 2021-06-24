package com.example.weatherapp.presentation.weatheractivity.viewmodel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u000b\u001a\u00020\fH\u0002J\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\u0006J\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006J\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006J\u000e\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u0012J\u0010\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0012H\u0002R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lcom/example/weatherapp/presentation/weatheractivity/viewmodel/WeatherViewModel;", "Landroidx/lifecycle/ViewModel;", "weatherInteractor", "Lcom/example/weatherapp/domain/interactor/WeatherInteractor;", "(Lcom/example/weatherapp/domain/interactor/WeatherInteractor;)V", "loadingLiveData", "Landroidx/lifecycle/MutableLiveData;", "", "toastLiveData", "weatherInfoLiveData", "Lcom/example/weatherapp/domain/models/WeatherInfo;", "getCityName", "", "getLiveData", "getLoadingLiveData", "getToastLiveData", "getWeatherFromCityName", "cityName", "", "parseCityName", "app_debug"})
public final class WeatherViewModel extends androidx.lifecycle.ViewModel {
    private final androidx.lifecycle.MutableLiveData<com.example.weatherapp.domain.models.WeatherInfo> weatherInfoLiveData = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> loadingLiveData = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> toastLiveData = null;
    private final com.example.weatherapp.domain.interactor.WeatherInteractor weatherInteractor = null;
    
    private final void getCityName() {
    }
    
    public final void getWeatherFromCityName(@org.jetbrains.annotations.NotNull()
    java.lang.String cityName) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getToastLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.example.weatherapp.domain.models.WeatherInfo> getLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getLoadingLiveData() {
        return null;
    }
    
    private final java.lang.String parseCityName(java.lang.String cityName) {
        return null;
    }
    
    public WeatherViewModel(@org.jetbrains.annotations.NotNull()
    com.example.weatherapp.domain.interactor.WeatherInteractor weatherInteractor) {
        super();
    }
}
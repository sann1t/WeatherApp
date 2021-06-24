package com.example.weatherapp.presentation.weatheractivity.viewmodel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\b\u001a\u00020\tJ\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/example/weatherapp/presentation/weatheractivity/viewmodel/WeatherActivityViewModel;", "Landroidx/lifecycle/ViewModel;", "weatherAPI", "Lcom/example/weatherapp/data/repositories/WeatherAPI;", "(Lcom/example/weatherapp/data/repositories/WeatherAPI;)V", "weatherInfoLiveData", "Landroidx/lifecycle/MutableLiveData;", "Lcom/example/weatherapp/data/models/response/WeatherInfoResponse;", "getCityName", "", "getLiveData", "app_release"})
public final class WeatherActivityViewModel extends androidx.lifecycle.ViewModel {
    private final androidx.lifecycle.MutableLiveData<com.example.weatherapp.data.models.response.WeatherInfoResponse> weatherInfoLiveData = null;
    private final com.example.weatherapp.data.repositories.WeatherAPI weatherAPI = null;
    
    public final void getCityName() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.example.weatherapp.data.models.response.WeatherInfoResponse> getLiveData() {
        return null;
    }
    
    public WeatherActivityViewModel(@org.jetbrains.annotations.NotNull()
    com.example.weatherapp.data.repositories.WeatherAPI weatherAPI) {
        super();
    }
}
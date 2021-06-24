package com.example.weatherapp.presentation.citiesactivity.di;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0006J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0007"}, d2 = {"Lcom/example/weatherapp/presentation/citiesactivity/di/CitiesSubComponent;", "", "inject", "", "citiesActivity", "Lcom/example/weatherapp/presentation/citiesactivity/view/CitiesActivity;", "Builder", "app_debug"})
@dagger.Subcomponent(modules = {com.example.weatherapp.presentation.citiesactivity.di.CitiesModule.class})
@com.example.weatherapp.di.scopes.ActivityScope()
public abstract interface CitiesSubComponent {
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.example.weatherapp.presentation.citiesactivity.view.CitiesActivity citiesActivity);
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&\u00a8\u0006\u0004"}, d2 = {"Lcom/example/weatherapp/presentation/citiesactivity/di/CitiesSubComponent$Builder;", "", "build", "Lcom/example/weatherapp/presentation/citiesactivity/di/CitiesSubComponent;", "app_debug"})
    @dagger.Subcomponent.Builder()
    public static abstract interface Builder {
        
        @org.jetbrains.annotations.NotNull()
        public abstract com.example.weatherapp.presentation.citiesactivity.di.CitiesSubComponent build();
    }
}
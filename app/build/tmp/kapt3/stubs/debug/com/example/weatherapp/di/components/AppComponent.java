package com.example.weatherapp.di.components;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0006J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0007"}, d2 = {"Lcom/example/weatherapp/di/components/AppComponent;", "", "getActivitySubComponentBuilder", "Lcom/example/weatherapp/presentation/weatheractivity/di/WeatherSubComponent$Builder;", "getCitiesSubComponentBuilder", "Lcom/example/weatherapp/presentation/citiesactivity/di/CitiesSubComponent$Builder;", "Builder", "app_debug"})
@dagger.Component(modules = {com.example.weatherapp.di.modules.NetworkModule.class, com.example.weatherapp.di.modules.MappersModule.class, com.example.weatherapp.di.modules.RepositoryModule.class, com.example.weatherapp.di.modules.DatabaseModule.class, com.example.weatherapp.di.modules.InteractorModule.class})
@javax.inject.Singleton()
public abstract interface AppComponent {
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.example.weatherapp.presentation.weatheractivity.di.WeatherSubComponent.Builder getActivitySubComponentBuilder();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.example.weatherapp.presentation.citiesactivity.di.CitiesSubComponent.Builder getCitiesSubComponentBuilder();
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0006H\'\u00a8\u0006\u0007"}, d2 = {"Lcom/example/weatherapp/di/components/AppComponent$Builder;", "", "build", "Lcom/example/weatherapp/di/components/AppComponent;", "withApplication", "application", "Landroid/app/Application;", "app_debug"})
    @dagger.Component.Builder()
    public static abstract interface Builder {
        
        @org.jetbrains.annotations.NotNull()
        @dagger.BindsInstance()
        public abstract com.example.weatherapp.di.components.AppComponent.Builder withApplication(@org.jetbrains.annotations.NotNull()
        android.app.Application application);
        
        @org.jetbrains.annotations.NotNull()
        public abstract com.example.weatherapp.di.components.AppComponent build();
    }
}
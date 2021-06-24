package com.example.weatherapp.presentation.weatheractivity.view;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u001a\u001a\u00020\u001bH\u0002J\b\u0010\u001c\u001a\u00020\u001bH\u0002J\b\u0010\u001d\u001a\u00020\u001bH\u0002J\"\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020 2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0014J\u000e\u0010$\u001a\u00020\u001b2\u0006\u0010%\u001a\u00020&J\u0012\u0010\'\u001a\u00020\u001b2\b\u0010(\u001a\u0004\u0018\u00010)H\u0014J\u0010\u0010*\u001a\u00020\u001b2\u0006\u0010+\u001a\u00020 H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\r\u001a\u00020\u000e8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0013\u001a\u00020\u00148\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u000e\u0010\u0019\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006,"}, d2 = {"Lcom/example/weatherapp/presentation/weatheractivity/view/WeatherActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "cityTextView", "Landroid/widget/TextView;", "degreeTextView", "downArrowTextView", "maximumTemperatureTextView", "minimumTemperatureTextView", "progressBar", "Landroid/widget/ProgressBar;", "temperatureTextView", "upArrowTextView", "viewModel", "Lcom/example/weatherapp/presentation/weatheractivity/viewmodel/WeatherViewModel;", "getViewModel", "()Lcom/example/weatherapp/presentation/weatheractivity/viewmodel/WeatherViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "weatherViewModelFactory", "Lcom/example/weatherapp/presentation/weatheractivity/di/factory/WeatherViewModelFactory;", "getWeatherViewModelFactory", "()Lcom/example/weatherapp/presentation/weatheractivity/di/factory/WeatherViewModelFactory;", "setWeatherViewModelFactory", "(Lcom/example/weatherapp/presentation/weatheractivity/di/factory/WeatherViewModelFactory;)V", "windTextView", "initDagger", "", "initLiveData", "initViews", "onActivityResult", "requestCode", "", "resultCode", "data", "Landroid/content/Intent;", "onAddCityOnClick", "view", "Landroid/view/View;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "viewVisible", "visible", "app_debug"})
public final class WeatherActivity extends androidx.appcompat.app.AppCompatActivity {
    @javax.inject.Inject()
    public com.example.weatherapp.presentation.weatheractivity.di.factory.WeatherViewModelFactory weatherViewModelFactory;
    private final kotlin.Lazy viewModel$delegate = null;
    private android.widget.TextView temperatureTextView;
    private android.widget.TextView maximumTemperatureTextView;
    private android.widget.TextView minimumTemperatureTextView;
    private android.widget.TextView windTextView;
    private android.widget.TextView cityTextView;
    private android.widget.TextView upArrowTextView;
    private android.widget.TextView downArrowTextView;
    private android.widget.TextView degreeTextView;
    private android.widget.ProgressBar progressBar;
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.weatherapp.presentation.weatheractivity.di.factory.WeatherViewModelFactory getWeatherViewModelFactory() {
        return null;
    }
    
    public final void setWeatherViewModelFactory(@org.jetbrains.annotations.NotNull()
    com.example.weatherapp.presentation.weatheractivity.di.factory.WeatherViewModelFactory p0) {
    }
    
    private final com.example.weatherapp.presentation.weatheractivity.viewmodel.WeatherViewModel getViewModel() {
        return null;
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void initDagger() {
    }
    
    private final void initViews() {
    }
    
    private final void viewVisible(int visible) {
    }
    
    private final void initLiveData() {
    }
    
    public final void onAddCityOnClick(@org.jetbrains.annotations.NotNull()
    android.view.View view) {
    }
    
    @java.lang.Override()
    protected void onActivityResult(int requestCode, int resultCode, @org.jetbrains.annotations.Nullable()
    android.content.Intent data) {
    }
    
    public WeatherActivity() {
        super();
    }
}
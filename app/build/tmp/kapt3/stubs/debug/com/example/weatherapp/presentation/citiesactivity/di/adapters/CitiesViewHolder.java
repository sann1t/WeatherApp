package com.example.weatherapp.presentation.citiesactivity.di.adapters;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fR\u000e\u0010\u0007\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Lcom/example/weatherapp/presentation/citiesactivity/di/adapters/CitiesViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "onCityClick", "Lcom/example/weatherapp/presentation/weatheractivity/di/callbacks/OnCityClick;", "(Landroid/view/View;Lcom/example/weatherapp/presentation/weatheractivity/di/callbacks/OnCityClick;)V", "cityName", "", "cityNameItemTextView", "Landroid/widget/TextView;", "temperatureItemTextView", "bind", "", "weatherInfo", "Lcom/example/weatherapp/domain/models/WeatherInfo;", "app_debug"})
public final class CitiesViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
    private android.widget.TextView cityNameItemTextView;
    private java.lang.String cityName;
    private android.widget.TextView temperatureItemTextView;
    private final com.example.weatherapp.presentation.weatheractivity.di.callbacks.OnCityClick onCityClick = null;
    
    public final void bind(@org.jetbrains.annotations.NotNull()
    com.example.weatherapp.domain.models.WeatherInfo weatherInfo) {
    }
    
    public CitiesViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.View itemView, @org.jetbrains.annotations.NotNull()
    com.example.weatherapp.presentation.weatheractivity.di.callbacks.OnCityClick onCityClick) {
        super(null);
    }
}
package com.example.weatherapp.domain.models;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b&\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001Bk\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\f\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\f\u0012\u0006\u0010\u0015\u001a\u00020\b\u0012\u0006\u0010\u0016\u001a\u00020\f\u00a2\u0006\u0002\u0010\u0017J\t\u0010,\u001a\u00020\u0003H\u00c6\u0003J\t\u0010-\u001a\u00020\fH\u00c6\u0003J\t\u0010.\u001a\u00020\bH\u00c6\u0003J\t\u0010/\u001a\u00020\fH\u00c6\u0003J\u000f\u00100\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u00c6\u0003J\t\u00101\u001a\u00020\bH\u00c6\u0003J\t\u00102\u001a\u00020\nH\u00c6\u0003J\t\u00103\u001a\u00020\fH\u00c6\u0003J\t\u00104\u001a\u00020\u000eH\u00c6\u0003J\t\u00105\u001a\u00020\u0010H\u00c6\u0003J\t\u00106\u001a\u00020\fH\u00c6\u0003J\t\u00107\u001a\u00020\u0013H\u00c6\u0003J\u0087\u0001\u00108\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\f2\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\f2\b\b\u0002\u0010\u0015\u001a\u00020\b2\b\b\u0002\u0010\u0016\u001a\u00020\fH\u00c6\u0001J\u0013\u00109\u001a\u00020:2\b\u0010;\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010<\u001a\u00020\fH\u00d6\u0001J\t\u0010=\u001a\u00020\bH\u00d6\u0001R\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u0014\u001a\u00020\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u0015\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0019R\u0011\u0010\u000f\u001a\u00020\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\u0016\u001a\u00020\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0011\u0010\u0011\u001a\u00020\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001bR\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0011\u0010\u0012\u001a\u00020\u0013\u00a2\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0011\u0010\u000b\u001a\u00020\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\'\u0010\u001bR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0011\u0010\r\u001a\u00020\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b*\u0010+\u00a8\u0006>"}, d2 = {"Lcom/example/weatherapp/domain/models/WeatherInfo;", "", "coordinates", "Lcom/example/weatherapp/domain/models/Coordinates;", "weatherEvents", "", "Lcom/example/weatherapp/domain/models/WeatherEvent;", "base", "", "mainWeatherData", "Lcom/example/weatherapp/domain/models/Weather;", "visibility", "", "wind", "Lcom/example/weatherapp/domain/models/Wind;", "clouds", "Lcom/example/weatherapp/domain/models/Clouds;", "dt", "sys", "Lcom/example/weatherapp/domain/models/Sys;", "cityId", "cityName", "cod", "(Lcom/example/weatherapp/domain/models/Coordinates;Ljava/util/List;Ljava/lang/String;Lcom/example/weatherapp/domain/models/Weather;ILcom/example/weatherapp/domain/models/Wind;Lcom/example/weatherapp/domain/models/Clouds;ILcom/example/weatherapp/domain/models/Sys;ILjava/lang/String;I)V", "getBase", "()Ljava/lang/String;", "getCityId", "()I", "getCityName", "getClouds", "()Lcom/example/weatherapp/domain/models/Clouds;", "getCod", "getCoordinates", "()Lcom/example/weatherapp/domain/models/Coordinates;", "getDt", "getMainWeatherData", "()Lcom/example/weatherapp/domain/models/Weather;", "getSys", "()Lcom/example/weatherapp/domain/models/Sys;", "getVisibility", "getWeatherEvents", "()Ljava/util/List;", "getWind", "()Lcom/example/weatherapp/domain/models/Wind;", "component1", "component10", "component11", "component12", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "toString", "app_release"})
public final class WeatherInfo {
    @org.jetbrains.annotations.NotNull()
    private final com.example.weatherapp.domain.models.Coordinates coordinates = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<com.example.weatherapp.domain.models.WeatherEvent> weatherEvents = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String base = null;
    @org.jetbrains.annotations.NotNull()
    private final com.example.weatherapp.domain.models.Weather mainWeatherData = null;
    private final int visibility = 0;
    @org.jetbrains.annotations.NotNull()
    private final com.example.weatherapp.domain.models.Wind wind = null;
    @org.jetbrains.annotations.NotNull()
    private final com.example.weatherapp.domain.models.Clouds clouds = null;
    private final int dt = 0;
    @org.jetbrains.annotations.NotNull()
    private final com.example.weatherapp.domain.models.Sys sys = null;
    private final int cityId = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String cityName = null;
    private final int cod = 0;
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.weatherapp.domain.models.Coordinates getCoordinates() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.example.weatherapp.domain.models.WeatherEvent> getWeatherEvents() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getBase() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.weatherapp.domain.models.Weather getMainWeatherData() {
        return null;
    }
    
    public final int getVisibility() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.weatherapp.domain.models.Wind getWind() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.weatherapp.domain.models.Clouds getClouds() {
        return null;
    }
    
    public final int getDt() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.weatherapp.domain.models.Sys getSys() {
        return null;
    }
    
    public final int getCityId() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCityName() {
        return null;
    }
    
    public final int getCod() {
        return 0;
    }
    
    public WeatherInfo(@org.jetbrains.annotations.NotNull()
    com.example.weatherapp.domain.models.Coordinates coordinates, @org.jetbrains.annotations.NotNull()
    java.util.List<com.example.weatherapp.domain.models.WeatherEvent> weatherEvents, @org.jetbrains.annotations.NotNull()
    java.lang.String base, @org.jetbrains.annotations.NotNull()
    com.example.weatherapp.domain.models.Weather mainWeatherData, int visibility, @org.jetbrains.annotations.NotNull()
    com.example.weatherapp.domain.models.Wind wind, @org.jetbrains.annotations.NotNull()
    com.example.weatherapp.domain.models.Clouds clouds, int dt, @org.jetbrains.annotations.NotNull()
    com.example.weatherapp.domain.models.Sys sys, int cityId, @org.jetbrains.annotations.NotNull()
    java.lang.String cityName, int cod) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.weatherapp.domain.models.Coordinates component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.example.weatherapp.domain.models.WeatherEvent> component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.weatherapp.domain.models.Weather component4() {
        return null;
    }
    
    public final int component5() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.weatherapp.domain.models.Wind component6() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.weatherapp.domain.models.Clouds component7() {
        return null;
    }
    
    public final int component8() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.weatherapp.domain.models.Sys component9() {
        return null;
    }
    
    public final int component10() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component11() {
        return null;
    }
    
    public final int component12() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.weatherapp.domain.models.WeatherInfo copy(@org.jetbrains.annotations.NotNull()
    com.example.weatherapp.domain.models.Coordinates coordinates, @org.jetbrains.annotations.NotNull()
    java.util.List<com.example.weatherapp.domain.models.WeatherEvent> weatherEvents, @org.jetbrains.annotations.NotNull()
    java.lang.String base, @org.jetbrains.annotations.NotNull()
    com.example.weatherapp.domain.models.Weather mainWeatherData, int visibility, @org.jetbrains.annotations.NotNull()
    com.example.weatherapp.domain.models.Wind wind, @org.jetbrains.annotations.NotNull()
    com.example.weatherapp.domain.models.Clouds clouds, int dt, @org.jetbrains.annotations.NotNull()
    com.example.weatherapp.domain.models.Sys sys, int cityId, @org.jetbrains.annotations.NotNull()
    java.lang.String cityName, int cod) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
        return false;
    }
}
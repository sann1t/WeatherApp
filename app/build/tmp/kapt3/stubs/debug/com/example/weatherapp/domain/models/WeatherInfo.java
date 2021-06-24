package com.example.weatherapp.domain.models;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b(\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0083\u0001\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\f\u00a2\u0006\u0002\u0010\u0017J\u000b\u0010-\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0010\u0010.\u001a\u0004\u0018\u00010\fH\u00c6\u0003\u00a2\u0006\u0002\u0010\u001bJ\u000b\u0010/\u001a\u0004\u0018\u00010\bH\u00c6\u0003J\u0010\u00100\u001a\u0004\u0018\u00010\fH\u00c6\u0003\u00a2\u0006\u0002\u0010\u001bJ\u0011\u00101\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005H\u00c6\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\bH\u00c6\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\nH\u00c6\u0003J\u0010\u00104\u001a\u0004\u0018\u00010\fH\u00c6\u0003\u00a2\u0006\u0002\u0010\u001bJ\u000b\u00105\u001a\u0004\u0018\u00010\u000eH\u00c6\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\u0010H\u00c6\u0003J\u0010\u00107\u001a\u0004\u0018\u00010\fH\u00c6\u0003\u00a2\u0006\u0002\u0010\u001bJ\u000b\u00108\u001a\u0004\u0018\u00010\u0013H\u00c6\u0003J\u00a4\u0001\u00109\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\fH\u00c6\u0001\u00a2\u0006\u0002\u0010:J\u0013\u0010;\u001a\u00020<2\b\u0010=\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010>\u001a\u00020\fH\u00d6\u0001J\t\u0010?\u001a\u00020\bH\u00d6\u0001R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0015\u0010\u0014\u001a\u0004\u0018\u00010\f\u00a2\u0006\n\n\u0002\u0010\u001c\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\u0015\u001a\u0004\u0018\u00010\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0019R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0015\u0010\u0016\u001a\u0004\u0018\u00010\f\u00a2\u0006\n\n\u0002\u0010\u001c\u001a\u0004\b \u0010\u001bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0015\u0010\u0011\u001a\u0004\u0018\u00010\f\u00a2\u0006\n\n\u0002\u0010\u001c\u001a\u0004\b#\u0010\u001bR\u0013\u0010\t\u001a\u0004\u0018\u00010\n\u00a2\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u00a2\u0006\b\n\u0000\u001a\u0004\b&\u0010\'R\u0015\u0010\u000b\u001a\u0004\u0018\u00010\f\u00a2\u0006\n\n\u0002\u0010\u001c\u001a\u0004\b(\u0010\u001bR\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b+\u0010,\u00a8\u0006@"}, d2 = {"Lcom/example/weatherapp/domain/models/WeatherInfo;", "", "coordinates", "Lcom/example/weatherapp/domain/models/Coordinates;", "weatherEvents", "", "Lcom/example/weatherapp/domain/models/WeatherEvent;", "base", "", "mainWeatherData", "Lcom/example/weatherapp/domain/models/Weather;", "visibility", "", "wind", "Lcom/example/weatherapp/domain/models/Wind;", "clouds", "Lcom/example/weatherapp/domain/models/Clouds;", "dt", "sys", "Lcom/example/weatherapp/domain/models/Sys;", "cityId", "cityName", "cod", "(Lcom/example/weatherapp/domain/models/Coordinates;Ljava/util/List;Ljava/lang/String;Lcom/example/weatherapp/domain/models/Weather;Ljava/lang/Integer;Lcom/example/weatherapp/domain/models/Wind;Lcom/example/weatherapp/domain/models/Clouds;Ljava/lang/Integer;Lcom/example/weatherapp/domain/models/Sys;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;)V", "getBase", "()Ljava/lang/String;", "getCityId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getCityName", "getClouds", "()Lcom/example/weatherapp/domain/models/Clouds;", "getCod", "getCoordinates", "()Lcom/example/weatherapp/domain/models/Coordinates;", "getDt", "getMainWeatherData", "()Lcom/example/weatherapp/domain/models/Weather;", "getSys", "()Lcom/example/weatherapp/domain/models/Sys;", "getVisibility", "getWeatherEvents", "()Ljava/util/List;", "getWind", "()Lcom/example/weatherapp/domain/models/Wind;", "component1", "component10", "component11", "component12", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Lcom/example/weatherapp/domain/models/Coordinates;Ljava/util/List;Ljava/lang/String;Lcom/example/weatherapp/domain/models/Weather;Ljava/lang/Integer;Lcom/example/weatherapp/domain/models/Wind;Lcom/example/weatherapp/domain/models/Clouds;Ljava/lang/Integer;Lcom/example/weatherapp/domain/models/Sys;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;)Lcom/example/weatherapp/domain/models/WeatherInfo;", "equals", "", "other", "hashCode", "toString", "app_debug"})
public final class WeatherInfo {
    @org.jetbrains.annotations.Nullable()
    private final com.example.weatherapp.domain.models.Coordinates coordinates = null;
    @org.jetbrains.annotations.Nullable()
    private final java.util.List<com.example.weatherapp.domain.models.WeatherEvent> weatherEvents = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String base = null;
    @org.jetbrains.annotations.Nullable()
    private final com.example.weatherapp.domain.models.Weather mainWeatherData = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Integer visibility = null;
    @org.jetbrains.annotations.Nullable()
    private final com.example.weatherapp.domain.models.Wind wind = null;
    @org.jetbrains.annotations.Nullable()
    private final com.example.weatherapp.domain.models.Clouds clouds = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Integer dt = null;
    @org.jetbrains.annotations.Nullable()
    private final com.example.weatherapp.domain.models.Sys sys = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Integer cityId = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String cityName = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Integer cod = null;
    
    @org.jetbrains.annotations.Nullable()
    public final com.example.weatherapp.domain.models.Coordinates getCoordinates() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.example.weatherapp.domain.models.WeatherEvent> getWeatherEvents() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getBase() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.example.weatherapp.domain.models.Weather getMainWeatherData() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getVisibility() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.example.weatherapp.domain.models.Wind getWind() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.example.weatherapp.domain.models.Clouds getClouds() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getDt() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.example.weatherapp.domain.models.Sys getSys() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getCityId() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getCityName() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getCod() {
        return null;
    }
    
    public WeatherInfo(@org.jetbrains.annotations.Nullable()
    com.example.weatherapp.domain.models.Coordinates coordinates, @org.jetbrains.annotations.Nullable()
    java.util.List<com.example.weatherapp.domain.models.WeatherEvent> weatherEvents, @org.jetbrains.annotations.Nullable()
    java.lang.String base, @org.jetbrains.annotations.Nullable()
    com.example.weatherapp.domain.models.Weather mainWeatherData, @org.jetbrains.annotations.Nullable()
    java.lang.Integer visibility, @org.jetbrains.annotations.Nullable()
    com.example.weatherapp.domain.models.Wind wind, @org.jetbrains.annotations.Nullable()
    com.example.weatherapp.domain.models.Clouds clouds, @org.jetbrains.annotations.Nullable()
    java.lang.Integer dt, @org.jetbrains.annotations.Nullable()
    com.example.weatherapp.domain.models.Sys sys, @org.jetbrains.annotations.Nullable()
    java.lang.Integer cityId, @org.jetbrains.annotations.Nullable()
    java.lang.String cityName, @org.jetbrains.annotations.Nullable()
    java.lang.Integer cod) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.example.weatherapp.domain.models.Coordinates component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.example.weatherapp.domain.models.WeatherEvent> component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.example.weatherapp.domain.models.Weather component4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component5() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.example.weatherapp.domain.models.Wind component6() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.example.weatherapp.domain.models.Clouds component7() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component8() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.example.weatherapp.domain.models.Sys component9() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component10() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component11() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component12() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.weatherapp.domain.models.WeatherInfo copy(@org.jetbrains.annotations.Nullable()
    com.example.weatherapp.domain.models.Coordinates coordinates, @org.jetbrains.annotations.Nullable()
    java.util.List<com.example.weatherapp.domain.models.WeatherEvent> weatherEvents, @org.jetbrains.annotations.Nullable()
    java.lang.String base, @org.jetbrains.annotations.Nullable()
    com.example.weatherapp.domain.models.Weather mainWeatherData, @org.jetbrains.annotations.Nullable()
    java.lang.Integer visibility, @org.jetbrains.annotations.Nullable()
    com.example.weatherapp.domain.models.Wind wind, @org.jetbrains.annotations.Nullable()
    com.example.weatherapp.domain.models.Clouds clouds, @org.jetbrains.annotations.Nullable()
    java.lang.Integer dt, @org.jetbrains.annotations.Nullable()
    com.example.weatherapp.domain.models.Sys sys, @org.jetbrains.annotations.Nullable()
    java.lang.Integer cityId, @org.jetbrains.annotations.Nullable()
    java.lang.String cityName, @org.jetbrains.annotations.Nullable()
    java.lang.Integer cod) {
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
package com.example.weatherapp.data.models.database;

import java.lang.System;

@androidx.room.Entity(tableName = "weatherInfoDatabase")
@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b<\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0099\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\u0015\u001a\u00020\b\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\f\u00a2\u0006\u0002\u0010\u0017J\u000b\u0010A\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0010\u0010B\u001a\u0004\u0018\u00010\fH\u00c6\u0003\u00a2\u0006\u0002\u0010\u001dJ\t\u0010C\u001a\u00020\bH\u00c6\u0003J\u0010\u0010D\u001a\u0004\u0018\u00010\fH\u00c6\u0003\u00a2\u0006\u0002\u0010\u001dJ\u0011\u0010E\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010F\u001a\u0004\u0018\u00010\bH\u00c6\u0003J\u000b\u0010G\u001a\u0004\u0018\u00010\nH\u00c6\u0003J\u0010\u0010H\u001a\u0004\u0018\u00010\fH\u00c6\u0003\u00a2\u0006\u0002\u0010\u001dJ\u000b\u0010I\u001a\u0004\u0018\u00010\u000eH\u00c6\u0003J\u000b\u0010J\u001a\u0004\u0018\u00010\u0010H\u00c6\u0003J\u0010\u0010K\u001a\u0004\u0018\u00010\fH\u00c6\u0003\u00a2\u0006\u0002\u0010\u001dJ\u000b\u0010L\u001a\u0004\u0018\u00010\u0013H\u00c6\u0003J\u00a2\u0001\u0010M\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\u0015\u001a\u00020\b2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\fH\u00c6\u0001\u00a2\u0006\u0002\u0010NJ\u0013\u0010O\u001a\u00020P2\b\u0010Q\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010R\u001a\u00020\fH\u00d6\u0001J\t\u0010S\u001a\u00020\bH\u00d6\u0001R \u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\"\u0010\u0014\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010 \u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001e\u0010\u0015\u001a\u00020\b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0019\"\u0004\b\"\u0010\u001bR \u0010\u000f\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\"\u0010\u0016\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010 \u001a\u0004\b\'\u0010\u001d\"\u0004\b(\u0010\u001fR \u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\"\u0010\u0011\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010 \u001a\u0004\b-\u0010\u001d\"\u0004\b.\u0010\u001fR \u0010\t\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b/\u00100\"\u0004\b1\u00102R \u0010\u0012\u001a\u0004\u0018\u00010\u00138\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\"\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010 \u001a\u0004\b7\u0010\u001d\"\u0004\b8\u0010\u001fR&\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R \u0010\r\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@\u00a8\u0006T"}, d2 = {"Lcom/example/weatherapp/data/models/database/WeatherInfoDatabase;", "", "coordinates", "Lcom/example/weatherapp/data/models/database/CoordinatesDatabase;", "weatherEvents", "", "Lcom/example/weatherapp/data/models/database/WeatherEventDatabase;", "base", "", "mainWeatherData", "Lcom/example/weatherapp/data/models/database/WeatherDatabase;", "visibility", "", "wind", "Lcom/example/weatherapp/data/models/database/WindDatabase;", "clouds", "Lcom/example/weatherapp/data/models/database/CloudsDatabase;", "dt", "sys", "Lcom/example/weatherapp/data/models/database/SysDatabase;", "cityId", "cityName", "cod", "(Lcom/example/weatherapp/data/models/database/CoordinatesDatabase;Ljava/util/List;Ljava/lang/String;Lcom/example/weatherapp/data/models/database/WeatherDatabase;Ljava/lang/Integer;Lcom/example/weatherapp/data/models/database/WindDatabase;Lcom/example/weatherapp/data/models/database/CloudsDatabase;Ljava/lang/Integer;Lcom/example/weatherapp/data/models/database/SysDatabase;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;)V", "getBase", "()Ljava/lang/String;", "setBase", "(Ljava/lang/String;)V", "getCityId", "()Ljava/lang/Integer;", "setCityId", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getCityName", "setCityName", "getClouds", "()Lcom/example/weatherapp/data/models/database/CloudsDatabase;", "setClouds", "(Lcom/example/weatherapp/data/models/database/CloudsDatabase;)V", "getCod", "setCod", "getCoordinates", "()Lcom/example/weatherapp/data/models/database/CoordinatesDatabase;", "setCoordinates", "(Lcom/example/weatherapp/data/models/database/CoordinatesDatabase;)V", "getDt", "setDt", "getMainWeatherData", "()Lcom/example/weatherapp/data/models/database/WeatherDatabase;", "setMainWeatherData", "(Lcom/example/weatherapp/data/models/database/WeatherDatabase;)V", "getSys", "()Lcom/example/weatherapp/data/models/database/SysDatabase;", "setSys", "(Lcom/example/weatherapp/data/models/database/SysDatabase;)V", "getVisibility", "setVisibility", "getWeatherEvents", "()Ljava/util/List;", "setWeatherEvents", "(Ljava/util/List;)V", "getWind", "()Lcom/example/weatherapp/data/models/database/WindDatabase;", "setWind", "(Lcom/example/weatherapp/data/models/database/WindDatabase;)V", "component1", "component10", "component11", "component12", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Lcom/example/weatherapp/data/models/database/CoordinatesDatabase;Ljava/util/List;Ljava/lang/String;Lcom/example/weatherapp/data/models/database/WeatherDatabase;Ljava/lang/Integer;Lcom/example/weatherapp/data/models/database/WindDatabase;Lcom/example/weatherapp/data/models/database/CloudsDatabase;Ljava/lang/Integer;Lcom/example/weatherapp/data/models/database/SysDatabase;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;)Lcom/example/weatherapp/data/models/database/WeatherInfoDatabase;", "equals", "", "other", "hashCode", "toString", "app_debug"})
public final class WeatherInfoDatabase {
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Embedded()
    private com.example.weatherapp.data.models.database.CoordinatesDatabase coordinates;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Ignore()
    @androidx.room.Embedded()
    private java.util.List<com.example.weatherapp.data.models.database.WeatherEventDatabase> weatherEvents;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "base")
    private java.lang.String base;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Embedded()
    private com.example.weatherapp.data.models.database.WeatherDatabase mainWeatherData;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "visibility")
    private java.lang.Integer visibility;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Embedded()
    private com.example.weatherapp.data.models.database.WindDatabase wind;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Embedded()
    private com.example.weatherapp.data.models.database.CloudsDatabase clouds;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "dt")
    private java.lang.Integer dt;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Embedded()
    private com.example.weatherapp.data.models.database.SysDatabase sys;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "cityId")
    private java.lang.Integer cityId;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "cityName")
    @androidx.room.PrimaryKey()
    private java.lang.String cityName;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "cod")
    private java.lang.Integer cod;
    
    @org.jetbrains.annotations.Nullable()
    public final com.example.weatherapp.data.models.database.CoordinatesDatabase getCoordinates() {
        return null;
    }
    
    public final void setCoordinates(@org.jetbrains.annotations.Nullable()
    com.example.weatherapp.data.models.database.CoordinatesDatabase p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.example.weatherapp.data.models.database.WeatherEventDatabase> getWeatherEvents() {
        return null;
    }
    
    public final void setWeatherEvents(@org.jetbrains.annotations.Nullable()
    java.util.List<com.example.weatherapp.data.models.database.WeatherEventDatabase> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getBase() {
        return null;
    }
    
    public final void setBase(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.example.weatherapp.data.models.database.WeatherDatabase getMainWeatherData() {
        return null;
    }
    
    public final void setMainWeatherData(@org.jetbrains.annotations.Nullable()
    com.example.weatherapp.data.models.database.WeatherDatabase p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getVisibility() {
        return null;
    }
    
    public final void setVisibility(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.example.weatherapp.data.models.database.WindDatabase getWind() {
        return null;
    }
    
    public final void setWind(@org.jetbrains.annotations.Nullable()
    com.example.weatherapp.data.models.database.WindDatabase p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.example.weatherapp.data.models.database.CloudsDatabase getClouds() {
        return null;
    }
    
    public final void setClouds(@org.jetbrains.annotations.Nullable()
    com.example.weatherapp.data.models.database.CloudsDatabase p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getDt() {
        return null;
    }
    
    public final void setDt(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.example.weatherapp.data.models.database.SysDatabase getSys() {
        return null;
    }
    
    public final void setSys(@org.jetbrains.annotations.Nullable()
    com.example.weatherapp.data.models.database.SysDatabase p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getCityId() {
        return null;
    }
    
    public final void setCityId(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCityName() {
        return null;
    }
    
    public final void setCityName(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getCod() {
        return null;
    }
    
    public final void setCod(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    public WeatherInfoDatabase(@org.jetbrains.annotations.Nullable()
    com.example.weatherapp.data.models.database.CoordinatesDatabase coordinates, @org.jetbrains.annotations.Nullable()
    java.util.List<com.example.weatherapp.data.models.database.WeatherEventDatabase> weatherEvents, @org.jetbrains.annotations.Nullable()
    java.lang.String base, @org.jetbrains.annotations.Nullable()
    com.example.weatherapp.data.models.database.WeatherDatabase mainWeatherData, @org.jetbrains.annotations.Nullable()
    java.lang.Integer visibility, @org.jetbrains.annotations.Nullable()
    com.example.weatherapp.data.models.database.WindDatabase wind, @org.jetbrains.annotations.Nullable()
    com.example.weatherapp.data.models.database.CloudsDatabase clouds, @org.jetbrains.annotations.Nullable()
    java.lang.Integer dt, @org.jetbrains.annotations.Nullable()
    com.example.weatherapp.data.models.database.SysDatabase sys, @org.jetbrains.annotations.Nullable()
    java.lang.Integer cityId, @org.jetbrains.annotations.NotNull()
    java.lang.String cityName, @org.jetbrains.annotations.Nullable()
    java.lang.Integer cod) {
        super();
    }
    
    public WeatherInfoDatabase() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.example.weatherapp.data.models.database.CoordinatesDatabase component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.example.weatherapp.data.models.database.WeatherEventDatabase> component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.example.weatherapp.data.models.database.WeatherDatabase component4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component5() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.example.weatherapp.data.models.database.WindDatabase component6() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.example.weatherapp.data.models.database.CloudsDatabase component7() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component8() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.example.weatherapp.data.models.database.SysDatabase component9() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component10() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component11() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component12() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.weatherapp.data.models.database.WeatherInfoDatabase copy(@org.jetbrains.annotations.Nullable()
    com.example.weatherapp.data.models.database.CoordinatesDatabase coordinates, @org.jetbrains.annotations.Nullable()
    java.util.List<com.example.weatherapp.data.models.database.WeatherEventDatabase> weatherEvents, @org.jetbrains.annotations.Nullable()
    java.lang.String base, @org.jetbrains.annotations.Nullable()
    com.example.weatherapp.data.models.database.WeatherDatabase mainWeatherData, @org.jetbrains.annotations.Nullable()
    java.lang.Integer visibility, @org.jetbrains.annotations.Nullable()
    com.example.weatherapp.data.models.database.WindDatabase wind, @org.jetbrains.annotations.Nullable()
    com.example.weatherapp.data.models.database.CloudsDatabase clouds, @org.jetbrains.annotations.Nullable()
    java.lang.Integer dt, @org.jetbrains.annotations.Nullable()
    com.example.weatherapp.data.models.database.SysDatabase sys, @org.jetbrains.annotations.Nullable()
    java.lang.Integer cityId, @org.jetbrains.annotations.NotNull()
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
package com.example.weatherapp.data.models.database;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u001a\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\bJ\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\nJ\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\nJ\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\nJ\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\nJ\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\nJJ\u0010\u001b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001\u00a2\u0006\u0002\u0010\u001cJ\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010 \u001a\u00020\u0003H\u00d6\u0001J\t\u0010!\u001a\u00020\"H\u00d6\u0001R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\r\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\"\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\r\u001a\u0004\b\u000e\u0010\n\"\u0004\b\u000f\u0010\fR\"\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\r\u001a\u0004\b\u0010\u0010\n\"\u0004\b\u0011\u0010\fR\"\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\r\u001a\u0004\b\u0012\u0010\n\"\u0004\b\u0013\u0010\fR\"\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\r\u001a\u0004\b\u0014\u0010\n\"\u0004\b\u0015\u0010\f\u00a8\u0006#"}, d2 = {"Lcom/example/weatherapp/data/models/database/WeatherDatabase;", "", "temperature", "", "pressure", "humidity", "minimumTemperature", "maximumTemperature", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V", "getHumidity", "()Ljava/lang/Integer;", "setHumidity", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getMaximumTemperature", "setMaximumTemperature", "getMinimumTemperature", "setMinimumTemperature", "getPressure", "setPressure", "getTemperature", "setTemperature", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/example/weatherapp/data/models/database/WeatherDatabase;", "equals", "", "other", "hashCode", "toString", "", "app_debug"})
public final class WeatherDatabase {
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "temperature")
    private java.lang.Integer temperature;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "pressure")
    private java.lang.Integer pressure;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "humidity")
    private java.lang.Integer humidity;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "minimumTemperature")
    private java.lang.Integer minimumTemperature;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "maximumTemperature")
    private java.lang.Integer maximumTemperature;
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getTemperature() {
        return null;
    }
    
    public final void setTemperature(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getPressure() {
        return null;
    }
    
    public final void setPressure(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getHumidity() {
        return null;
    }
    
    public final void setHumidity(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getMinimumTemperature() {
        return null;
    }
    
    public final void setMinimumTemperature(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getMaximumTemperature() {
        return null;
    }
    
    public final void setMaximumTemperature(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    public WeatherDatabase(@org.jetbrains.annotations.Nullable()
    java.lang.Integer temperature, @org.jetbrains.annotations.Nullable()
    java.lang.Integer pressure, @org.jetbrains.annotations.Nullable()
    java.lang.Integer humidity, @org.jetbrains.annotations.Nullable()
    java.lang.Integer minimumTemperature, @org.jetbrains.annotations.Nullable()
    java.lang.Integer maximumTemperature) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.weatherapp.data.models.database.WeatherDatabase copy(@org.jetbrains.annotations.Nullable()
    java.lang.Integer temperature, @org.jetbrains.annotations.Nullable()
    java.lang.Integer pressure, @org.jetbrains.annotations.Nullable()
    java.lang.Integer humidity, @org.jetbrains.annotations.Nullable()
    java.lang.Integer minimumTemperature, @org.jetbrains.annotations.Nullable()
    java.lang.Integer maximumTemperature) {
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
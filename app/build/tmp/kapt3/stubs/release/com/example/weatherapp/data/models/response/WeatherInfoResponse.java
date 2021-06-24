package com.example.weatherapp.data.models.response;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b&\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001Bk\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\f\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\f\u0012\u0006\u0010\u0015\u001a\u00020\b\u0012\u0006\u0010\u0016\u001a\u00020\f\u00a2\u0006\u0002\u0010\u0017J\t\u0010,\u001a\u00020\u0003H\u00c6\u0003J\t\u0010-\u001a\u00020\fH\u00c6\u0003J\t\u0010.\u001a\u00020\bH\u00c6\u0003J\t\u0010/\u001a\u00020\fH\u00c6\u0003J\u000f\u00100\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u00c6\u0003J\t\u00101\u001a\u00020\bH\u00c6\u0003J\t\u00102\u001a\u00020\nH\u00c6\u0003J\t\u00103\u001a\u00020\fH\u00c6\u0003J\t\u00104\u001a\u00020\u000eH\u00c6\u0003J\t\u00105\u001a\u00020\u0010H\u00c6\u0003J\t\u00106\u001a\u00020\fH\u00c6\u0003J\t\u00107\u001a\u00020\u0013H\u00c6\u0003J\u0087\u0001\u00108\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\f2\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\f2\b\b\u0002\u0010\u0015\u001a\u00020\b2\b\b\u0002\u0010\u0016\u001a\u00020\fH\u00c6\u0001J\u0013\u00109\u001a\u00020:2\b\u0010;\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010<\u001a\u00020\fH\u00d6\u0001J\t\u0010=\u001a\u00020\bH\u00d6\u0001R\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0016\u0010\u000f\u001a\u00020\u00108\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0016\u0010\u0016\u001a\u00020\f8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0016\u0010\u0011\u001a\u00020\f8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010\u001dR\u0016\u0010\u0014\u001a\u00020\f8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001dR\u0016\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0016\u0010\u0015\u001a\u00020\b8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0019R\u0016\u0010\u0012\u001a\u00020\u00138\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0016\u0010\u000b\u001a\u00020\f8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\'\u0010\u001dR\u001c\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0016\u0010\r\u001a\u00020\u000e8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b*\u0010+\u00a8\u0006>"}, d2 = {"Lcom/example/weatherapp/data/models/response/WeatherInfoResponse;", "", "coordResponse", "Lcom/example/weatherapp/data/models/response/CoordResponse;", "weatherResponse", "", "Lcom/example/weatherapp/data/models/response/WeatherResponse;", "base", "", "mainResponse", "Lcom/example/weatherapp/data/models/response/MainResponse;", "visibility", "", "wind", "Lcom/example/weatherapp/data/models/response/WindResponse;", "cloudsResponse", "Lcom/example/weatherapp/data/models/response/CloudsResponse;", "dt", "sysResponse", "Lcom/example/weatherapp/data/models/response/SysResponse;", "id", "name", "cod", "(Lcom/example/weatherapp/data/models/response/CoordResponse;Ljava/util/List;Ljava/lang/String;Lcom/example/weatherapp/data/models/response/MainResponse;ILcom/example/weatherapp/data/models/response/WindResponse;Lcom/example/weatherapp/data/models/response/CloudsResponse;ILcom/example/weatherapp/data/models/response/SysResponse;ILjava/lang/String;I)V", "getBase", "()Ljava/lang/String;", "getCloudsResponse", "()Lcom/example/weatherapp/data/models/response/CloudsResponse;", "getCod", "()I", "getCoordResponse", "()Lcom/example/weatherapp/data/models/response/CoordResponse;", "getDt", "getId", "getMainResponse", "()Lcom/example/weatherapp/data/models/response/MainResponse;", "getName", "getSysResponse", "()Lcom/example/weatherapp/data/models/response/SysResponse;", "getVisibility", "getWeatherResponse", "()Ljava/util/List;", "getWind", "()Lcom/example/weatherapp/data/models/response/WindResponse;", "component1", "component10", "component11", "component12", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "toString", "app_release"})
public final class WeatherInfoResponse {
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "coord")
    private final com.example.weatherapp.data.models.response.CoordResponse coordResponse = null;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "weather")
    private final java.util.List<com.example.weatherapp.data.models.response.WeatherResponse> weatherResponse = null;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "base")
    private final java.lang.String base = null;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "main")
    private final com.example.weatherapp.data.models.response.MainResponse mainResponse = null;
    @com.google.gson.annotations.SerializedName(value = "visibility")
    private final int visibility = 0;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "wind")
    private final com.example.weatherapp.data.models.response.WindResponse wind = null;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "clouds")
    private final com.example.weatherapp.data.models.response.CloudsResponse cloudsResponse = null;
    @com.google.gson.annotations.SerializedName(value = "dt")
    private final int dt = 0;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "sys")
    private final com.example.weatherapp.data.models.response.SysResponse sysResponse = null;
    @com.google.gson.annotations.SerializedName(value = "id")
    private final int id = 0;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "name")
    private final java.lang.String name = null;
    @com.google.gson.annotations.SerializedName(value = "cod")
    private final int cod = 0;
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.weatherapp.data.models.response.CoordResponse getCoordResponse() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.example.weatherapp.data.models.response.WeatherResponse> getWeatherResponse() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getBase() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.weatherapp.data.models.response.MainResponse getMainResponse() {
        return null;
    }
    
    public final int getVisibility() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.weatherapp.data.models.response.WindResponse getWind() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.weatherapp.data.models.response.CloudsResponse getCloudsResponse() {
        return null;
    }
    
    public final int getDt() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.weatherapp.data.models.response.SysResponse getSysResponse() {
        return null;
    }
    
    public final int getId() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getName() {
        return null;
    }
    
    public final int getCod() {
        return 0;
    }
    
    public WeatherInfoResponse(@org.jetbrains.annotations.NotNull()
    com.example.weatherapp.data.models.response.CoordResponse coordResponse, @org.jetbrains.annotations.NotNull()
    java.util.List<com.example.weatherapp.data.models.response.WeatherResponse> weatherResponse, @org.jetbrains.annotations.NotNull()
    java.lang.String base, @org.jetbrains.annotations.NotNull()
    com.example.weatherapp.data.models.response.MainResponse mainResponse, int visibility, @org.jetbrains.annotations.NotNull()
    com.example.weatherapp.data.models.response.WindResponse wind, @org.jetbrains.annotations.NotNull()
    com.example.weatherapp.data.models.response.CloudsResponse cloudsResponse, int dt, @org.jetbrains.annotations.NotNull()
    com.example.weatherapp.data.models.response.SysResponse sysResponse, int id, @org.jetbrains.annotations.NotNull()
    java.lang.String name, int cod) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.weatherapp.data.models.response.CoordResponse component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.example.weatherapp.data.models.response.WeatherResponse> component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.weatherapp.data.models.response.MainResponse component4() {
        return null;
    }
    
    public final int component5() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.weatherapp.data.models.response.WindResponse component6() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.weatherapp.data.models.response.CloudsResponse component7() {
        return null;
    }
    
    public final int component8() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.weatherapp.data.models.response.SysResponse component9() {
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
    public final com.example.weatherapp.data.models.response.WeatherInfoResponse copy(@org.jetbrains.annotations.NotNull()
    com.example.weatherapp.data.models.response.CoordResponse coordResponse, @org.jetbrains.annotations.NotNull()
    java.util.List<com.example.weatherapp.data.models.response.WeatherResponse> weatherResponse, @org.jetbrains.annotations.NotNull()
    java.lang.String base, @org.jetbrains.annotations.NotNull()
    com.example.weatherapp.data.models.response.MainResponse mainResponse, int visibility, @org.jetbrains.annotations.NotNull()
    com.example.weatherapp.data.models.response.WindResponse wind, @org.jetbrains.annotations.NotNull()
    com.example.weatherapp.data.models.response.CloudsResponse cloudsResponse, int dt, @org.jetbrains.annotations.NotNull()
    com.example.weatherapp.data.models.response.SysResponse sysResponse, int id, @org.jetbrains.annotations.NotNull()
    java.lang.String name, int cod) {
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
package com.example.weatherapp.data.models.response;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b(\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0083\u0001\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\f\u00a2\u0006\u0002\u0010\u0017J\u000b\u0010-\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0010\u0010.\u001a\u0004\u0018\u00010\fH\u00c6\u0003\u00a2\u0006\u0002\u0010\u001dJ\u000b\u0010/\u001a\u0004\u0018\u00010\bH\u00c6\u0003J\u0010\u00100\u001a\u0004\u0018\u00010\fH\u00c6\u0003\u00a2\u0006\u0002\u0010\u001dJ\u0011\u00101\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005H\u00c6\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\bH\u00c6\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\nH\u00c6\u0003J\u0010\u00104\u001a\u0004\u0018\u00010\fH\u00c6\u0003\u00a2\u0006\u0002\u0010\u001dJ\u000b\u00105\u001a\u0004\u0018\u00010\u000eH\u00c6\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\u0010H\u00c6\u0003J\u0010\u00107\u001a\u0004\u0018\u00010\fH\u00c6\u0003\u00a2\u0006\u0002\u0010\u001dJ\u000b\u00108\u001a\u0004\u0018\u00010\u0013H\u00c6\u0003J\u00a4\u0001\u00109\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\fH\u00c6\u0001\u00a2\u0006\u0002\u0010:J\u0013\u0010;\u001a\u00020<2\b\u0010=\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010>\u001a\u00020\fH\u00d6\u0001J\t\u0010?\u001a\u00020\bH\u00d6\u0001R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0016\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010\u001e\u001a\u0004\b\u001c\u0010\u001dR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u001a\u0010\u0011\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010\u001e\u001a\u0004\b!\u0010\u001dR\u001a\u0010\u0014\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010\u001e\u001a\u0004\b\"\u0010\u001dR\u0018\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b%\u0010\u0019R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b&\u0010\'R\u001a\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010\u001e\u001a\u0004\b(\u0010\u001dR\u001e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0018\u0010\r\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b+\u0010,\u00a8\u0006@"}, d2 = {"Lcom/example/weatherapp/data/models/response/WeatherInfoResponse;", "", "coordResponse", "Lcom/example/weatherapp/data/models/response/CoordResponse;", "weatherResponse", "", "Lcom/example/weatherapp/data/models/response/WeatherResponse;", "base", "", "mainResponse", "Lcom/example/weatherapp/data/models/response/MainResponse;", "visibility", "", "windResponse", "Lcom/example/weatherapp/data/models/response/WindResponse;", "cloudsResponse", "Lcom/example/weatherapp/data/models/response/CloudsResponse;", "dt", "sysResponse", "Lcom/example/weatherapp/data/models/response/SysResponse;", "id", "name", "cod", "(Lcom/example/weatherapp/data/models/response/CoordResponse;Ljava/util/List;Ljava/lang/String;Lcom/example/weatherapp/data/models/response/MainResponse;Ljava/lang/Integer;Lcom/example/weatherapp/data/models/response/WindResponse;Lcom/example/weatherapp/data/models/response/CloudsResponse;Ljava/lang/Integer;Lcom/example/weatherapp/data/models/response/SysResponse;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;)V", "getBase", "()Ljava/lang/String;", "getCloudsResponse", "()Lcom/example/weatherapp/data/models/response/CloudsResponse;", "getCod", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getCoordResponse", "()Lcom/example/weatherapp/data/models/response/CoordResponse;", "getDt", "getId", "getMainResponse", "()Lcom/example/weatherapp/data/models/response/MainResponse;", "getName", "getSysResponse", "()Lcom/example/weatherapp/data/models/response/SysResponse;", "getVisibility", "getWeatherResponse", "()Ljava/util/List;", "getWindResponse", "()Lcom/example/weatherapp/data/models/response/WindResponse;", "component1", "component10", "component11", "component12", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Lcom/example/weatherapp/data/models/response/CoordResponse;Ljava/util/List;Ljava/lang/String;Lcom/example/weatherapp/data/models/response/MainResponse;Ljava/lang/Integer;Lcom/example/weatherapp/data/models/response/WindResponse;Lcom/example/weatherapp/data/models/response/CloudsResponse;Ljava/lang/Integer;Lcom/example/weatherapp/data/models/response/SysResponse;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;)Lcom/example/weatherapp/data/models/response/WeatherInfoResponse;", "equals", "", "other", "hashCode", "toString", "app_debug"})
public final class WeatherInfoResponse {
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "coord")
    private final com.example.weatherapp.data.models.response.CoordResponse coordResponse = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "weather")
    private final java.util.List<com.example.weatherapp.data.models.response.WeatherResponse> weatherResponse = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "base")
    private final java.lang.String base = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "main")
    private final com.example.weatherapp.data.models.response.MainResponse mainResponse = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "visibility")
    private final java.lang.Integer visibility = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "wind")
    private final com.example.weatherapp.data.models.response.WindResponse windResponse = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "cloudsDatabase")
    private final com.example.weatherapp.data.models.response.CloudsResponse cloudsResponse = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "dt")
    private final java.lang.Integer dt = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "sys")
    private final com.example.weatherapp.data.models.response.SysResponse sysResponse = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "id")
    private final java.lang.Integer id = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "name")
    private final java.lang.String name = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "cod")
    private final java.lang.Integer cod = null;
    
    @org.jetbrains.annotations.Nullable()
    public final com.example.weatherapp.data.models.response.CoordResponse getCoordResponse() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.example.weatherapp.data.models.response.WeatherResponse> getWeatherResponse() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getBase() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.example.weatherapp.data.models.response.MainResponse getMainResponse() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getVisibility() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.example.weatherapp.data.models.response.WindResponse getWindResponse() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.example.weatherapp.data.models.response.CloudsResponse getCloudsResponse() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getDt() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.example.weatherapp.data.models.response.SysResponse getSysResponse() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getId() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getName() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getCod() {
        return null;
    }
    
    public WeatherInfoResponse(@org.jetbrains.annotations.Nullable()
    com.example.weatherapp.data.models.response.CoordResponse coordResponse, @org.jetbrains.annotations.Nullable()
    java.util.List<com.example.weatherapp.data.models.response.WeatherResponse> weatherResponse, @org.jetbrains.annotations.Nullable()
    java.lang.String base, @org.jetbrains.annotations.Nullable()
    com.example.weatherapp.data.models.response.MainResponse mainResponse, @org.jetbrains.annotations.Nullable()
    java.lang.Integer visibility, @org.jetbrains.annotations.Nullable()
    com.example.weatherapp.data.models.response.WindResponse windResponse, @org.jetbrains.annotations.Nullable()
    com.example.weatherapp.data.models.response.CloudsResponse cloudsResponse, @org.jetbrains.annotations.Nullable()
    java.lang.Integer dt, @org.jetbrains.annotations.Nullable()
    com.example.weatherapp.data.models.response.SysResponse sysResponse, @org.jetbrains.annotations.Nullable()
    java.lang.Integer id, @org.jetbrains.annotations.Nullable()
    java.lang.String name, @org.jetbrains.annotations.Nullable()
    java.lang.Integer cod) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.example.weatherapp.data.models.response.CoordResponse component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.example.weatherapp.data.models.response.WeatherResponse> component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.example.weatherapp.data.models.response.MainResponse component4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component5() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.example.weatherapp.data.models.response.WindResponse component6() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.example.weatherapp.data.models.response.CloudsResponse component7() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component8() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.example.weatherapp.data.models.response.SysResponse component9() {
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
    public final com.example.weatherapp.data.models.response.WeatherInfoResponse copy(@org.jetbrains.annotations.Nullable()
    com.example.weatherapp.data.models.response.CoordResponse coordResponse, @org.jetbrains.annotations.Nullable()
    java.util.List<com.example.weatherapp.data.models.response.WeatherResponse> weatherResponse, @org.jetbrains.annotations.Nullable()
    java.lang.String base, @org.jetbrains.annotations.Nullable()
    com.example.weatherapp.data.models.response.MainResponse mainResponse, @org.jetbrains.annotations.Nullable()
    java.lang.Integer visibility, @org.jetbrains.annotations.Nullable()
    com.example.weatherapp.data.models.response.WindResponse windResponse, @org.jetbrains.annotations.Nullable()
    com.example.weatherapp.data.models.response.CloudsResponse cloudsResponse, @org.jetbrains.annotations.Nullable()
    java.lang.Integer dt, @org.jetbrains.annotations.Nullable()
    com.example.weatherapp.data.models.response.SysResponse sysResponse, @org.jetbrains.annotations.Nullable()
    java.lang.Integer id, @org.jetbrains.annotations.Nullable()
    java.lang.String name, @org.jetbrains.annotations.Nullable()
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
package com.example.weatherapp.data.mappers;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u00a2\u0006\u0002\u0010\u000eJ\u001e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00102\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0010J\u0010\u0010\u0014\u001a\u00020\u00132\b\u0010\u0015\u001a\u0004\u0018\u00010\u0011J\u0010\u0010\u0016\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013J\u0010\u0010\u0017\u001a\u00020\u00112\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001a"}, d2 = {"Lcom/example/weatherapp/data/mappers/WeatherInfoMapper;", "", "coordinatesMapper", "Lcom/example/weatherapp/data/mappers/CoordinatesMapper;", "weatherEventMapper", "Lcom/example/weatherapp/data/mappers/WeatherEventMapper;", "weatherMapper", "Lcom/example/weatherapp/data/mappers/WeatherMapper;", "windMapper", "Lcom/example/weatherapp/data/mappers/WindMapper;", "cloudsMapper", "Lcom/example/weatherapp/data/mappers/CloudsMapper;", "sysMapper", "Lcom/example/weatherapp/data/mappers/SysMapper;", "(Lcom/example/weatherapp/data/mappers/CoordinatesMapper;Lcom/example/weatherapp/data/mappers/WeatherEventMapper;Lcom/example/weatherapp/data/mappers/WeatherMapper;Lcom/example/weatherapp/data/mappers/WindMapper;Lcom/example/weatherapp/data/mappers/CloudsMapper;Lcom/example/weatherapp/data/mappers/SysMapper;)V", "listMapToDomainFromDatabase", "", "Lcom/example/weatherapp/domain/models/WeatherInfo;", "weatherInfoDatabase", "Lcom/example/weatherapp/data/models/database/WeatherInfoDatabase;", "mapToDatabaseFromDomain", "weatherInfo", "mapToDomainFromDatabase", "mapToDomainFromResponse", "weatherInfoResponse", "Lcom/example/weatherapp/data/models/response/WeatherInfoResponse;", "app_debug"})
public final class WeatherInfoMapper {
    private final com.example.weatherapp.data.mappers.CoordinatesMapper coordinatesMapper = null;
    private final com.example.weatherapp.data.mappers.WeatherEventMapper weatherEventMapper = null;
    private final com.example.weatherapp.data.mappers.WeatherMapper weatherMapper = null;
    private final com.example.weatherapp.data.mappers.WindMapper windMapper = null;
    private final com.example.weatherapp.data.mappers.CloudsMapper cloudsMapper = null;
    private final com.example.weatherapp.data.mappers.SysMapper sysMapper = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.weatherapp.domain.models.WeatherInfo mapToDomainFromResponse(@org.jetbrains.annotations.Nullable()
    com.example.weatherapp.data.models.response.WeatherInfoResponse weatherInfoResponse) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.weatherapp.data.models.database.WeatherInfoDatabase mapToDatabaseFromDomain(@org.jetbrains.annotations.Nullable()
    com.example.weatherapp.domain.models.WeatherInfo weatherInfo) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.weatherapp.domain.models.WeatherInfo mapToDomainFromDatabase(@org.jetbrains.annotations.Nullable()
    com.example.weatherapp.data.models.database.WeatherInfoDatabase weatherInfoDatabase) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.example.weatherapp.domain.models.WeatherInfo> listMapToDomainFromDatabase(@org.jetbrains.annotations.Nullable()
    java.util.List<com.example.weatherapp.data.models.database.WeatherInfoDatabase> weatherInfoDatabase) {
        return null;
    }
    
    public WeatherInfoMapper(@org.jetbrains.annotations.NotNull()
    com.example.weatherapp.data.mappers.CoordinatesMapper coordinatesMapper, @org.jetbrains.annotations.NotNull()
    com.example.weatherapp.data.mappers.WeatherEventMapper weatherEventMapper, @org.jetbrains.annotations.NotNull()
    com.example.weatherapp.data.mappers.WeatherMapper weatherMapper, @org.jetbrains.annotations.NotNull()
    com.example.weatherapp.data.mappers.WindMapper windMapper, @org.jetbrains.annotations.NotNull()
    com.example.weatherapp.data.mappers.CloudsMapper cloudsMapper, @org.jetbrains.annotations.NotNull()
    com.example.weatherapp.data.mappers.SysMapper sysMapper) {
        super();
    }
}
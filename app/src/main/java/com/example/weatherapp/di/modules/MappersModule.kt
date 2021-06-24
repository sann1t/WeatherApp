package com.example.weatherapp.di.modules

import com.example.weatherapp.data.mappers.*
import dagger.Module
import dagger.Provides

@Module
class MappersModule {

    @Provides
    fun provideWeatherInfoMapper(
        coordinatesMapper: CoordinatesMapper,
        weatherEventMapper: WeatherEventMapper,
        weatherMapper: WeatherMapper,
        windMapper: WindMapper,
        cloudsMapper: CloudsMapper,
        sysMapper: SysMapper
    ) = WeatherInfoMapper(
        coordinatesMapper,
        weatherEventMapper,
        weatherMapper,
        windMapper,
        cloudsMapper,
        sysMapper
    )

    @Provides
    fun provideCoordinatesMapper() = CoordinatesMapper()

    @Provides
    fun provideWeatherEventMapper() = WeatherEventMapper()

    @Provides
    fun provideWeatherMapper() = WeatherMapper()

    @Provides
    fun provideWindMapper() = WindMapper()

    @Provides
    fun provideCloudsMapper() =  CloudsMapper()

    @Provides
    fun provideSysMapper() =  SysMapper()

}
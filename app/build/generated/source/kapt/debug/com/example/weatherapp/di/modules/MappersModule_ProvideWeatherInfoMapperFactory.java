// Generated by Dagger (https://dagger.dev).
package com.example.weatherapp.di.modules;

import com.example.weatherapp.data.mappers.CloudsMapper;
import com.example.weatherapp.data.mappers.CoordinatesMapper;
import com.example.weatherapp.data.mappers.SysMapper;
import com.example.weatherapp.data.mappers.WeatherEventMapper;
import com.example.weatherapp.data.mappers.WeatherInfoMapper;
import com.example.weatherapp.data.mappers.WeatherMapper;
import com.example.weatherapp.data.mappers.WindMapper;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class MappersModule_ProvideWeatherInfoMapperFactory implements Factory<WeatherInfoMapper> {
  private final MappersModule module;

  private final Provider<CoordinatesMapper> coordinatesMapperProvider;

  private final Provider<WeatherEventMapper> weatherEventMapperProvider;

  private final Provider<WeatherMapper> weatherMapperProvider;

  private final Provider<WindMapper> windMapperProvider;

  private final Provider<CloudsMapper> cloudsMapperProvider;

  private final Provider<SysMapper> sysMapperProvider;

  public MappersModule_ProvideWeatherInfoMapperFactory(MappersModule module,
      Provider<CoordinatesMapper> coordinatesMapperProvider,
      Provider<WeatherEventMapper> weatherEventMapperProvider,
      Provider<WeatherMapper> weatherMapperProvider, Provider<WindMapper> windMapperProvider,
      Provider<CloudsMapper> cloudsMapperProvider, Provider<SysMapper> sysMapperProvider) {
    this.module = module;
    this.coordinatesMapperProvider = coordinatesMapperProvider;
    this.weatherEventMapperProvider = weatherEventMapperProvider;
    this.weatherMapperProvider = weatherMapperProvider;
    this.windMapperProvider = windMapperProvider;
    this.cloudsMapperProvider = cloudsMapperProvider;
    this.sysMapperProvider = sysMapperProvider;
  }

  @Override
  public WeatherInfoMapper get() {
    return provideWeatherInfoMapper(module, coordinatesMapperProvider.get(), weatherEventMapperProvider.get(), weatherMapperProvider.get(), windMapperProvider.get(), cloudsMapperProvider.get(), sysMapperProvider.get());
  }

  public static MappersModule_ProvideWeatherInfoMapperFactory create(MappersModule module,
      Provider<CoordinatesMapper> coordinatesMapperProvider,
      Provider<WeatherEventMapper> weatherEventMapperProvider,
      Provider<WeatherMapper> weatherMapperProvider, Provider<WindMapper> windMapperProvider,
      Provider<CloudsMapper> cloudsMapperProvider, Provider<SysMapper> sysMapperProvider) {
    return new MappersModule_ProvideWeatherInfoMapperFactory(module, coordinatesMapperProvider, weatherEventMapperProvider, weatherMapperProvider, windMapperProvider, cloudsMapperProvider, sysMapperProvider);
  }

  public static WeatherInfoMapper provideWeatherInfoMapper(MappersModule instance,
      CoordinatesMapper coordinatesMapper, WeatherEventMapper weatherEventMapper,
      WeatherMapper weatherMapper, WindMapper windMapper, CloudsMapper cloudsMapper,
      SysMapper sysMapper) {
    return Preconditions.checkNotNullFromProvides(instance.provideWeatherInfoMapper(coordinatesMapper, weatherEventMapper, weatherMapper, windMapper, cloudsMapper, sysMapper));
  }
}

// Generated by Dagger (https://dagger.dev).
package com.example.weatherapp.di.modules;

import com.example.weatherapp.data.mappers.CloudsMapper;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class MappersModule_ProvideCloudsMapperFactory implements Factory<CloudsMapper> {
  private final MappersModule module;

  public MappersModule_ProvideCloudsMapperFactory(MappersModule module) {
    this.module = module;
  }

  @Override
  public CloudsMapper get() {
    return provideCloudsMapper(module);
  }

  public static MappersModule_ProvideCloudsMapperFactory create(MappersModule module) {
    return new MappersModule_ProvideCloudsMapperFactory(module);
  }

  public static CloudsMapper provideCloudsMapper(MappersModule instance) {
    return Preconditions.checkNotNullFromProvides(instance.provideCloudsMapper());
  }
}

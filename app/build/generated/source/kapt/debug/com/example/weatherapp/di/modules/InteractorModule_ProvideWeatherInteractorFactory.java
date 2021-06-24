// Generated by Dagger (https://dagger.dev).
package com.example.weatherapp.di.modules;

import com.example.weatherapp.domain.interactor.WeatherInteractor;
import com.example.weatherapp.domain.repositories.WeatherRepository;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class InteractorModule_ProvideWeatherInteractorFactory implements Factory<WeatherInteractor> {
  private final InteractorModule module;

  private final Provider<WeatherRepository> weatherRepositoryProvider;

  public InteractorModule_ProvideWeatherInteractorFactory(InteractorModule module,
      Provider<WeatherRepository> weatherRepositoryProvider) {
    this.module = module;
    this.weatherRepositoryProvider = weatherRepositoryProvider;
  }

  @Override
  public WeatherInteractor get() {
    return provideWeatherInteractor(module, weatherRepositoryProvider.get());
  }

  public static InteractorModule_ProvideWeatherInteractorFactory create(InteractorModule module,
      Provider<WeatherRepository> weatherRepositoryProvider) {
    return new InteractorModule_ProvideWeatherInteractorFactory(module, weatherRepositoryProvider);
  }

  public static WeatherInteractor provideWeatherInteractor(InteractorModule instance,
      WeatherRepository weatherRepository) {
    return Preconditions.checkNotNullFromProvides(instance.provideWeatherInteractor(weatherRepository));
  }
}
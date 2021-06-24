// Generated by Dagger (https://dagger.dev).
package com.example.weatherapp.di.components;

import android.app.Application;
import com.example.weatherapp.data.mappers.CloudsMapper;
import com.example.weatherapp.data.mappers.CoordinatesMapper;
import com.example.weatherapp.data.mappers.SysMapper;
import com.example.weatherapp.data.mappers.WeatherEventMapper;
import com.example.weatherapp.data.mappers.WeatherInfoMapper;
import com.example.weatherapp.data.mappers.WeatherMapper;
import com.example.weatherapp.data.mappers.WindMapper;
import com.example.weatherapp.data.repositories.database.WeatherDao;
import com.example.weatherapp.data.repositories.network.WeatherAPI;
import com.example.weatherapp.di.modules.DatabaseModule;
import com.example.weatherapp.di.modules.DatabaseModule_ProvideDatabaseFactory;
import com.example.weatherapp.di.modules.InteractorModule;
import com.example.weatherapp.di.modules.InteractorModule_ProvideWeatherInteractorFactory;
import com.example.weatherapp.di.modules.MappersModule;
import com.example.weatherapp.di.modules.MappersModule_ProvideCloudsMapperFactory;
import com.example.weatherapp.di.modules.MappersModule_ProvideCoordinatesMapperFactory;
import com.example.weatherapp.di.modules.MappersModule_ProvideSysMapperFactory;
import com.example.weatherapp.di.modules.MappersModule_ProvideWeatherEventMapperFactory;
import com.example.weatherapp.di.modules.MappersModule_ProvideWeatherInfoMapperFactory;
import com.example.weatherapp.di.modules.MappersModule_ProvideWeatherMapperFactory;
import com.example.weatherapp.di.modules.MappersModule_ProvideWindMapperFactory;
import com.example.weatherapp.di.modules.NetworkModule;
import com.example.weatherapp.di.modules.NetworkModule_ProvideRetrofitFactory;
import com.example.weatherapp.di.modules.NetworkModule_ProvideWeatherAPIFactory;
import com.example.weatherapp.di.modules.RepositoryModule;
import com.example.weatherapp.di.modules.RepositoryModule_ProvideWeatherRepositoryFactory;
import com.example.weatherapp.domain.interactor.WeatherInteractor;
import com.example.weatherapp.domain.repositories.WeatherRepository;
import com.example.weatherapp.presentation.citiesactivity.di.CitiesModule;
import com.example.weatherapp.presentation.citiesactivity.di.CitiesModule_ProvideViewModelFactoryFactory;
import com.example.weatherapp.presentation.citiesactivity.di.CitiesSubComponent;
import com.example.weatherapp.presentation.citiesactivity.di.factory.CitiesViewModelFactory;
import com.example.weatherapp.presentation.citiesactivity.view.CitiesActivity;
import com.example.weatherapp.presentation.citiesactivity.view.CitiesActivity_MembersInjector;
import com.example.weatherapp.presentation.weatheractivity.di.WeatherModule;
import com.example.weatherapp.presentation.weatheractivity.di.WeatherModule_ProvideViewModelFactoryFactory;
import com.example.weatherapp.presentation.weatheractivity.di.WeatherSubComponent;
import com.example.weatherapp.presentation.weatheractivity.di.factory.WeatherViewModelFactory;
import com.example.weatherapp.presentation.weatheractivity.view.WeatherActivity;
import com.example.weatherapp.presentation.weatheractivity.view.WeatherActivity_MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.DoubleCheck;
import dagger.internal.InstanceFactory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import retrofit2.Retrofit;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class DaggerAppComponent implements AppComponent {
  private final DaggerAppComponent appComponent = this;

  private Provider<Retrofit> provideRetrofitProvider;

  private Provider<WeatherAPI> provideWeatherAPIProvider;

  private Provider<CoordinatesMapper> provideCoordinatesMapperProvider;

  private Provider<WeatherEventMapper> provideWeatherEventMapperProvider;

  private Provider<WeatherMapper> provideWeatherMapperProvider;

  private Provider<WindMapper> provideWindMapperProvider;

  private Provider<CloudsMapper> provideCloudsMapperProvider;

  private Provider<SysMapper> provideSysMapperProvider;

  private Provider<WeatherInfoMapper> provideWeatherInfoMapperProvider;

  private Provider<Application> withApplicationProvider;

  private Provider<WeatherDao> provideDatabaseProvider;

  private Provider<WeatherRepository> provideWeatherRepositoryProvider;

  private Provider<WeatherInteractor> provideWeatherInteractorProvider;

  private DaggerAppComponent(NetworkModule networkModuleParam, MappersModule mappersModuleParam,
      RepositoryModule repositoryModuleParam, DatabaseModule databaseModuleParam,
      InteractorModule interactorModuleParam, Application withApplicationParam) {

    initialize(networkModuleParam, mappersModuleParam, repositoryModuleParam, databaseModuleParam, interactorModuleParam, withApplicationParam);
  }

  public static AppComponent.Builder builder() {
    return new Builder();
  }

  @SuppressWarnings("unchecked")
  private void initialize(final NetworkModule networkModuleParam,
      final MappersModule mappersModuleParam, final RepositoryModule repositoryModuleParam,
      final DatabaseModule databaseModuleParam, final InteractorModule interactorModuleParam,
      final Application withApplicationParam) {
    this.provideRetrofitProvider = DoubleCheck.provider(NetworkModule_ProvideRetrofitFactory.create(networkModuleParam));
    this.provideWeatherAPIProvider = DoubleCheck.provider(NetworkModule_ProvideWeatherAPIFactory.create(networkModuleParam, provideRetrofitProvider));
    this.provideCoordinatesMapperProvider = MappersModule_ProvideCoordinatesMapperFactory.create(mappersModuleParam);
    this.provideWeatherEventMapperProvider = MappersModule_ProvideWeatherEventMapperFactory.create(mappersModuleParam);
    this.provideWeatherMapperProvider = MappersModule_ProvideWeatherMapperFactory.create(mappersModuleParam);
    this.provideWindMapperProvider = MappersModule_ProvideWindMapperFactory.create(mappersModuleParam);
    this.provideCloudsMapperProvider = MappersModule_ProvideCloudsMapperFactory.create(mappersModuleParam);
    this.provideSysMapperProvider = MappersModule_ProvideSysMapperFactory.create(mappersModuleParam);
    this.provideWeatherInfoMapperProvider = MappersModule_ProvideWeatherInfoMapperFactory.create(mappersModuleParam, provideCoordinatesMapperProvider, provideWeatherEventMapperProvider, provideWeatherMapperProvider, provideWindMapperProvider, provideCloudsMapperProvider, provideSysMapperProvider);
    this.withApplicationProvider = InstanceFactory.create(withApplicationParam);
    this.provideDatabaseProvider = DoubleCheck.provider(DatabaseModule_ProvideDatabaseFactory.create(databaseModuleParam, withApplicationProvider));
    this.provideWeatherRepositoryProvider = DoubleCheck.provider(RepositoryModule_ProvideWeatherRepositoryFactory.create(repositoryModuleParam, provideWeatherAPIProvider, provideWeatherInfoMapperProvider, provideDatabaseProvider));
    this.provideWeatherInteractorProvider = DoubleCheck.provider(InteractorModule_ProvideWeatherInteractorFactory.create(interactorModuleParam, provideWeatherRepositoryProvider));
  }

  @Override
  public WeatherSubComponent.Builder getActivitySubComponentBuilder() {
    return new WeatherSubComponentBuilder(appComponent);
  }

  @Override
  public CitiesSubComponent.Builder getCitiesSubComponentBuilder() {
    return new CitiesSubComponentBuilder(appComponent);
  }

  private static final class Builder implements AppComponent.Builder {
    private Application withApplication;

    @Override
    public Builder withApplication(Application application) {
      this.withApplication = Preconditions.checkNotNull(application);
      return this;
    }

    @Override
    public AppComponent build() {
      Preconditions.checkBuilderRequirement(withApplication, Application.class);
      return new DaggerAppComponent(new NetworkModule(), new MappersModule(), new RepositoryModule(), new DatabaseModule(), new InteractorModule(), withApplication);
    }
  }

  private static final class WeatherSubComponentBuilder implements WeatherSubComponent.Builder {
    private final DaggerAppComponent appComponent;

    private WeatherSubComponentBuilder(DaggerAppComponent appComponent) {
      this.appComponent = appComponent;
    }

    @Override
    public WeatherSubComponent build() {
      return new WeatherSubComponentImpl(appComponent, new WeatherModule());
    }
  }

  private static final class WeatherSubComponentImpl implements WeatherSubComponent {
    private final DaggerAppComponent appComponent;

    private final WeatherSubComponentImpl weatherSubComponentImpl = this;

    private Provider<WeatherViewModelFactory> provideViewModelFactoryProvider;

    private WeatherSubComponentImpl(DaggerAppComponent appComponent,
        WeatherModule weatherModuleParam) {
      this.appComponent = appComponent;

      initialize(weatherModuleParam);
    }

    @SuppressWarnings("unchecked")
    private void initialize(final WeatherModule weatherModuleParam) {
      this.provideViewModelFactoryProvider = DoubleCheck.provider(WeatherModule_ProvideViewModelFactoryFactory.create(weatherModuleParam, appComponent.provideWeatherInteractorProvider));
    }

    @Override
    public void inject(WeatherActivity weatherActivity) {
      injectWeatherActivity(weatherActivity);
    }

    private WeatherActivity injectWeatherActivity(WeatherActivity instance) {
      WeatherActivity_MembersInjector.injectWeatherViewModelFactory(instance, provideViewModelFactoryProvider.get());
      return instance;
    }
  }

  private static final class CitiesSubComponentBuilder implements CitiesSubComponent.Builder {
    private final DaggerAppComponent appComponent;

    private CitiesSubComponentBuilder(DaggerAppComponent appComponent) {
      this.appComponent = appComponent;
    }

    @Override
    public CitiesSubComponent build() {
      return new CitiesSubComponentImpl(appComponent, new CitiesModule());
    }
  }

  private static final class CitiesSubComponentImpl implements CitiesSubComponent {
    private final DaggerAppComponent appComponent;

    private final CitiesSubComponentImpl citiesSubComponentImpl = this;

    private Provider<CitiesViewModelFactory> provideViewModelFactoryProvider;

    private CitiesSubComponentImpl(DaggerAppComponent appComponent,
        CitiesModule citiesModuleParam) {
      this.appComponent = appComponent;

      initialize(citiesModuleParam);
    }

    @SuppressWarnings("unchecked")
    private void initialize(final CitiesModule citiesModuleParam) {
      this.provideViewModelFactoryProvider = DoubleCheck.provider(CitiesModule_ProvideViewModelFactoryFactory.create(citiesModuleParam, appComponent.provideWeatherRepositoryProvider));
    }

    @Override
    public void inject(CitiesActivity citiesActivity) {
      injectCitiesActivity(citiesActivity);
    }

    private CitiesActivity injectCitiesActivity(CitiesActivity instance) {
      CitiesActivity_MembersInjector.injectCitiesViewModelFactory(instance, provideViewModelFactoryProvider.get());
      return instance;
    }
  }
}
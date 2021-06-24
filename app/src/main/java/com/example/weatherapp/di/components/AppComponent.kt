package com.example.weatherapp.di.components

import android.app.Application
import com.example.weatherapp.di.modules.*
import com.example.weatherapp.presentation.citiesactivity.di.CitiesSubComponent
import com.example.weatherapp.presentation.weatheractivity.di.WeatherSubComponent
import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(
    modules = [
        NetworkModule::class,
        MappersModule::class,
        RepositoryModule::class,
        DatabaseModule::class,
        InteractorModule::class
    ]
)
interface AppComponent {

    fun getActivitySubComponentBuilder(): WeatherSubComponent.Builder
    fun getCitiesSubComponentBuilder(): CitiesSubComponent.Builder

    @Component.Builder
    interface Builder {
        @BindsInstance
        fun withApplication(application: Application): Builder

        fun build(): AppComponent
    }
}
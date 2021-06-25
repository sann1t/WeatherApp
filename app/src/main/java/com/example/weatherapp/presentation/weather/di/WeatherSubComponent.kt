package com.example.weatherapp.presentation.weather.di

import com.example.weatherapp.di.scopes.ActivityScope
import com.example.weatherapp.presentation.weather.view.WeatherActivity
import dagger.Subcomponent

@ActivityScope
@Subcomponent(modules = [
    WeatherModule::class,
])
interface WeatherSubComponent {

    fun inject(weatherActivity: WeatherActivity)

    @Subcomponent.Builder
    interface Builder {

        fun build(): WeatherSubComponent
    }

}
package com.example.weatherapp.presentation.weatheractivity.di

import com.example.weatherapp.di.scopes.ActivityScope
import com.example.weatherapp.presentation.weatheractivity.view.WeatherActivity
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
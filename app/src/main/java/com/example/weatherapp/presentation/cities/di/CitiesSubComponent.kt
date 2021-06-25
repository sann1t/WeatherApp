package com.example.weatherapp.presentation.cities.di

import com.example.weatherapp.di.scopes.ActivityScope
import com.example.weatherapp.presentation.cities.view.CitiesActivity
import dagger.Subcomponent

@ActivityScope
@Subcomponent(modules = [CitiesModule::class])
interface CitiesSubComponent {

    fun inject(citiesActivity: CitiesActivity)

    @Subcomponent.Builder
    interface Builder {
        fun build(): CitiesSubComponent
    }
}
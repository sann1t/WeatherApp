package com.example.weatherapp.presentation.weather.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.weatherapp.components.DEFAULT_CITY
import com.example.weatherapp.domain.interactor.WeatherInteractor
import com.example.weatherapp.domain.models.WeatherInfo
import kotlinx.coroutines.*

class WeatherViewModel(private val weatherInteractor: WeatherInteractor): ViewModel() {

    private val weatherInfoLiveData = MutableLiveData<WeatherInfo>()
    private val loadingLiveData = MutableLiveData<Boolean>()
    private val toastLiveData = MutableLiveData<Boolean>()

    init {
        getCityName()
    }

    private fun getCityName() {
        getWeatherFromCityName(DEFAULT_CITY)
    }

    fun getWeatherFromCityName(cityName: String) {
        val cityName = parseCityName(cityName)
        viewModelScope.launch(Dispatchers.IO) {
            loadingLiveData.postValue(true)
            val weatherInfo = weatherInteractor.getWeatherByCityName(cityName)
            if(weatherInfo == null) {
                toastLiveData.postValue(true)
            } else {
                weatherInfoLiveData.postValue(weatherInfo)
                loadingLiveData.postValue(false)
            }
        }
    }

    fun getToastLiveData() = toastLiveData
    fun getLiveData() = weatherInfoLiveData
    fun getLoadingLiveData() = loadingLiveData

    private fun parseCityName(cityName: String): String = cityName.trim().capitalize()
}
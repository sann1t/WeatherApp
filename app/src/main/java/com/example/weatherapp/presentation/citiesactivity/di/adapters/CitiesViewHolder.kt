package com.example.weatherapp.presentation.citiesactivity.di.adapters

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.weatherapp.R
import com.example.weatherapp.domain.models.WeatherInfo
import com.example.weatherapp.presentation.weatheractivity.di.callbacks.OnCityClick

class CitiesViewHolder(itemView: View, private val onCityClick: OnCityClick): RecyclerView.ViewHolder(itemView) {

    private var cityNameItemTextView: TextView
    private lateinit var cityName: String
    private var temperatureItemTextView: TextView

    init {
        itemView.setOnClickListener {
            onCityClick.onCityClick(cityName)
        }
        cityNameItemTextView = itemView.findViewById(R.id.cityNameItemTextView)
        temperatureItemTextView = itemView.findViewById(R.id.temperatureItemTextView)
    }

    fun bind(weatherInfo: WeatherInfo) {
        cityName = weatherInfo.cityName!!
        cityNameItemTextView.text = weatherInfo.cityName
        temperatureItemTextView.text = weatherInfo.mainWeatherData!!.temperature.toString()
    }
}
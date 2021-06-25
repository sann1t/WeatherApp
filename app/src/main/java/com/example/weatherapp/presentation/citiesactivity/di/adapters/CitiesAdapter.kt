package com.example.weatherapp.presentation.citiesactivity.di.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.weatherapp.R
import com.example.weatherapp.domain.models.WeatherInfo
import com.example.weatherapp.presentation.weather.di.callbacks.OnCityClick

class CitiesAdapter(private val onCityClick: OnCityClick): RecyclerView.Adapter<CitiesViewHolder>() {

    private var citiesList: List<WeatherInfo> = listOf()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CitiesViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.cities_activity_item, parent, false)
        return CitiesViewHolder(view, onCityClick)
    }

    override fun onBindViewHolder(holder: CitiesViewHolder, position: Int) {
        holder.bind(citiesList[position])
    }

    override fun getItemCount(): Int = citiesList.size

    fun setCitiesList(list: List<WeatherInfo>) {
        citiesList = list
        notifyDataSetChanged()
    }
}
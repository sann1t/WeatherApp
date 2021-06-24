package com.example.weatherapp.presentation.weatheractivity.view

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.ProgressBar
import android.widget.TextView
import android.widget.Toast
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import com.example.weatherapp.App
import com.example.weatherapp.R
import com.example.weatherapp.presentation.citiesactivity.view.CitiesActivity
import com.example.weatherapp.presentation.weatheractivity.viewmodel.WeatherViewModel
import com.example.weatherapp.presentation.weatheractivity.di.factory.WeatherViewModelFactory
import javax.inject.Inject


class WeatherActivity: AppCompatActivity() {

    @Inject
    lateinit var  weatherViewModelFactory: WeatherViewModelFactory
    private val viewModel: WeatherViewModel by viewModels { weatherViewModelFactory }

    private lateinit var temperatureTextView: TextView
    private lateinit var maximumTemperatureTextView: TextView
    private lateinit var minimumTemperatureTextView: TextView
    private lateinit var windTextView: TextView
    private lateinit var cityTextView: TextView
    private lateinit var upArrowTextView: TextView
    private lateinit var downArrowTextView: TextView
    private lateinit var degreeTextView: TextView
    private lateinit var progressBar: ProgressBar


    override fun onCreate(savedInstanceState: Bundle?) {
        initDagger()
        super.onCreate(savedInstanceState)
        setContentView(R.layout.weather_activity)
        initViews()
        initLiveData()
    }

    private fun initDagger() {
        App.instance.getAppComponent()
            .getActivitySubComponentBuilder()
            .build()
            .inject(this)
    }
    private fun initViews() {
        temperatureTextView = findViewById(R.id.temperatureTextView)
        minimumTemperatureTextView = findViewById(R.id.minimumTemperatureTextView)
        maximumTemperatureTextView = findViewById(R.id.maximumTemperatureTextView)
        degreeTextView = findViewById(R.id.degreeTextView)
        upArrowTextView = findViewById(R.id.upArrowTextView)
        downArrowTextView = findViewById(R.id.downArrowTextView)
        windTextView = findViewById(R.id.windTextView)
        cityTextView = findViewById(R.id.cityTextView)
        progressBar = findViewById(R.id.weatherProgressBar)
        viewVisible(ProgressBar.INVISIBLE)
    }
    private fun viewVisible(visible: Int) {
        temperatureTextView.visibility = visible
        minimumTemperatureTextView.visibility = visible
        maximumTemperatureTextView.visibility = visible
        degreeTextView.visibility = visible
        upArrowTextView.visibility = visible
        downArrowTextView.visibility = visible
        windTextView.visibility = visible
        cityTextView.visibility = visible
    }

    private fun initLiveData() {
        viewModel.getLiveData().observe(this, Observer {
            temperatureTextView.text = it.mainWeatherData!!.temperature.toString()
            minimumTemperatureTextView.text = it.mainWeatherData!!.minimumTemperature.toString()
            maximumTemperatureTextView.text = it.mainWeatherData!!.maximumTemperature.toString()
            windTextView.text = it.wind!!.speed.toString() + " м/с"
            cityTextView.text = it.cityName
            progressBar.visibility = ProgressBar.INVISIBLE
            viewVisible(ProgressBar.VISIBLE)
        })
        viewModel.getLoadingLiveData().observe(this, Observer {
            val visibilityProgressBar = if(it) ProgressBar.VISIBLE else ProgressBar.GONE
            progressBar.visibility = visibilityProgressBar
        })
        viewModel.getToastLiveData().observe(this, Observer {
            Toast.makeText(this, "Нет соединения", Toast.LENGTH_LONG).show()
        })
    }
    fun onAddCityOnClick(view: View) {
        val intent = Intent(this, CitiesActivity::class.java)
        startActivityForResult(intent, 1)
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if(data == null) return
        val cityName = data?.getStringExtra("cityName")
        viewVisible(ProgressBar.INVISIBLE)
        viewModel.getWeatherFromCityName(cityName!!)
    }


}
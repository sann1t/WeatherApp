package com.example.weatherapp.presentation.cities.view

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.WindowManager
import android.widget.EditText
import androidx.activity.viewModels
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.weatherapp.App
import com.example.weatherapp.R
import com.example.weatherapp.presentation.cities.di.adapters.CitiesAdapter
import com.example.weatherapp.presentation.cities.di.factory.CitiesViewModelFactory
import com.example.weatherapp.presentation.cities.viewmodel.CitiesViewModel
import com.example.weatherapp.presentation.weather.di.callbacks.OnCityClick
import javax.inject.Inject

class CitiesActivity : AppCompatActivity(), OnCityClick {

    @Inject
    lateinit var citiesViewModelFactory: CitiesViewModelFactory

    private val viewModel: CitiesViewModel by viewModels { citiesViewModelFactory }

    private lateinit var recyclerView: RecyclerView
    private lateinit var cityNameEditText: EditText
    private lateinit var citiesAdapter: CitiesAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        initDagger()
        super.onCreate(savedInstanceState)
        setContentView(R.layout.cities_activity)
        window.setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_ADJUST_PAN);
        initRecyclerView()
        initEditText()
        initLiveData()
    }

    private fun initDagger() {
        App.instance.getAppComponent()
            .getCitiesSubComponentBuilder()
            .build()
            .inject(this)
    }

    fun onBackClick(view: View) {
        finish()
    }

    fun onFindClick(view: View) {
       onCityClick(cityNameEditText.text.toString())
    }

    private fun initEditText() {
        cityNameEditText = findViewById(R.id.cityNameEditText)
    }

    private fun initLiveData() {
        viewModel.getLiveData().observe(this, Observer {
            citiesAdapter.setCitiesList(it)
        })
    }
    private fun initRecyclerView() {
        recyclerView = findViewById(R.id.citiesRecyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)
        citiesAdapter = CitiesAdapter(this)
        recyclerView.adapter = citiesAdapter
    }

    override fun onCityClick(cityName: String) {
        val intent = Intent()
        intent.putExtra("cityName", cityName)
        setResult(RESULT_OK, intent)
        finish()
    }
}
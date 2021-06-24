package com.example.weatherapp.presentation.citiesactivity.view;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u0016\u001a\u00020\u0017H\u0002J\b\u0010\u0018\u001a\u00020\u0017H\u0002J\b\u0010\u0019\u001a\u00020\u0017H\u0002J\b\u0010\u001a\u001a\u00020\u0017H\u0002J\u000e\u0010\u001b\u001a\u00020\u00172\u0006\u0010\u001c\u001a\u00020\u001dJ\u0010\u0010\u001e\u001a\u00020\u00172\u0006\u0010\u001f\u001a\u00020 H\u0016J\u0012\u0010!\u001a\u00020\u00172\b\u0010\"\u001a\u0004\u0018\u00010#H\u0014J\u000e\u0010$\u001a\u00020\u00172\u0006\u0010\u001c\u001a\u00020\u001dR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0006\u001a\u00020\u00078\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u000e\u0010\f\u001a\u00020\rX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0010\u001a\u00020\u00118BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0013\u00a8\u0006%"}, d2 = {"Lcom/example/weatherapp/presentation/citiesactivity/view/CitiesActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Lcom/example/weatherapp/presentation/weatheractivity/di/callbacks/OnCityClick;", "()V", "citiesAdapter", "Lcom/example/weatherapp/presentation/citiesactivity/di/adapters/CitiesAdapter;", "citiesViewModelFactory", "Lcom/example/weatherapp/presentation/citiesactivity/di/factory/CitiesViewModelFactory;", "getCitiesViewModelFactory", "()Lcom/example/weatherapp/presentation/citiesactivity/di/factory/CitiesViewModelFactory;", "setCitiesViewModelFactory", "(Lcom/example/weatherapp/presentation/citiesactivity/di/factory/CitiesViewModelFactory;)V", "cityNameEditText", "Landroid/widget/EditText;", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "viewModel", "Lcom/example/weatherapp/presentation/citiesactivity/viewmodel/CitiesViewModel;", "getViewModel", "()Lcom/example/weatherapp/presentation/citiesactivity/viewmodel/CitiesViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "initDagger", "", "initEditText", "initLiveData", "initRecyclerView", "onBackClick", "view", "Landroid/view/View;", "onCityClick", "cityName", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onFindClick", "app_debug"})
public final class CitiesActivity extends androidx.appcompat.app.AppCompatActivity implements com.example.weatherapp.presentation.weatheractivity.di.callbacks.OnCityClick {
    @javax.inject.Inject()
    public com.example.weatherapp.presentation.citiesactivity.di.factory.CitiesViewModelFactory citiesViewModelFactory;
    private final kotlin.Lazy viewModel$delegate = null;
    private androidx.recyclerview.widget.RecyclerView recyclerView;
    private android.widget.EditText cityNameEditText;
    private com.example.weatherapp.presentation.citiesactivity.di.adapters.CitiesAdapter citiesAdapter;
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.weatherapp.presentation.citiesactivity.di.factory.CitiesViewModelFactory getCitiesViewModelFactory() {
        return null;
    }
    
    public final void setCitiesViewModelFactory(@org.jetbrains.annotations.NotNull()
    com.example.weatherapp.presentation.citiesactivity.di.factory.CitiesViewModelFactory p0) {
    }
    
    private final com.example.weatherapp.presentation.citiesactivity.viewmodel.CitiesViewModel getViewModel() {
        return null;
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void initDagger() {
    }
    
    public final void onBackClick(@org.jetbrains.annotations.NotNull()
    android.view.View view) {
    }
    
    public final void onFindClick(@org.jetbrains.annotations.NotNull()
    android.view.View view) {
    }
    
    private final void initEditText() {
    }
    
    private final void initLiveData() {
    }
    
    private final void initRecyclerView() {
    }
    
    @java.lang.Override()
    public void onCityClick(@org.jetbrains.annotations.NotNull()
    java.lang.String cityName) {
    }
    
    public CitiesActivity() {
        super();
    }
}
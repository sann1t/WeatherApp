package com.example.weatherapp;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u0000 \n2\u00020\u0001:\u0001\nB\u0005\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0005\u001a\u00020\u0004J\b\u0010\u0006\u001a\u00020\u0007H\u0002J\b\u0010\b\u001a\u00020\u0007H\u0002J\b\u0010\t\u001a\u00020\u0007H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/example/weatherapp/App;", "Landroid/app/Application;", "()V", "appComponent", "Lcom/example/weatherapp/di/components/AppComponent;", "getAppComponent", "initDagger", "", "initInstance", "onCreate", "Companion", "app_debug"})
public final class App extends android.app.Application {
    private com.example.weatherapp.di.components.AppComponent appComponent;
    private static com.example.weatherapp.App instance;
    @org.jetbrains.annotations.NotNull()
    public static final com.example.weatherapp.App.Companion Companion = null;
    
    @java.lang.Override()
    public void onCreate() {
    }
    
    private final void initDagger() {
    }
    
    private final void initInstance() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.weatherapp.di.components.AppComponent getAppComponent() {
        return null;
    }
    
    public App() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R$\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0004@BX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t\u00a8\u0006\n"}, d2 = {"Lcom/example/weatherapp/App$Companion;", "", "()V", "<set-?>", "Lcom/example/weatherapp/App;", "instance", "getInstance", "()Lcom/example/weatherapp/App;", "setInstance", "(Lcom/example/weatherapp/App;)V", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final com.example.weatherapp.App getInstance() {
            return null;
        }
        
        private final void setInstance(com.example.weatherapp.App p0) {
        }
        
        private Companion() {
            super();
        }
    }
}
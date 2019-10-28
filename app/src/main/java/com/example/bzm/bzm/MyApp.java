package com.example.bzm.bzm;

import android.app.Application;
import android.content.Context;
import android.support.v7.app.AppCompatActivity;

public class MyApp extends Application{
    private static Context sContext;
    @Override
    public void onCreate() {
        super.onCreate();
        sContext = getApplicationContext();
    }
    public static Context getsContext(){
        return  sContext;
    }
}

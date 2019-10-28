package com.example.bzm.bzm;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;

public class SpTools  {
    private final static String SPNAME="my_sp";
    public static void putString(String key,String value){
        SharedPreferences.Editor edit = getEdit();
        edit.putString(key, value);
        edit.apply();
    }
    public static String getString(String key,String defValue){

        SharedPreferences my_sp =getSharedPreferences();
        return  my_sp.getString(key,defValue);

    }
    public static void putLong(String key,long value) {
        SharedPreferences.Editor edit = getEdit();
        edit.putLong(key,value);
        edit.apply();
    }
    public static long gteLong(String key,long defValue) {
        SharedPreferences sharedPreferences = getSharedPreferences();
        return sharedPreferences.getLong(key,defValue);
    }
    public static SharedPreferences getSharedPreferences() {
        SharedPreferences my_sp = MyApp.getsContext().getSharedPreferences(SPNAME, Context.MODE_PRIVATE);
        return my_sp;

    }
    public static SharedPreferences .Editor getEdit() {
        SharedPreferences my_sp = getSharedPreferences();
        SharedPreferences.Editor editor = my_sp.edit();
        return editor;
    }

}


package com.example.speedyfernandes.tutorial1;

import android.app.Application;
import android.content.Context;

/**
 * Created by speedyfernandes on 11/04/16.
 */
public class MyApplication extends Application {

    private ApplicationComponent component;

    @Override
    public void onCreate() {
        super.onCreate();
        component = DaggerApplicationComponent.builder().build();
    }

    public static MyApplication get(Context context) {
        return (MyApplication) context.getApplicationContext();
    }

    public ApplicationComponent getComponent() {
        return component;
    }
}
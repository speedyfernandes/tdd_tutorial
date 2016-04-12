package com.example.speedyfernandes.tutorial1;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by speedyfernandes on 11/04/16.
 */
@Singleton
@Component(modules = ApplicationModule.class)
public interface ApplicationComponent {
    GeonetService getGeonetService();
}

package com.example.speedyfernandes.tutorial1;

import dagger.Component;

/**
 * Created by speedyfernandes on 11/04/16.
 */
@ViewScope
@Component(modules = MainModule.class, dependencies = ApplicationComponent.class)
public interface MainComponent {
    void inject(MainFragment fragment);
}

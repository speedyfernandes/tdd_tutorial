package com.example.speedyfernandes.tutorial1;

import dagger.Module;
import dagger.Provides;

/**
 * Created by speedyfernandes on 11/04/16.
 */
@Module
public class MainModule {

    private final MainView view;

    public MainModule(MainView view) {
        this.view = view;
    }

    @Provides
    public GetNewsInteractor provideInteractor(GeonetService service){
        return new GetNewsInteractor(service);
    }

    @Provides
    public MainPresenter providePresenter(GetNewsInteractor interactor) {
        return new MainPresenter(view, interactor);
    }
}

package com.example.speedyfernandes.tutorial1;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import dagger.Module;
import dagger.Provides;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by speedyfernandes on 11/04/16.
 */
@Module
public class ApplicationModule {

    @Provides
    public Gson provideGson(){
        return new GsonBuilder().setDateFormat("yyyy-MM-dd'T'HH:mm:ssz").create();
    }

    @Provides
    public RxJavaCallAdapterFactory providesAdapterFactory() {
        return RxJavaCallAdapterFactory.create();
    }

    @Provides
    public GsonConverterFactory providesConverterFactory(Gson gson) {
        return GsonConverterFactory.create(gson);
    }

    @Provides
    public Retrofit provideRetrofit(GsonConverterFactory converterFactory, RxJavaCallAdapterFactory adapterFactory){
        return new Retrofit.Builder()
                .baseUrl("http://api.geonet.org.nz/")
                .addCallAdapterFactory(adapterFactory)
                .addConverterFactory(converterFactory)
                .build();
    }

    @Provides
    public GeonetService provideGeonetService(Retrofit retrofit){
        return retrofit.create(GeonetService.class);
    }
}
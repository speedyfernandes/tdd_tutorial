package com.example.speedyfernandes.tutorial1;

import retrofit2.http.GET;
import rx.Observable;

/**
 * Created by speedyfernandes on 11/04/16.
 */
public interface GeonetService {
    @GET("news/geonet")
    Observable<NewsGeonetResponse> getNews();
}


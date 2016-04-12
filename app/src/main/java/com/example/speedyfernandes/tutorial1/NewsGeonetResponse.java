package com.example.speedyfernandes.tutorial1;

import com.google.gson.annotations.SerializedName;

/**
 * Created by speedyfernandes on 11/04/16.
 */
public class NewsGeonetResponse {
    @SerializedName("feed")
    private NewsStory[] newsStories;

    public NewsStory[] getNewsStories() {
        return newsStories;
    }
}

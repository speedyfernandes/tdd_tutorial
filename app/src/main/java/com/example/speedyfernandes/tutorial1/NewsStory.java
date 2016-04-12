package com.example.speedyfernandes.tutorial1;

import com.google.gson.annotations.SerializedName;

import java.util.Date;

/**
 * Created by speedyfernandes on 11/04/16.
 */
public class NewsStory {

    @SerializedName("title")
    private String title;

    @SerializedName("published")
    private Date published;

    @SerializedName("link")
    private String url;

    public Date getPublished() { return published; }

    public String getTitle() { return title; }

    public String getUrl() { return url; }

}


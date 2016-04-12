package com.example.speedyfernandes.tutorial1;

/**
 * Created by speedyfernandes on 11/04/16.
 */
public interface MainView {
    void hideLoading();

    void showError();

    void showLoading();

    void showNews(NewsStory[] newsStories);
}

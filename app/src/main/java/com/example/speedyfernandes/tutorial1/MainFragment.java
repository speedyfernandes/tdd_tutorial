package com.example.speedyfernandes.tutorial1;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;

import javax.inject.Inject;

/**
 * Created by speedyfernandes on 11/04/16.
 */
public class MainFragment extends Fragment implements MainView {

    @Inject
    MainPresenter presenter;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        DaggerMainComponent.builder().
                applicationComponent(MyApplication.get(getContext()).getComponent()).
                mainModule(new MainModule(this)).
                build().inject(this);
    }

    @Override
    public void hideLoading() {

    }

    @Override
    public void showError() {

    }

    @Override
    public void showLoading() {

    }

    @Override
    public void showNews(NewsStory[] newsStories) {

    }
}

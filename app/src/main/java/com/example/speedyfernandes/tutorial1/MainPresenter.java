package com.example.speedyfernandes.tutorial1;

import rx.Observer;

/**
 * Created by speedyfernandes on 11/04/16.
 */
public class MainPresenter implements Observer<NewsGeonetResponse> {

    private final MainView view;
    private final GetNewsInteractor interactor;

    public MainPresenter(MainView view, GetNewsInteractor interactor) {
        this.view = view;
        this.interactor = interactor;
    }


    @Override
    public void onCompleted() {
        view.hideLoading();
    }

    @Override
    public void onError(Throwable e) {
        view.showError();
    }

    @Override
    public void onNext(NewsGeonetResponse newsGeonetResponse) {
        view.showNews(newsGeonetResponse.getNewsStories());
    }

    public void onViewCreated() {
        view.showLoading();
        interactor.execute(this);
    }
}

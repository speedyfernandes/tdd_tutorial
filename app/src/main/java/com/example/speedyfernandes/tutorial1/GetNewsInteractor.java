package com.example.speedyfernandes.tutorial1;

import rx.Observer;
import rx.Subscription;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;
import rx.subscriptions.Subscriptions;

/**
 * Created by speedyfernandes on 11/04/16.
 */
public class GetNewsInteractor {
    private final GeonetService service;
    private Subscription subscription = Subscriptions.empty();

    public GetNewsInteractor(GeonetService service) {
        this.service = service;
    }

    public void execute(Observer<NewsGeonetResponse> observer) {
        subscription = service.getNews()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(observer);
    }

    public void cancel() {
        if (!subscription.isUnsubscribed()) {
            subscription.unsubscribe();
        }
    }
}

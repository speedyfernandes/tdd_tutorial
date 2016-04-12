package com.example.speedyfernandes.tutorial1;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

/**
 * Created by speedyfernandes on 12/04/16.
 */
@RunWith(MockitoJUnitRunner.class)
public class MainPresenterTest {

    private MainPresenter presenter;

    @Mock
    private MainView view;

    @Mock
    private GetNewsInteractor interactor;

    @Mock
    private NewsGeonetResponse response;

    @Mock
    private Throwable error;

    @Before
    public void setUp() throws Exception {
        presenter = new MainPresenter(view, interactor);
    }

    @Test
    public void shouldGetNews() {
        presenter.onViewCreated();
        verify(view).showLoading();
        verify(interactor).execute(presenter);
    }

    @Test
    public void shouldShowNews() {
        NewsStory[] newsStories = new NewsStory[]{};
        when(response.getNewsStories()).thenReturn(newsStories);
        presenter.onNext(response);
        verify(view).showNews(newsStories);
    }

    @Test
    public void shouldHideLoading() {
        presenter.onCompleted();
        verify(view).hideLoading();
    }

    @Test
    public void shouldShowError() {
        presenter.onError(error);
        verify(view).showError();
    }

    @Test
    public void shouldShowLoading() {
        presenter.onViewCreated();
        verify(view).showLoading();
    }
}
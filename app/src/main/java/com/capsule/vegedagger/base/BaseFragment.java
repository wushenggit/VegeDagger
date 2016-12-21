package com.capsule.vegedagger.base;

import android.support.v4.app.Fragment;

import com.capsule.vegedagger.App;
import com.capsule.vegedagger.di.component.DaggerFragmentComponent;

import javax.inject.Inject;

/**
 * Created by hhly-pc on 2016/12/14.
 */

public abstract class BaseFragment<T extends MvpPresenter> extends Fragment implements MvpView {

    @Inject
    protected T mPresenter;


    protected DaggerFragmentComponent.Builder getFragmentComponentBuilder() {
        return DaggerFragmentComponent
                .builder()
                .applicationComponent(App.getApplicationComponent());
    }

}

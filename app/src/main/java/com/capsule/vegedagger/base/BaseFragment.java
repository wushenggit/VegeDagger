package com.capsule.vegedagger.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.capsule.vegedagger.App;
import com.capsule.vegedagger.R;
import com.capsule.vegedagger.di.component.DaggerFragmentComponent;
import com.capsule.vegedagger.di.module.FragmentModule;

import javax.inject.Inject;

/**
 * Created by hhly-pc on 2016/12/14.
 */

public abstract class BaseFragment<T extends MvpPresenter> extends Fragment implements MvpView {

    protected Toolbar toolbar;
    @Inject
    protected T mPresenter;


    protected DaggerFragmentComponent.Builder getFragmentComponentBuilder() {
        return DaggerFragmentComponent
                .builder()
                .dataComponent(App.getDataComponent());

    }


    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        toolbar = (Toolbar) view.findViewById(R.id.toolbar);
        if (toolbar != null) {
            ((AppCompatActivity) getActivity()).setSupportActionBar(toolbar);
            toolbar.setNavigationOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    getActivity().onBackPressed();
                }
            });
        }


    }
}

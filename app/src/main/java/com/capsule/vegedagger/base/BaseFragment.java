package com.capsule.vegedagger.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;

import javax.inject.Inject;

/**
 * Created by hhly-pc on 2016/12/14.
 */

public abstract class BaseFragment<T extends MvpPresenter> extends Fragment implements MvpView {

    @Inject
    protected T mPresenter;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


    }


//    protected  ApplicationComponent getApplicationComponent(){
//        return  DaggerApplicationComponent
//                .builder()
//                .dataComponent(App.getDataComponent())
//                .applicationModule(new ApplicationModule(App.getInstance()))
//                .build();
//    }




//    private FragmentComponent getFragmentComponent(){
//        return  DaggerFragmentComponent
//                .builder()
//                .applicationComponent(App.get)
//
//    }

}

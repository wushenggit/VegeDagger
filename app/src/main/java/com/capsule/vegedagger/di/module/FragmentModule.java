package com.capsule.vegedagger.di.module;

import com.capsule.vegedagger.base.MvpView;
import com.capsule.vegedagger.di.FragmentScope;
import com.capsule.vegedagger.music.MusicContract;
import com.capsule.vegedagger.pic.PicContract;

import dagger.Module;
import dagger.Provides;

/**
 * Created by hhly-pc on 2016/12/21.
 */

@Module
public class FragmentModule {

    private MvpView mView;

    public FragmentModule(MvpView mView) {
        this.mView = mView;
    }

    @FragmentScope
    @Provides
    MusicContract.View provideMusicContractView() {
        return (MusicContract.View) mView;
    }


    @FragmentScope
    @Provides
    PicContract.View providePicContractView() {
        return (PicContract.View) mView;
    }
}

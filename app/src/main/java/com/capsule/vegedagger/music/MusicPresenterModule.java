package com.capsule.vegedagger.music;

import dagger.Module;
import dagger.Provides;

/**
 * Created by hhly-pc on 2016/12/14.
 */
@Module
public class MusicPresenterModule {

    private MusicContract.View mView;

    public MusicPresenterModule(MusicContract.View mView) {
        this.mView = mView;
    }

    @Provides
    MusicContract.View provideMusicContractView () {
        return mView;
    }
}

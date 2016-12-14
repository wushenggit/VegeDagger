package com.capsule.vegedagger.pic;

import dagger.Module;
import dagger.Provides;

/**
 * Created by hhly-pc on 2016/12/14.
 */
@Module
public class PicPresenterModule {

    private PicContract.View mView;

    public PicPresenterModule(PicContract.View mView) {
        this.mView = mView;
    }

    @Provides
    PicContract.View providePicContractView(){
        return mView;
    }
}

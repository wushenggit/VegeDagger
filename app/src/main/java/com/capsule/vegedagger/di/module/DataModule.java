package com.capsule.vegedagger.di.module;

import android.content.Context;

import com.capsule.vegedagger.date.Data;
import com.capsule.vegedagger.di.DataScope;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by hhly-pc on 2016/12/14.
 */
@Module
public class DataModule {

//    private Context mContext;
//
//    public DataModule(Context mContext) {
//        this.mContext = mContext;
//    }



    @Provides
    @DataScope
    Data provideData(Context mContext) {
        return new Data(mContext);
    }

}

package com.capsule.vegedagger;

import android.content.Context;

import dagger.Module;
import dagger.Provides;

/**
 * Created by hhly-pc on 2016/12/14.
 */

@Module
public class ApplicationModule {

    private final Context mContext;

    public ApplicationModule(Context mContext) {
        this.mContext = mContext;
    }

    @Provides
    Context provideContext() {
        return mContext;
    }
}

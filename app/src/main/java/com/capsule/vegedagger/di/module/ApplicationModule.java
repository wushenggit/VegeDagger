package com.capsule.vegedagger.di.module;

import android.content.Context;

import com.capsule.vegedagger.App;
import com.capsule.vegedagger.di.ContextScope;

import dagger.Module;
import dagger.Provides;

/**
 * Created by hhly-pc on 2016/12/14.
 */

@Module
public class ApplicationModule {

    private final App app;

    public ApplicationModule(App app) {
        this.app = app;
    }

    //    @Provides
    //    @ContextScope
    //    Context provideContext() {
    //        return app.getApplicationContext();
    //    }

    @Provides
    @ContextScope
    App provideApp() {
        return app;
    }

    @Provides
    @ContextScope
    Context provideContext() {
        return app.getApplicationContext();
    }


}

package com.capsule.vegedagger;

import android.app.Application;

import com.capsule.vegedagger.di.component.ApplicationComponent;
import com.capsule.vegedagger.di.component.DaggerApplicationComponent;
import com.capsule.vegedagger.di.component.DaggerDataComponent;
import com.capsule.vegedagger.di.component.DataComponent;
import com.capsule.vegedagger.di.module.ApplicationModule;
import com.capsule.vegedagger.di.module.DataModule;


/**
 * Created by hhly-pc on 2016/12/14.
 */

public class App extends Application {

    private static App instance;

    private static DataComponent dataComponent;

    public static App getInstance() {
        return instance;
    }


    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;
        dataComponent = DaggerDataComponent.builder()
                                           .applicationComponent(getApplicationComponent())
                                           .dataModule(new DataModule())
                                           .build();
    }


    public static DataComponent getDataComponent() {
        return dataComponent;
    }

    private ApplicationComponent getApplicationComponent() {
        return DaggerApplicationComponent.builder()
                                         .applicationModule(new ApplicationModule(instance))
                                         .build();
    }
}

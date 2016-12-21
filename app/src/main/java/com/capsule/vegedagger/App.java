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

    public static App getInstance() {
        return instance;
    }


    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;


    }


    public static DataComponent getDataComponent() {
        return DaggerDataComponent
                .builder()
                .dataModule(new DataModule(instance))
                .build();
    }

    public static ApplicationComponent getApplicationComponent(){
        return  DaggerApplicationComponent
                .builder()
                .dataComponent(App.getDataComponent())
                .applicationModule(new ApplicationModule(App.getInstance()))
                .build();
    }
}

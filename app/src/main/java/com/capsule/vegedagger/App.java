package com.capsule.vegedagger;

import android.app.Application;

import com.capsule.vegedagger.date.DaggerDataComponent;
import com.capsule.vegedagger.date.DataComponent;

/**
 * Created by hhly-pc on 2016/12/14.
 */

public class App extends Application {

    private DataComponent dataComponent;

    @Override
    public void onCreate() {
        super.onCreate();

        dataComponent = DaggerDataComponent
                .builder()
                .applicationModule(new ApplicationModule(getApplicationContext()))
//                .dataModule(new DataModule(getApplicationContext()))
                .build();

    }


    public DataComponent getDataComponent() {

        return dataComponent;
    }
}

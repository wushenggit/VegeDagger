package com.capsule.vegedagger.date;

import com.capsule.vegedagger.ApplicationModule;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by hhly-pc on 2016/12/14.
 */
@Singleton
@Component(modules = {DataModule.class, ApplicationModule.class})
public interface DataComponent {

    Data getData();

}

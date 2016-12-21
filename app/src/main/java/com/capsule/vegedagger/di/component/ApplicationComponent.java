package com.capsule.vegedagger.di.component;

import com.capsule.vegedagger.App;
import com.capsule.vegedagger.date.Data;
import com.capsule.vegedagger.di.ContextScope;
import com.capsule.vegedagger.di.module.ApplicationModule;

import dagger.Component;

/**
 * Created by hhly-pc on 2016/12/21.
 */
@ContextScope
@Component(dependencies = DataComponent.class , modules = ApplicationModule.class)
public interface ApplicationComponent {

    App getApp();

    Data getData();

}

package com.capsule.vegedagger.di.component;

import com.capsule.vegedagger.date.Data;
import com.capsule.vegedagger.di.module.DataModule;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by hhly-pc on 2016/12/14.
 */
@Singleton
@Component(modules = DataModule.class)
public interface DataComponent {

    Data getData();

}

package com.capsule.vegedagger.pic;

import com.capsule.vegedagger.FragmentScope;
import com.capsule.vegedagger.date.DataComponent;

import dagger.Component;

/**
 * Created by hhly-pc on 2016/12/14.
 */
@FragmentScope
@Component(modules = {PicPresenterModule.class},dependencies = {DataComponent.class})
public interface PicComponent {

    void inject(PicActivity picActivity);

}

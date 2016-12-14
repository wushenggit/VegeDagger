package com.capsule.vegedagger.music;

import com.capsule.vegedagger.FragmentScope;
import com.capsule.vegedagger.date.DataComponent;

import dagger.Component;

/**
 * Created by hhly-pc on 2016/12/14.
 */
@FragmentScope
@Component(dependencies = DataComponent.class, modules = MusicPresenterModule.class)
public interface MusicComponent {

    void inject(MusicActivity musicActivity);

}

package com.capsule.vegedagger.di.component;

import com.capsule.vegedagger.di.FragmentScope;
import com.capsule.vegedagger.di.module.FragmentModule;
import com.capsule.vegedagger.music.MusicFragment;
import com.capsule.vegedagger.pic.PicFragment;

import dagger.Component;

/**
 * Created by hhly-pc on 2016/12/21.
 */
@FragmentScope
@Component(dependencies = DataComponent.class ,modules = FragmentModule.class)
public interface FragmentComponent {

    void inject(MusicFragment musicFragment);

    void inject(PicFragment picFragment);

}

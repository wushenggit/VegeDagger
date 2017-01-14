package com.capsule.vegedagger.music;

import com.capsule.vegedagger.date.Data;

import javax.inject.Inject;

/**
 * Created by hhly-pc on 2016/12/14.
 */

public class MusicPresenter implements MusicContract.Presenter {

    private Data data;

    private MusicContract.View mView;


    @Inject
    public MusicPresenter(Data data, MusicContract.View mView) {
        this.mView = mView;
        this.data = data;
    }

    @Inject
    public void setupPresenter() {
        mView.setPresenter(this);
    }

    @Override
    public void getMusic() {
       String str = data.getMusic();
        mView.onGetMusicSuccess(str);
    }
}

package com.capsule.vegedagger.music;

import com.capsule.vegedagger.base.MvpPresenter;
import com.capsule.vegedagger.base.MvpView;

/**
 * Created by hhly-pc on 2016/12/14.
 */

public interface MusicContract {

    interface View extends MvpView {

        void onGetMusicSuccess(String str);

        void onGetMusicFailed();


    }


    interface Presenter extends MvpPresenter {

        void getMusic();
    }


}

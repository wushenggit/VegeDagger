package com.capsule.vegedagger.pic;

import com.capsule.vegedagger.base.MvpPresenter;
import com.capsule.vegedagger.base.MvpView;

/**
 * Created by hhly-pc on 2016/12/14.
 */

public interface PicContract {

    interface View extends MvpView{

        void onGetPictureSuccess(String string );

        void onGetPictureFailed();
    }

    interface Presenter extends MvpPresenter {

        void getPicture();
    }

}

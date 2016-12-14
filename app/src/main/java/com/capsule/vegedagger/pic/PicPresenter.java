package com.capsule.vegedagger.pic;

import com.capsule.vegedagger.date.Data;

import javax.inject.Inject;

/**
 * Created by hhly-pc on 2016/12/14.
 */

public class PicPresenter implements PicContract.Presenter {

    private final PicContract.View mView;

    private final Data mData;


    @Inject
    public PicPresenter(PicContract.View mView, Data mData) {
        this.mView = mView;
        this.mData = mData;
    }

    @Inject
    public void setupPresenter() {
        mView.setPresenter(this);
    }

    @Override
    public void getPicture() {
        if (true) {
            mView.onGetPictureSuccess(mData.getString());
        }
    }
}

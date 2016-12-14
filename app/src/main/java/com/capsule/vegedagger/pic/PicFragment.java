package com.capsule.vegedagger.pic;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.widget.Toast;

import com.capsule.vegedagger.base.MvpPresenter;

/**
 * Created by hhly-pc on 2016/12/14.
 */

public class PicFragment extends Fragment implements PicContract.View {

    private PicContract.Presenter mPresenter;


    @Override
    public void setPresenter(MvpPresenter presenter) {
        mPresenter = (PicContract.Presenter) presenter;
    }


    @Override
    public void onGetPictureSuccess(String string) {
        Toast.makeText(getContext(), string, Toast.LENGTH_LONG).show();
    }

    @Override
    public void onGetPictureFailed() {

    }


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }


    @Override
    public void onResume() {
        super.onResume();
        mPresenter.getPicture();
    }
}

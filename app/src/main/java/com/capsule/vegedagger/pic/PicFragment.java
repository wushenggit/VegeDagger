package com.capsule.vegedagger.pic;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.Toast;

import com.capsule.vegedagger.base.BaseFragment;
import com.capsule.vegedagger.base.MvpPresenter;
import com.capsule.vegedagger.di.module.FragmentModule;

/**
 * Created by hhly-pc on 2016/12/14.
 */

public class PicFragment extends BaseFragment<PicPresenter> implements PicContract.View {


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getFragmentComponentBuilder()
                .fragmentModule(new FragmentModule(this))
                .build()
                .inject(this);
    }

    @Override
    public void onResume() {
        super.onResume();
        mPresenter.getPicture();
    }

    @Override
    public void setPresenter(MvpPresenter presenter) {
        mPresenter = (PicPresenter) presenter;
    }


    @Override
    public void onGetPictureSuccess(String string) {
        Toast.makeText(getContext(), string, Toast.LENGTH_LONG).show();
    }

    @Override
    public void onGetPictureFailed() {

    }


}

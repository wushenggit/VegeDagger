package com.capsule.vegedagger.music;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Toast;

import com.capsule.vegedagger.base.BaseFragment;
import com.capsule.vegedagger.base.MvpPresenter;

import javax.inject.Inject;

/**
 * Created by hhly-pc on 2016/12/14.
 */

public class MusicFragment extends BaseFragment<MusicPresenter> implements MusicContract.View {

    @Inject
    MusicPresenter mPresenter;


    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
//        DaggerFragmentComponent
//                .builder()
//                .applicationComponent(getApplicationComponent())
//                .presenterModule(new PresenterModule(this))
//                .build()
//                .inject(this);
    }

    @Override
    public void onResume() {
        super.onResume();
        mPresenter.getMusic();

    }

    @Override
    public void setPresenter(MvpPresenter presenter) {
        mPresenter = (MusicPresenter) presenter;
    }

    @Override
    public void onGetMusicSuccess(String str) {
        Toast.makeText(getContext(), str, Toast.LENGTH_LONG).show();
    }

    @Override
    public void onGetMusicFailed() {

    }


}

package com.capsule.vegedagger.music;

import android.support.v4.app.Fragment;
import android.widget.Toast;

import com.capsule.vegedagger.base.MvpPresenter;

/**
 * Created by hhly-pc on 2016/12/14.
 */

public class MusicFragment extends Fragment implements  MusicContract.View {

    private MusicContract.Presenter mPresenter;

    @Override
    public void setPresenter(MvpPresenter presenter) {
        mPresenter = (MusicContract.Presenter) presenter;
    }

    @Override
    public void onGetMusicSuccess(String str) {
        Toast.makeText(getContext(), str, Toast.LENGTH_LONG).show();
    }

    @Override
    public void onGetMusicFailed() {

    }


    @Override
    public void onResume() {
        super.onResume();
        mPresenter.getMusic();

    }
}

package com.capsule.vegedagger.music;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.capsule.vegedagger.R;
import com.capsule.vegedagger.base.BaseFragment;
import com.capsule.vegedagger.base.MvpPresenter;
import com.capsule.vegedagger.di.module.FragmentModule;

/**
 * Created by hhly-pc on 2016/12/14.
 */

public class MusicFragment extends BaseFragment<MusicPresenter> implements MusicContract.View {

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getFragmentComponentBuilder()
                .fragmentModule(new FragmentModule(this))
                .build()
                .inject(this);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_music, null);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        toolbar.setTitle("标题是音乐");
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

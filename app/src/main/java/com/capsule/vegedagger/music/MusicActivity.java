package com.capsule.vegedagger.music;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.test.mock.MockApplication;

import com.capsule.vegedagger.App;
import com.capsule.vegedagger.R;

import javax.inject.Inject;

public class MusicActivity extends AppCompatActivity {

    @Inject
    MusicPresenter mPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music);
        MusicFragment fragment = new MusicFragment();

        DaggerMusicComponent
                .builder()
                .dataComponent(((App) getApplication()).getDataComponent())
                .musicPresenterModule(new MusicPresenterModule(fragment))
                .build()
                .inject(this);


        getSupportFragmentManager().beginTransaction().add(R.id.fragment_container, fragment).commit();

    }
}

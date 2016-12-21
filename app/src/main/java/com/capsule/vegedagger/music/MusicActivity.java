package com.capsule.vegedagger.music;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.capsule.vegedagger.R;

public class MusicActivity extends AppCompatActivity {

//    @Inject
//    MusicPresenter mPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music);
        MusicFragment fragment = new MusicFragment();




        getSupportFragmentManager().beginTransaction().add(R.id.fragment_container, fragment).commit();

    }
}

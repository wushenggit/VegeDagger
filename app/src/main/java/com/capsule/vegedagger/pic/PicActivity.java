package com.capsule.vegedagger.pic;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.capsule.vegedagger.App;
import com.capsule.vegedagger.R;

import javax.inject.Inject;

public class PicActivity extends AppCompatActivity {

    @Inject
    PicPresenter picPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pic);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        PicFragment picFragment = new PicFragment();

        DaggerPicComponent
                .builder()
                .dataComponent(((App) getApplication()).getDataComponent())
                .picPresenterModule(new PicPresenterModule(picFragment))
                .build()
                .inject(this);


        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });


        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.add(picFragment, "");
        transaction.commit();
    }

}

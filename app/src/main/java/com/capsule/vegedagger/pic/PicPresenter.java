package com.capsule.vegedagger.pic;

import android.util.Log;

import com.capsule.vegedagger.Logger;
import com.capsule.vegedagger.date.Data;

import javax.inject.Inject;

import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;

/**
 * Created by hhly-pc on 2016/12/14.
 */

public class PicPresenter implements PicContract.Presenter {

    private final PicContract.View mView;

    private final Data mData;


    @Inject
    PicPresenter(PicContract.View mView, Data mData) {
        this.mView = mView;
        this.mData = mData;
    }

    @Inject
    void setupPresenter() {
        mView.setPresenter(this);
    }

    @Override
    public void getPicture() {
        Observable.create(new ObservableOnSubscribe<Integer>() {
            @Override
            public void subscribe(ObservableEmitter<Integer> e) throws Exception {
                try {
                    for (int i = 0; i < 5; i++) {
                        e.onNext(i);
                    }
                    e.onComplete();
                } catch (Exception e1) {
                    e.onError(e1);
                }
            }
        }).subscribe(new Observer<Integer>() {
            @Override
            public void onSubscribe(Disposable d) {

            }

            @Override
            public void onNext(Integer integer) {
//                Logger.i(this, integer + "");
            }

            @Override
            public void onError(Throwable e) {

            }

            @Override
            public void onComplete() {
//                Logger.i( "就是这里！");
                mView.onGetPictureSuccess("哈哈哈哈");


            }
        });

    }
}

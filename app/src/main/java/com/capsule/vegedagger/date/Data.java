package com.capsule.vegedagger.date;

import android.content.Context;

/**
 * Created by hhly-pc on 2016/12/14.
 */

public class Data {

    private Context mContext;

    public Data(Context mContext) {
        this.mContext = mContext;
    }

    public String getString() {
        return "string";
    }

    public int getInt() {
        return 1;
    }

    public boolean getBoolean() {
        return true;
    }

    public String getMusic () {
        return "这是一首歌";
    }


}

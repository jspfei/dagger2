package com.jf.dagger2.model;

import javax.inject.Inject;

/**
 * Created by admin on 2017/5/9.
 */

public class Poetry {
    private String mPemo;

    @Inject
    public Poetry(){
        mPemo = "生活就想海洋";
    }

    public String getmPemo(){
        return mPemo;
    }
}

package com.jf.dagger2;

import android.app.Application;

import com.jf.dagger2.analytics.AnalyticsManager;

import javax.inject.Inject;

/**
 * Created by admin on 2017/5/8.
 */

public class MyApplication extends Application {

    @Inject
    AnalyticsManager analyticsManager;
    @Override
    public void onCreate(){
        super.onCreate();

    }

}

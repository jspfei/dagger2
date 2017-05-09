package com.jf.dagger2.module;

import android.app.Application;
import android.content.Context;

import com.jf.dagger2.MyApplication;

import javax.inject.Inject;
import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by admin on 2017/5/8.
 */

@Module
public class AppModule {

    private MyApplication myApplication ;

    @Inject
    public AppModule(MyApplication application){
        myApplication = application;
    }

    @Provides
    @Singleton
    Application providesApplication(){
        return myApplication;
    }

    @Provides
    @Singleton
    Context providesContext(){
        return myApplication;
    }
}

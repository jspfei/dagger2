package com.jf.dagger2.module;

import com.jf.dagger2.model.Poetry;

import dagger.Provides;

/**
 * Created by admin on 2017/5/9.
 */

public class PoetryModule {


    public Poetry providePoetry(){
        return new Poetry();
    }

    public String providePoems(){
        return "只有意志坚强的人，才能到达彼岸";
    }
}

package com.jf.dagger2.module;

import com.jf.dagger2.model.Flower;
import com.jf.dagger2.model.Lily;
import com.jf.dagger2.model.LilyFlower;
import com.jf.dagger2.model.Rose;
import com.jf.dagger2.model.RoseFlower;

import javax.inject.Named;

import dagger.Module;
import dagger.Provides;

/**
 * Created by admin on 2017/5/9.
 */

@Module
public class FlowerModule {
    @Provides
    @RoseFlower
    Flower provideRose() {
        return new Rose();
    }

    @Provides
    @LilyFlower
    Flower provideLily() {
        return new Lily();
    }
}

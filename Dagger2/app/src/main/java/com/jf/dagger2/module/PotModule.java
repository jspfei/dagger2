package com.jf.dagger2.module;

import com.jf.dagger2.model.Flower;
import com.jf.dagger2.model.Pot;
import com.jf.dagger2.model.RoseFlower;

import dagger.Module;
import dagger.Provides;

/**
 * Created by admin on 2017/5/9.
 */
@Module
public class PotModule {

    @Provides
    Pot providePot(@RoseFlower Flower flower){
        return new Pot(flower);
    }
}

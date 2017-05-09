package com.jf.dagger2.component;

import com.jf.dagger2.model.Flower;
import com.jf.dagger2.model.LilyFlower;
import com.jf.dagger2.model.RoseFlower;
import com.jf.dagger2.module.FlowerModule;

import dagger.Component;

/**
 * Created by admin on 2017/5/9.
 */
@Component(modules = FlowerModule.class)
public interface FlowerComponent {
    @RoseFlower
    Flower getRoseFlower();

    @LilyFlower
    Flower getLilyFlower();
}

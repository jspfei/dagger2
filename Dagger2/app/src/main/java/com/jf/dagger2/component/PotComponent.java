package com.jf.dagger2.component;

import com.jf.dagger2.model.Pot;
import com.jf.dagger2.module.PotModule;

import dagger.Component;

/**
 * Created by admin on 2017/5/9.
 */
@Component(modules = PotModule.class ,dependencies = FlowerComponent.class)
public interface PotComponent {
    Pot getPot();
}


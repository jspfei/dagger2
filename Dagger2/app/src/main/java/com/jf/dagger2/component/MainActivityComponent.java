package com.jf.dagger2.component;

import com.jf.dagger2.MainActivity;
import com.jf.dagger2.module.FlowerModule;
import com.jf.dagger2.module.PotModule;

import dagger.Component;

/**
 * Created by admin on 2017/5/8.
 */
@Component(dependencies = PotComponent.class)
public interface MainActivityComponent {
    void inject(MainActivity mainActivity);
}

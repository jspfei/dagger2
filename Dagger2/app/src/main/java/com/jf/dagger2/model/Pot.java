package com.jf.dagger2.model;

import javax.inject.Inject;
import javax.inject.Named;

/**
 * Created by admin on 2017/5/9.
 */

public class Pot {

    private Flower flower;
    @Inject
    public Pot( Flower flower){
        this.flower = flower;
    }
    public String show(){
        return flower.whisper();
    }
}

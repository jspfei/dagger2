package com.jf.dagger2.model;

import javax.inject.Inject;

/**
 * Created by admin on 2017/5/8.
 */

public class User {
    public String name;
    @Inject
    public User(){

    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
}

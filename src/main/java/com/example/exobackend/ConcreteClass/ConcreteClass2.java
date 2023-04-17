package com.example.exobackend.ConcreteClass;

import com.example.exobackend.AbstractClass.AbstractClass1;

public class ConcreteClass2 extends AbstractClass1 {
    @Override
    public void function() {

    }

    @Override
    public void function1() {

    }

    @Override
    public void function2(){
        getDependence2().operation2();
    }
}

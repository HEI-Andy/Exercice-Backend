package com.example.exobackend.ConcreteClass;

import com.example.exobackend.AbstractClass.AbstractClass1;
import org.springframework.stereotype.Component;

@Component
public class ConcreteClass1 extends AbstractClass1 {
    @Override
    public void function() {

    }

    @Override
    public void function1(){
        getDependence1().operation1();
    }

    @Override
    public void function2() {

    }
}

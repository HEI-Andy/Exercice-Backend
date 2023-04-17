package com.example.exobackend.AbstractClass;

import com.example.exobackend.ConcreteDependance.ConcreteDependance1;
import com.example.exobackend.ConcreteDependance.ConcreteDependance2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public abstract class AbstractClass1 {
    @Autowired
    protected ConcreteDependance1 concreteDependance1;

    @Autowired
    protected ConcreteDependance2 concreteDependance2;

    public ConcreteDependance1 getDependence1(){
        return concreteDependance1;
    }
    public ConcreteDependance2 getDependence2(){
        return concreteDependance2;
    }

    public abstract void function();

    public abstract void function1();

    public abstract void function2();
}

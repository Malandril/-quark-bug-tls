package com.test.scheduler;

import com.test.scheduler.configuration.F;
import com.test.scheduler.configuration.E;
import jakarta.inject.Singleton;

@Singleton
public class Intermediate {
    private final F f;

    public Intermediate(F f, E e) {
        super();
        this.f = f;
    }


    public int lol(){
        return f.maxFailures();
    }
}

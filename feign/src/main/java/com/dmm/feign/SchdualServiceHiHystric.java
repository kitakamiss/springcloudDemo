package com.dmm.feign;

import org.springframework.stereotype.Component;

@Component
public class SchdualServiceHiHystric implements SchedualServiceHi {

    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry "+name;
    }
}

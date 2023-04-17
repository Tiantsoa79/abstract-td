package com.mozart.td.classes;

import org.springframework.stereotype.Component;

@Component
public class ConcreteDependance1 {

    public void concreteDependance1Access() {
        System.out.println("Access for dependance 1 Granted");
    }

}

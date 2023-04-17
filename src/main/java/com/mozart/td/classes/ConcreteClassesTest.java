package com.mozart.td.classes;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@ComponentScan
@Component
public class ConcreteClassesTest {


    static ConcreteClass1 concreteClass1 = new ConcreteClass1();
    static ConcreteClass2 concreteClass2 = new ConcreteClass2();

    public static void main(String[] args){
        concreteClass1.getConcreteDependance1().concreteDependance1Access();
        concreteClass2.getConcreteDependance2().concreteDependance2Access();
    }
}

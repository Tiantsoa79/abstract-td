package com.mozart.td.classes;


import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Component
@Getter
@Setter
public abstract class AbstractClass1 {
    private ConcreteDependance1 concreteDependance1;
    private ConcreteDependance2 concreteDependance2;

    public AbstractClass1(ConcreteDependance1 concreteDependance1, ConcreteDependance2 concreteDependance2) {
        this.concreteDependance1 = concreteDependance1;
        this.concreteDependance2 = concreteDependance2;
    }

    public void abstractMethode() {
        concreteDependance1.concreteDependance1Access();
        concreteDependance2.concreteDependance2Access();
    }
}
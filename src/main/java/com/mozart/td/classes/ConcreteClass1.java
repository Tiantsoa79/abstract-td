package com.mozart.td.classes;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Component
@Getter
@Setter
public class ConcreteClass1  extends AbstractClass1 {
    public ConcreteClass1(ConcreteDependance1 concreteDependance1, ConcreteDependance2 concreteDependance2) {
        super(concreteDependance1, concreteDependance2);
    }
    public ConcreteClass1() {
        super(new ConcreteDependance1(), new ConcreteDependance2());
    }
}

package com.mozart.td.classes;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Component
@Getter
@Setter
public class ConcreteClass2 extends AbstractClass1 {
    public ConcreteClass2(ConcreteDependance1 concreteDependance1, ConcreteDependance2 concreteDependance2) {
        super(concreteDependance1, concreteDependance2);
    }
    public ConcreteClass2() {
        super(new ConcreteDependance1(), new ConcreteDependance2());
    }
}

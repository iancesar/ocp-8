package ocp.java_class_design.polimorfism.sub;

import ocp.java_class_design.polimorfism.SuperType;

public class AnotherSubType extends SuperType {

    @Override
    public void print() {
        System.out.println("Another subtype" + number);
    }
}

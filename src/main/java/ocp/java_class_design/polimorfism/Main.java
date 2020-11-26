package ocp.java_class_design.polimorfism;

import ocp.java_class_design.polimorfism.sub.AnotherSubType;

public class Main {

    public static void main(String[] args) {
        SuperType s1 = new SubType();
        SuperType s2 = new AnotherSubType();

        s1.print();
        s2.print();
    }


}

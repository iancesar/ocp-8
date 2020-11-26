package ocp.java_class_design.polimorfism;

public class SubType extends  SuperType {

    @Override
    public void print() {
        System.out.println("SubType " + number);
    }
}


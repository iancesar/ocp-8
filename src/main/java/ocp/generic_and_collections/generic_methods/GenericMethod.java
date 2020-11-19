package ocp.generic_and_collections.generic_methods;

import ocp.generic_and_collections.generic_class.Robot;
import ocp.generic_and_collections.generic_class.Shippable;
import ocp.generic_and_collections.generic_class.ShippableRobot;

import java.util.ArrayList;
import java.util.List;

public class GenericMethod {

    public <T> Shippable<T> info(Shippable<T> t) {
        System.out.println("Generic Method " + t.getClass().getSimpleName());
        return null;
    }

    public static void main(String[] args) {
        new GenericMethod().info(new ShippableRobot());
    }

    public static void addSound(List<?> list) {
//        list.add("quack");
    }
}

package ocp.generic_and_collections.generic_methods;

import java.util.ArrayList;
import java.util.List;

public class Upperbounds {

    public static void main(String[] args) {
        List<Double> list = new ArrayList<>();
        list.add(1D);
        list.add(2D);

        new Upperbounds().myFunction(list);
    }

    public void myFunction(List<? extends Number> list){
        list.forEach(System.out::println);
    }

}

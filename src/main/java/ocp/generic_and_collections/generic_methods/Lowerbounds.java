package ocp.generic_and_collections.generic_methods;

import java.util.ArrayList;
import java.util.List;

public class Lowerbounds {


    public static void main(String[] args) {
        List<Number> list = new ArrayList<>();
        list.add(1D);
        list.add(2D);

        new Lowerbounds().myFunction(list);
    }

    public void myFunction(List<? super Double> list){
        list.forEach(System.out::println);
    }

}

package ocp.generic_and_collections.collections_and_maps;

import java.util.ArrayDeque;
import java.util.Deque;

public class UsingArrayDeque {

    public static void main(String[] args) {
        Deque<String> array = new ArrayDeque<>();
        array.add("Jorge");
        array.push("Ian");
        array.addFirst("Pedro");
        array.addLast("Joao");
        array.addLast("Carlos");
        array.addLast("Silva");
        array.addLast("Andre");
        //[Pedro, Ian, Jorge, Joao, Carlos, Silva, Andre]

        System.out.println(array.pop());
    }

}

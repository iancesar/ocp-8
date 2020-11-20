package ocp.generic_and_collections.collections_and_maps;

import java.util.ArrayDeque;
import java.util.Queue;

public class UsingArrayQueue {

    public static void main(String[] args) {
        Queue<String> queue = new ArrayDeque<>();
        queue.add("Ian");
        queue.add("Pedro");

        System.out.println(queue);
    }

}

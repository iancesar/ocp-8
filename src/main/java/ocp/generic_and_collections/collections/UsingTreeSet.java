package ocp.generic_and_collections.collections;

import java.util.TreeSet;

public class UsingTreeSet {

    public static void main(String[] args) {
        TreeSet<Integer> set = new TreeSet<>();
        set.add(10);
        set.add(5);
        set.add(1);

        System.out.println(set);
    }

}

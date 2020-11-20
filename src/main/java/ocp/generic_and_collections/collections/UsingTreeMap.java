package ocp.generic_and_collections.collections;

import java.util.TreeMap;

public class UsingTreeMap {

    public static void main(String[] args) {
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(12, "Ian");
        treeMap.put(5, "Jorge");
        treeMap.put(7, "Pedro");

        System.out.println(treeMap);

    }
}


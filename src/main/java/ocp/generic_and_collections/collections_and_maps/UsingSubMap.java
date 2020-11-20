package ocp.generic_and_collections.collections_and_maps;

import java.util.HashMap;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class UsingSubMap {

    public static void main(String[] args) {
        TreeMap<Integer, String> map = new TreeMap<>();
        map.put(1, "ian");
        map.put(2, "marcelo");
        map.put(3, "jorge");

        System.out.println("Mapa -> " + map);

        SortedMap<Integer, String> subMap = map.subMap(1, 3);
        System.out.println("Sub Mapa -> " + subMap);
        subMap.put(3, "Felipe");
        System.out.println("Sub Mapa Editado-> " + subMap);
    }

}

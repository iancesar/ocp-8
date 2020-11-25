package ocp.generic_and_collections.collections_and_maps;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;

public class UsingMerge {

    public static void main(String[] args) {

        BiFunction<String, String, String> biFunction = (v1, v2) -> v1.length() > v2.length() ? v1 : v2;

        Map<String, String> map = new HashMap<>();
        map.put("ian", "Programador");
        map.merge("ian", null, biFunction);

        System.out.println(map);


    }

}

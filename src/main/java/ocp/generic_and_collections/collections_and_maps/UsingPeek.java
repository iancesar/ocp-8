package ocp.generic_and_collections.collections_and_maps;

import java.util.stream.Stream;

public class UsingPeek {

    public static void main(String[] args) {
        Stream<String> stream = Stream.of("A","B","C","D");
        System.out.println(stream.peek(System.out::println).findAny().orElse("NA")); //AA
        stream.peek(System.out::println).findAny().orElse("NA"); //A
    }

}

package ocp.generic_and_collections.collections_stream;

import ocp.generic_and_collections.comparator_and_comparable.Player;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class UsingPeek {

    public static void main(String[] args) {

        List<Player> players = Arrays.asList(//
                new Player("Ian", 28),
                new Player("Cesar", 20),
                new Player("Vidinha", 32),
                new Player("Rego", 25));

        Consumer<Player> nameLog = (p) -> System.out.println(p.getName());

        players.stream().peek(c -> c.getName().toLowerCase());
//        players.stream().peek(nameLog).filter(c -> c.getAge() > 26).count();
        //System.out.println(c);


    }

}

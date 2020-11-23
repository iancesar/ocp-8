package ocp.generic_and_collections.collections_stream;

import ocp.generic_and_collections.comparator_and_comparable.Player;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class UsingCollectionAndStream {

    public static void main(String[] args) {
        //Consumer
        Consumer<List<Integer>> methodRef1 = Collections::sort;

        //Predicate
        String str = "abc";
        Predicate<String> methodRef2 = str::startsWith;
        Arrays.asList("ian","joao","iago").stream().filter(methodRef2); //Aqui usaremos o predicate criado;
        Predicate<String> pIsEmpty = String::isEmpty; //Predicate usando class reference


        //Supplier
        Supplier<Player> sp1 = Player::new; //Pedemos instanciar via contructor reference
        


    }

}

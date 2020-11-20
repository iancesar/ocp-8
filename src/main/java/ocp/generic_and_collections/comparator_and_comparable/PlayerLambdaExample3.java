package ocp.generic_and_collections.comparator_and_comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class PlayerLambdaExample3 {

    public static void main(String[] args) {
        List<Player> footballTeam = new ArrayList<>();
        Player player1 = new Player(59, "John", 20);
        Player player2 = new Player(67, "Roger", 22);
        Player player3 = new Player(45, "Steven", 24);
        footballTeam.add(player2);
        footballTeam.add(player3);
        footballTeam.add(player1);

        System.out.println("Before Sorting : " + footballTeam);
        //Collections.sort(footballTeam, (Player p1, Player p2) -> Integer.compare(p1.getAge(), p2.getAge()));
        Collections.sort(footballTeam, Comparator.comparing(Player::getAge));
        System.out.println("After Sorting : " + footballTeam);
    }

}

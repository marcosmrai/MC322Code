package Aula4Main;

import java.util.ArrayList;
import Aula4.Player;
import Aula4.Item;

public class MainPlayer {
    public static void main(String[] args) {
        Item item1 = new Item("Sword", 10);
        Item item2 = new Item("Shield", 5);
        Item item3 = new Item("Bow", 7);

        Player player1 = new Player(1, "Andre", 20, item1);
        Player player2 = new Player(1, "Joao", 23, item2);
        Player player3 = new Player(2, "Marcelo", 21, item3);
        Player player4 = (Player)player1.clone();
        Player player5 = player1;
    
        // Compare the players
        if (player1.equals(player2)) {
            System.out.println("Player 1 and Player 2 are the same.");
        } else {
            System.out.println("Player 1 and Player 2 are different.");
        }

        // Compare the players
        if (player1.equals(player5)) {
            System.out.println("Player 1 and Player 2 are the same.");
        } else {
            System.out.println("Player 1 and Player 2 are different.");
        }

        if (player1.equals(player4)) {
            System.out.println("Player 1 and Player 4 are the same.");
        } else {
            System.out.println("Player 1 and Player 4 are different.");
        }

        if (player1.compareTo(player4) == 0) {
            System.out.println("Player 1 and Player 4 are the same.");
        } else {
            System.out.println("Player 1 and Player 4 are different.");
        }

        ArrayList<Player> players = new ArrayList<Player>();
        players.add(player1);
        players.add(player2);
        players.add(player3);
        players.add(player4);

        players.sort(null);

        for (Player player : players) {
            System.out.println(player);
        }
    }
}

package Aula4Main;

import java.util.ArrayList;
import Aula4.Player;

public class MainPlayer {
    public static void main(String[] args) {
        Player player1 = new Player(1, "Andre", 20);
        Player player2 = new Player(1, "Joao", 23);
        Player player3 = new Player(2, "Marcelo", 21);
    
        // Compare the players
        if (player1.equals(player2)) {
            System.out.println("Player 1 and Player 2 are the same.");
        } else {
            System.out.println("Player 1 and Player 2 are different.");
        }

        ArrayList<Player> players = new ArrayList<Player>();
        players.add(player1);
        players.add(player2);
        players.add(player3);

        players.sort(null);

        for (Player player : players) {
            System.out.println(player);
        }
    }
}

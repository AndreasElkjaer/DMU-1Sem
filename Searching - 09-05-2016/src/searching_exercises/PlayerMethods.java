package searching_exercises;

import java.util.ArrayList;

public class PlayerMethods {
	public Player findScoreLinear(ArrayList<Player> players, int score) {
		// TODO: exercise 4.1
		return null;
	}

	// TODO: add methods for exercise 4.2 and 4.3

	
	public static void main(String[] args) {
		PlayerMethods metoder = new PlayerMethods();
		
		// Test of exercise 4.1
		ArrayList<Player> playerList = new ArrayList<Player>();
		playerList.add(new Player("Hans", 196, 99, 45));
		playerList.add(new Player("Bo", 203, 89, 60));
		playerList.add(new Player("Jens", 188, 109, 32));
		playerList.add(new Player("Finn", 194, 102, 12));
		playerList.add(new Player("Lars", 192, 86, 35));
		playerList.add(new Player("Mads", 200, 103, 37));
		
		System.out.println("Player who has 35 goals: " + metoder.findScoreLinear(playerList, 35));
		System.out.println("Player who has 30 goals: " + metoder.findScoreLinear(playerList, 32));

		// TODO: test exercise 4.2 og 4.3
		
	}

}

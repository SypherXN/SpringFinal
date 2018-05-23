package Main;

import GameInfo.Information;
import GameInfo.Menu;
import Map.Location;
import Map.Map;
import Map.TestLocation;
import Player.PlayerInfo;
import java.util.*;

public class MainGame {

	public static void main(String [] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Would you like to try to win the game now?");	
		String response = input.nextLine();
		
		if (response.toLowerCase().equals("yes")) {
			
			int win = (int)(Math.random() * 100);
			
			if (win == 0) {
				
				System.out.println("You won the game. It must have been easy.");
				System.exit(0);
				
			}
			
		}
			
		System.out.println("Too bad. You could have won!");
		
		PlayerInfo.initPlayer();
		Location[] arr = {new TestLocation(), new TestLocation(), new TestLocation(), new TestLocation(), new TestLocation(), new TestLocation(), new TestLocation(), new TestLocation(), new TestLocation(), new TestLocation(), new TestLocation(), new TestLocation(), new TestLocation(), new TestLocation(), new TestLocation(), new TestLocation(), new TestLocation(), new TestLocation(), new TestLocation(), new TestLocation(), new TestLocation(), new TestLocation(), new TestLocation(), new TestLocation(), new TestLocation()};
		Map.initMap(arr);
		
		Information.initResistances();
		Information.initWeaknesses();
		Information.initEnemiesLocation(arr);
		
		while(PlayerInfo.getHP() > 0) {
			
			Menu.mainMenu();
			
		}
		
	}
	
}

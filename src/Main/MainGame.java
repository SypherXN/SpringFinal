package Main;

import java.util.Scanner;

import GameInfo.Information;
import GameInfo.Menu;
import Items.Sword;
import Items.Weapon;
import Map.Cave;
import Map.Lake;
import Map.Location;
import Map.Map;
import Map.School;
import Map.TestLocation;
import Player.PlayerInfo;

public class MainGame {

	public static void main(String [] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("DISCLAIMER: This game is in development and may be in development forever. There is a high chance this will not run as intended.");
		System.out.println("Would you like to try to win the game now?");	
		String response = input.nextLine();
		
		if (response.toLowerCase().equals("yes")) {
			
			int win = (int)(Math.random() * 100);
			
			if (win == 0) {
				
				System.out.println("You won the game. It must have been easy.");
				System.exit(0);
				
			}else {
				System.out.println("Too bad. Better luck next time.");
			}
			
		}else {
			
		System.out.println("Too bad. You could have won!");
		
		}
		
		PlayerInfo.initPlayer();
		Weapon base = new Sword();
		PlayerInfo.setWeapon(base);
		Location[] arr = new Location[25];
		
		for (int i = 0; i < arr.length; i++) {
			
			int thing = (int)(Math.random() * 4);
			switch(thing) {
			
				case 0:
					arr[i] = new Cave();
					break;
				case 1:
					arr[i] = new Lake();
					break;
				case 2:
					arr[i] = new School();
					break;
				case 3:
					arr[i] = new TestLocation();
					break;
			
			}
			
		}
		
		Map.initMap(arr);
		
		Information.initResistances();
		Information.initWeaknesses();
		Information.initEnemiesLocation(arr);
		
		while(PlayerInfo.getHP() > 0) {
			
			Menu.mainMenu();
			
		}
		
	}
	
}

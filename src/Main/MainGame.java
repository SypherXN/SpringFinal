package Main;

import Combat.Battle;
import Items.Bidoof;
import Items.Sword;
import Items.TestPotion;
import Items.TestWeapon;
import Player.PlayerInfo;

public class MainGame {

	public static void main(String [] args) {
		
		/*
		Scanner input = new Scanner(System.in);
		
		Information.initResistances();
		Information.initWeaknesses();
		
		//PlayerInfo.initPlayer();
		
		//System.out.println("Welcome " + PlayerInfo.getName() + " to Name of Game");
		
		//TestEnemy enemy = new TestEnemy();
		
		//System.out.println(enemy.getDesc());
		
		
		Location test = new TestLocation();
		
		Location[] arr = {test, test, test, test, test, test, test, test, test, test, test, test, test, test, test, test, test, test, test, test, test, test, test, test, test};
		
		Map.initMap(arr);
		
		System.out.println(Map.printKnownMap());
		
		System.out.print("Enter your desired direction: ");
		String direction = input.nextLine();
		
		String direction = "";
		
		do {
			
			System.out.print("Enter your desired direction: ");
			direction = input.nextLine();
			
		} while(!Map.moveAdjacent(direction));
		
		System.out.println();
		System.out.println(Map.printKnownMap());
		*/
		
		PlayerInfo.addItem(new TestPotion("Test Potion", "This is a test"));
		PlayerInfo.addItem(new Sword("Sword", "Another test"));
		PlayerInfo.addItem(new TestWeapon("Test Weapon", "This is a test"));
		PlayerInfo.addItem(new Bidoof("Bidoof", "Pokemon"));
		
		Battle.itemMenu();
		
	}
	
}

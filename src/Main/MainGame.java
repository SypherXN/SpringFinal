package Main;

import Enemy.Dargon;
import Enemy.Enemy;
import GameInfo.Menu;
import Items.Bidoof;
import Items.Sword;
import Items.TestPotion;
import Items.TestWeapon;
import Items.Weapon;
import Map.Location;
import Map.Map;
import Map.TestLocation;
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
		
		PlayerInfo.initPlayer();
		
		System.out.println(PlayerInfo.getATT());
		
		PlayerInfo.addItem(new TestPotion());
		PlayerInfo.addItem(new Sword());
		PlayerInfo.addItem(new TestWeapon());
		PlayerInfo.addItem(new Bidoof());
		
		Enemy enemy = new Dargon();
		
		Weapon weapon = new Sword();
		PlayerInfo.setWeapon(weapon);
		
		//Battle.Battle(enemy);
		
		Location[] arr = {new TestLocation(), new TestLocation(), new TestLocation(), new TestLocation(), new TestLocation(), new TestLocation(), new TestLocation(), new TestLocation(), new TestLocation(), new TestLocation(), new TestLocation(), new TestLocation(), new TestLocation(), new TestLocation(), new TestLocation(), new TestLocation(), new TestLocation(), new TestLocation(), new TestLocation(), new TestLocation(), new TestLocation(), new TestLocation(), new TestLocation(), new TestLocation(), new TestLocation()};
		
		Map.initMap(arr);
		
		
		for (int i = 0; i < 15; i++) Menu.mainMenu();
		
	}
	
}

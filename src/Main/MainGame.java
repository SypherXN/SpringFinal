package Main;

import Combat.Battle;
import Enemy.D;
import Enemy.Dargon;
import Enemy.Enemy;
import Items.Bidoof;
import Items.Sword;
import Items.TestPotion;
import Items.TestWeapon;
import Items.Weapon;
import Player.PlayerInfo;
import GameInfo.*;

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
		
		Menu.backpackMenu();
		
		Enemy enemy = new D();
		
		Weapon weapon = new Sword();
		PlayerInfo.setWeapon(weapon);
		
		Battle.Battle(enemy);
		
	}
	
}

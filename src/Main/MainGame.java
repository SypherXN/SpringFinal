package Main;

import GameInfo.*;
import Player.*;
import Enemy.*;
import Map.*;
import java.util.Scanner;

public class MainGame {

	public static void main(String [] args) {
		
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
		
		/*
		System.out.print("Enter your desired direction: ");
		String direction = input.nextLine();
		*/
		
		String direction = "";
		
		do {
			
			System.out.print("Enter your desired direction: ");
			direction = input.nextLine();
			
		} while(!Map.moveAdjacent(direction));
		
		System.out.println();
		System.out.println(Map.printKnownMap());
		
	}
	
}

package Main;

import GameInfo.*;
import Player.*;
import Enemy.*;
import Map.*;

import java.util.ArrayList;
import java.util.Scanner;

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
		
		ArrayList<Integer> enemies = new ArrayList<Integer> ();
		
		for(int i = 0; i < 25; i++) {
			
			enemies.add((int)(Math.random() * 100));
			
		}
		
		for(int element : enemies) {
			
			System.out.print(element + " ");
			
		}
		
		System.out.println();
		
		for(int i = 0; i < enemies.size(); i++) {
			
			for(int x = i - 1; x > 0; x--) {
				
				if (enemies.get(x) > enemies.get(i) && enemies.get(x - 1) < enemies.get(i)) {
					
					enemies.add(x, enemies.remove(i));
					break;
					
				}
				
			}
			
		}
		
		for(int element : enemies) {
			
			System.out.print(element + " ");
			
		}
		
	}
	
}

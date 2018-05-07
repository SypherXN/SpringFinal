package Main;

import GameInfo.*;
import Player.*;
import Enemy.*;
import Map.*;

public class MainGame {

	public static void main(String [] args) {
		
		Information.initResistances();
		Information.initWeaknesses();
		
		//PlayerInfo.initPlayer();
		
		//System.out.println("Welcome " + PlayerInfo.getName() + " to Name of Game");
		
		//TestEnemy enemy = new TestEnemy();
		
		//System.out.println(enemy.getDesc());
		
		/*
		Location test = new TestLocation();
		
		Location[] arr = {test, test, test, test, test, test, test, test, test, test, test, test, test, test, test, test, test, test, test, test, test, test, test, test, test};
		
		Map.initMap(arr);
		
		System.out.println(Map.printKnownMap());
		
		Map.getLocationInfo(0, 0);
		
		Map.discoverLocation(0, 0);
		
		Map.getLocationInfo(0, 0);
		
		Map.getLocationInfo(3, 3);
		*/
		
	}
	
}

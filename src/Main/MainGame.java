package Main;

import GameInfo.Information;
import GameInfo.Menu;
import Map.Location;
import Map.Map;
import Map.TestLocation;
import Player.PlayerInfo;

public class MainGame {

	public static void main(String [] args) {
			
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

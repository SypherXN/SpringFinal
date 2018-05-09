package Combat;

import Enemy.Enemy;
import Player.PlayerInfo;

public class Battle {

	public static void Battle(Enemy enemy) {
		
		Combat.setEnemy(enemy);
		System.out.println("You encounter a " + enemy);
		
		while(enemy.getHP() > 0 && PlayerInfo.getHP() > 0) {
			
			
			
		}
		
	}
	
	public static void itemMenu() {
		
		
		
	}
	
}

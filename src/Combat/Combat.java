package Combat;

import Enemy.*;
import Items.*;
import Player.*;

public class Combat {

	private static Enemy enemy;
	
	/**
	 * 
	 * @param def - defense of the enemy
	 * @param weapon - 
	 */
	public static void dealDamage(int def, Weapon weapon) { enemy.modHP((-(def) * (100 / (100 + PlayerInfo.getDEF())))); }
	
	/**
	 * 
	 * @param att - attack of the enemy
	 * @param def - defense of the player
	 */
	public static void takeDamage(int att) { PlayerInfo.modHP((-(att) * (100 / (100 + PlayerInfo.getDEF())))); }
	
	//Modifier Methods
	public static void setEnemy(Enemy thing) { enemy = thing; }
	
}

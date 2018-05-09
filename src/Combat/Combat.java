package Combat;

import Enemy.*;
import Items.*;
import Player.*;

public class Combat {

	private static Enemy enemy;
	
	/*Calculates damage dealt based on attack, defense, and weapon modifiers
	 * 
	 */
	public static void dealDamage(int att, int def, Weapon weapon) {
		
		if(def < att) {
			enemy.setHP(enemy.getHP() - (att + weapon.getDamage() - def));
		}
		else {
			enemy.setHP((enemy.getHP() - (def - att + weapon.getDamage()))/10);
		}
		
	}
	
	/*Calculates damage taken based on enemy's attack defense, and weapon modifiers
	 * 
	 */
	public static void takeDamage(int att, int def) {
		
		if(def < att) {
			PlayerInfo.modHP(att - def);
		}
		else {
			PlayerInfo.modHP(def - att);
		}
		
	}
	
}

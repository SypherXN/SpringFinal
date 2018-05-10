package Combat;

import Enemy.*;
import Items.*;
import Player.*;

public class Combat {

	private static Enemy enemy;
	private static Effect other, self;
	
	/** Calculates damage dealt to the enemy and inflicts the damage
	 * 
	 */
	public static void dealDamage() {
		
		double dmg = (((double)PlayerInfo.getATT() + (double)PlayerInfo.getWeapon().getDamage()) * (100.0 / (100.0 + (double)enemy.getDEF())));
		int critChance = (int)(Math.random() * (100 - PlayerInfo.getSP()));
		
		if (critChance == 0) dmg *= 2;
		
		enemy.modHP(-(int)(dmg));
		System.out.println("You deal " + (int)dmg + " damage to " + enemy);
		
	}
	
	/** Calculates damage taken and inflicts the damage to the player
	 * 
	 */
	public static void takeDamage() { 
		
		double dmg = ((double)enemy.getATT()) * (100.0 / (100.0 + (double)PlayerInfo.getDEF()));
		int critChance = (int)(Math.random() * (100 - enemy.getSP()));
		
		if (critChance == 0) dmg *= 2;
		
		PlayerInfo.modHP(-(int)dmg);
		System.out.println(enemy + " deals " + (int)dmg + " damage to you");
		
	}
	
	/** Applies the effect to the target
	 * 
	 * @param effect - effect to be applied to a person
	 * @param target - target for the effect (0 = self, 1 = other)
	 */
	public static void applyEffect(Effect effect, int target) {
		
		if (target == 1) { 
			
			other = effect;
			
		} else {
			
			self = effect;
			
		}
		
	}
	
	//Modifier Methods
	public static void setEnemy(Enemy thing) { enemy = thing; }
	
	//Accessor Methods
	public static Enemy getEnemy() { return enemy; }
	
}

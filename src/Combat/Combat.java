package Combat;

import Enemy.*;
import Items.*;
import Player.*;

public class Combat {

	private static Enemy enemy;
	private static Effect other, self;
	
	/** Calculates damage dealt to the enemy and inflicts the damage
	 * 
	 * @param def - defense of the enemy
	 * @param weapon - weapon of the player
	 */
	public static void dealDamage(int def, Weapon weapon) { enemy.modHP((-(PlayerInfo.getATT() + weapon.getDamage()) * (100 / (100 + PlayerInfo.getDEF())))); }
	
	/** Calculates damage taken and inflicts the damage to the player
	 * 
	 * @param att - attack of the enemy
	 * @param def - defense of the player
	 */
	public static void takeDamage(int att) { PlayerInfo.modHP((-(att) * (100 / (100 + PlayerInfo.getDEF())))); }
	
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

package Items;

import Combat.Effect;

public interface Weapon{
	
	/** Sets the target for the weapon's effect
	 * 
	 * @param target - The target of the weapon's effect (0 = self, 1 = enemy)
	 */
	void setTargetEffect(int target);
	
	/** Returns the damage of the weapon
	 * 
	 * @return - The damage of the weapon
	 */
	int getDamage();
	
	/** Returns the effect of the weapon
	 * 
	 * @return - The effect the weapon applies
	 */
	Effect getEffect();
	
	/** Returns the target for the weapon's effect
	 * 
	 * @return - The target of the weapon's effect (0 = self, 1 = enemy)
	 */
	int getTargetEffect();
	
}

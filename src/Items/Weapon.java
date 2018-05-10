package Items;

import Combat.*;

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
	
	/** Sets the durability of the weapon
	 * 
	 * @param durability - The durability of the weapon
	 */
	void setDurability(int durability);
	
	/**Return the durability of the weapon
	 * 
	 * @return - The durability of the weapon
	 */
	int getDurability();
	
	
}

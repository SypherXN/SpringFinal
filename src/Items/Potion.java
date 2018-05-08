package Items;

import Combat.*;

public interface Potion {

	/** Sets the amount that the Potion heals
	 * 
	 * @param heal - The amount the potion would heal
	 */
	void setHeal(int heal);
	
	/** Sets the effect of the potion
	 * 
	 * @param effect - The effect that the potion would apply
	 */
	void setEffect(Effect effect);
	
	/** Returns the amount the potion would heal
	 * 
	 * @return - The amount the potion would heal
	 */
	int getHeal();
	
	/** Returns the effect of the potion
	 * 
	 * @return - The effect that the potion would apply
	 */
	Effect getEffect();
	
}

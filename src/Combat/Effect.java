package Combat;

import GameInfo.Description;

public abstract class Effect implements Description {

	private String name;
	private String desc;
	private int turnCounter;
	
	/** Constructor for effect
	 * 
	 * @param name - name of the effect
	 * @param desc - description of the effect
	 * @param turnCounter - turns left of the effect
	 */
	public Effect(String name, String desc, int turnCounter) {
		
		this.name = name;
		this.desc = desc;
		this.turnCounter = turnCounter;
		
	}
	
	/** Applies effect to the target
	 * 
	 * @param target - target for the effect (1 = enemy, 0 = self)
	 */
	public abstract void effect(int target);
	
	//Modifier Methods
	public void setName(String name) { this.name = name; }
	public void setDesc(String desc) { this.desc = desc; }
	public void setTurnCounter(int counter) { this.turnCounter = counter; }
	
	//Accessor Methods
	public String getName() { return name; }
	public String getDesc() { return desc; }
	public int getTurnCounter() { return turnCounter; }
	
}

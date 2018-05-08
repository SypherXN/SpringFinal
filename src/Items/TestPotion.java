package Items;

import Combat.Effect;

public class TestPotion extends Item implements Potion {

	private int heal;
	private Effect effect;
	
	public TestPotion(String name, String desc) {
		
		super(name, desc);
		
	}

	//Modifier Methods
	public void setHeal(int heal) { this.heal = heal; }
	public void setEffect(Effect effect) { this.effect = effect; }
	
	//Accessor Methods
	public int getHeal() { return heal; }
	public Effect getEffect() { return effect; }

}

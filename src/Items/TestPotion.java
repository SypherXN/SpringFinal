package Items;

import Combat.Effect;

public class TestPotion extends Item implements Potion {

	private int heal;
	private Effect effect;
	
	public TestPotion() {
		
		super("Test Potion", "This is a test");
		
	}

	//Modifier Methods
	public void setHeal(int heal) { this.heal = heal; }
	public void setEffect(Effect effect) { this.effect = effect; }
	
	//Accessor Methods
	public int getHeal() { return heal; }
	public Effect getEffect() { return effect; }

	@Override
	public void applyEffect() {
		// TODO Auto-generated method stub
		
	}

}

package Items;

import Combat.Effect;

public class TestWeapon extends Item implements Weapon {

	private int damage;
	private Effect effect;
	
	public TestWeapon(String name, String desc) { 
		
		super(name, desc);
		
	}
	
	public int getDamage() { return damage; }
	public Effect getEffect() { return effect; }

}

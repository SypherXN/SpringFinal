package Items;

import Combat.Effect;

public class TestWeapon extends Item implements Weapon {

	private int damage, target, durability;
	private Effect effect;
	
	public TestWeapon(String name, String desc) { 
		
		super(name, desc);
		
	}
	
	//Modifier Methods
	public void setDamage(int damage) { this.damage = damage; }
	public void setEffect(Effect effect) { this.effect = effect; }
	public void setTargetEffect(int target) { this.target = target; }
	public void setDurability(int durability) {this.durability = durability; }
	
	//Accessor Methods
	public int getDamage() { return damage; }
	public Effect getEffect() { return effect; }
	public int getTargetEffect() { return target; }
	public int getDurability() {return durability; }

	@Override
	public int getDurability() {
		// TODO Auto-generated method stub
		return 0;
	}

}

package Items;

import Combat.Burn;
import Combat.Effect;
import Player.PlayerInfo;

public class TestWeapon extends Item implements Weapon {

	private final int damage = 0;
	private int target;
	private final Effect effect = new Burn();
	
	public TestWeapon() { super("Test Weapon", "This weapon is here for testing"); }
	
	//Modifier Methods
	public void setTargetEffect(int target) { this.target = target; }
	
	//Accessor Methods
	public int getDamage() { return damage; }
	public Effect getEffect() { return effect; }
	public int getTargetEffect() { return target; }

	public void applyEffect() {
		
		PlayerInfo.setWeapon(new TestWeapon());
		System.out.println("You equip " + PlayerInfo.getWeapon());
		
	}

}

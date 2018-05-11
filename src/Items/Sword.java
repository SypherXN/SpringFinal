package Items;

import Combat.Burn;
import Combat.Effect;
import Player.PlayerInfo;

public class Sword extends Item implements Weapon{

	private final int damage = 5;
	private int target;
	private final Effect effect = new Burn();
	
	public Sword() { super("Sword", "Your normal sword"); }

	//Modifier Methods
	public void setTargetEffect(int target) { this.target = target; }
	
	//Accessor Methods
	public int getDamage() { return damage; }
	public Effect getEffect() { return effect; }
	public int getTargetEffect() {return target;}

	public void applyEffect() {
		
		PlayerInfo.setWeapon(new Sword());
		System.out.println("You equip " + PlayerInfo.getWeapon());
		
	}

}

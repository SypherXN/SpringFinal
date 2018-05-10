package Items;

import Combat.Burn;
import Combat.Effect;
import Player.PlayerInfo;

public class Sword extends Item implements Weapon{

	private final int damage = 5;
	private int target;
	private final Effect effect = new Burn();
	
	public Sword(String name, String desc) {
		super(name, desc);
		// TODO Auto-generated constructor stub
	}
	
	public Sword() {
		
		super("Sword", "Your normal sword");
		
	}

	@Override
	public void setTargetEffect(int target) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getDamage() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Effect getEffect() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getTargetEffect() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setDurability(int durability) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getDurability() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void applyEffect() {
		
		PlayerInfo.setWeapon(new Sword());
		System.out.println("You equip " + PlayerInfo.getWeapon());
		
	}

}

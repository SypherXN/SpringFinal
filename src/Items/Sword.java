package Items;

import Combat.Effect;

public class Sword extends Item implements Weapon{

	public Sword(String name, String desc) {
		super(name, desc);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void setDamage(int damage) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setEffect(Effect effect) {
		// TODO Auto-generated method stub
		
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

}

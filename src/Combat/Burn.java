package Combat;

import Player.PlayerInfo;

public class Burn extends Effect {

	public Burn(String name, String desc, int turnCounter) {
		
		super(name, desc, turnCounter);
		
	}
	
	public Burn() {
		
		super("Burn", "Deals damage over time", 5);
		
	}
	
	public void effect(int target) {
		
		if (super.getTurnCounter() == 0) { return; }
		
		if (target == 1) { Combat.getEnemy().modHP(-5); }
		else if (target == 0) { PlayerInfo.modHP(-5); }
		
		super.setTurnCounter(super.getTurnCounter() - 1);
		
		if (super.getTurnCounter() == 0 && target == 1) { System.out.println("Enemy is no longer on fire"); }
		else if (super.getTurnCounter() == 0 && target == 0) { System.out.println("You are no longer on fire"); }
	
	}
	
}

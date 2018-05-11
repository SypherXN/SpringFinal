package Combat;

import Player.PlayerInfo;

public class Burn extends Effect {
	
	public Burn() { super("Burn", "Deals damage over time and lowers defense", 3); }
	
	public void effect(int target) {
		
		//If the effect is already over it doesn't do anything
		if (super.getTurnCounter() == 0) { return; }
		
		//Checks if the effect just started and applies a defense reduction to the target
		if (super.getTurnCounter() == 3 && target == 1) { Combat.getEnemy().modDEF(-5); }
		else if (super.getTurnCounter() == 3 && target == 0) { PlayerInfo.modDEF(-5); }
		
		//Checks which is the target and damages the target
		if (target == 1) { Combat.getEnemy().modHP(-5); }
		else if (target == 0) { PlayerInfo.modHP(-5); }
		
		//Decrements the counter for the effect
		super.setTurnCounter(super.getTurnCounter() - 1);
		
		//Prints out messages when turnCounter hits 0 and determines based off which was the target
		if (super.getTurnCounter() == 0 && target == 1) { System.out.println("Enemy is no longer on fire"); }
		else if (super.getTurnCounter() == 0 && target == 0) { System.out.println("You are no longer on fire"); }
		
		//Checks when the turnCounter hits zero and raises the targets defense back to normal
		if (super.getTurnCounter() == 0 && target == 1) { Combat.getEnemy().modDEF(5); }
		else if (super.getTurnCounter() == 0 && target == 0) { PlayerInfo.modDEF(5); }
	
	}
	
}

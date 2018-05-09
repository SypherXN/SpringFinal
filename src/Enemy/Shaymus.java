package Enemy;

import Combat.Combat;
import GameInfo.*;
import Player.PlayerInfo;

public class Shaymus extends Enemy{

	public Shaymus(String name, Type type, int maxHP, int hp, int att, int def, int sp, String desc, int difficulty) {
		
		super(name, type, maxHP, hp, att, def, sp, desc, difficulty);
		
	}
	
	public Shaymus() {
		
		super("Shaymus", Information.Normal, (int) Math.random()*999, (int) Math.random()*999, (int) Math.random()*999, (int) Math.random()*999, (int) Math.random()*999, "Completely random and unnecesary", (int) Math.random()*999);
		
	}

	public void attack() {

		Combat.takeDamage(super.getATT());
		
	}

}

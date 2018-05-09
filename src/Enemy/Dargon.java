package Enemy;

import Combat.Combat;
import GameInfo.*;
import Player.PlayerInfo;

public class Dargon extends Enemy{

	public Dargon(String name, Type type, int maxHP, int hp, int att, int def, int sp, String desc, int difficulty) {
		super(name, type, maxHP, hp, att, def, sp, desc, difficulty);
		// TODO Auto-generated constructor stub
	}

	public Dargon() {
		
		super("dargon", Information.Normal, 50, 50, 5, 5, 5, "i cant spell", 999);
	}
	public void attack() {

		Combat.takeDamage(super.getATT());
		
	}

}

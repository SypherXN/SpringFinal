package Enemy;

import Combat.Combat;
import GameInfo.*;
import Player.PlayerInfo;

public class B extends Enemy{

	public B(String name, Type type, int maxHP, int hp, int att, int def, int sp, String desc, int difficulty) {
		super(name, type, maxHP, hp, att, def, sp, desc, difficulty);
		// TODO Auto-generated constructor stub
	}

	public B() {
		super("B", Information.Normal, 999, 999, 999, 999, 999, "B", 999);
	}
	public void attack() {
		// TODO Auto-generated method stub
		
	}

}

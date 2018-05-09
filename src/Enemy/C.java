package Enemy;

import Combat.Combat;
import GameInfo.*;
import Player.PlayerInfo;

public class C extends Enemy{

	public C(String name, Type type, int maxHP, int hp, int att, int def, int sp, String desc, int difficulty) {
		super(name, type, maxHP, hp, att, def, sp, desc, difficulty);
		// TODO Auto-generated constructor stub
	}

	public C() {
		super("C", Information.Normal, 999, 999, 999, 999, 999, "C", 999);
	}
	public void attack() {
		// TODO Auto-generated method stub
		
	}

}

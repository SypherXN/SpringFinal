package Enemy;

import Combat.Combat;
import GameInfo.*;
import Player.PlayerInfo;

public class Android extends Enemy{

	public Android(String name, Type type, int maxHP, int hp, int att, int def, int sp, String desc, int difficulty) {
		
		super(name, type, maxHP, hp, att, def, sp, desc, difficulty);
		
	}

	public Android() {
		
		super("Android", Information.Normal, 50, 50, 5, 5, 5, "H", 2);
		
	}
	
	public void attack() {

		Combat.takeDamage(super.getATT());
		
	}

}

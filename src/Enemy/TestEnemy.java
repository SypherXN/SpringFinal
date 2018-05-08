package Enemy;

import Combat.Combat;
import GameInfo.*;
import Player.PlayerInfo;

public class TestEnemy extends Enemy {

	public TestEnemy(String name, Type type, int maxHP, int hp, int att, int def, int sp, String desc) {
		
		super(name, type, maxHP, hp, att, def, sp, desc);
		
	}
	
	public TestEnemy() {
		
		super("Test Enemy", Information.Water, 50, 50, 5, 5, 5, "This enemy is here for a test");
		
	}

	public void attack() {
		
		Combat.takeDamage(super.getATT(), PlayerInfo.getDEF());
		
	}

}

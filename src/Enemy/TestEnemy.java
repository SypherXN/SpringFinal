package Enemy;

import Combat.Combat;
import GameInfo.*;

public class TestEnemy extends Enemy {

	public TestEnemy(String name, Type type, int maxHP, int hp, int att, int def, int sp, String desc, int difficulty) {
		
		super(name, type, maxHP, hp, att, def, sp, desc, difficulty);
		
	}
	
	public TestEnemy() {
		
		super("Test Enemy", Information.Water, 50, 50, 5, 5, 5, "This enemy is here for a test", 10);
		
	}

	public void attack() {
		
		Combat.takeDamage();
		
	}

}

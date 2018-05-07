package Enemy;

import GameInfo.*;

public class TestEnemy extends Enemy {

	public TestEnemy(String name, Type type, int hp, int att, int def, int sp, String desc) {
		
		super(name, type, hp, att, def, sp, desc);
		
	}
	
	public TestEnemy() {
		
		super("Test Enemy", Information.Water, 50, 5, 5, 5, "This enemy is here for a test");
		
	}

	public void attack() {
		
	}

}

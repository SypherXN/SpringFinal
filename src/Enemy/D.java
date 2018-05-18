package Enemy;

import Combat.Combat;
import GameInfo.Information;
import GameInfo.Type;

public class D extends Enemy{

	public D(String name, Type type, int maxHP, int hp, int att, int def, int sp, String desc, int difficulty) {
		super(name, type, maxHP, hp, att, def, sp, desc, difficulty);
		// TODO Auto-generated constructor stub
	}

	public D() {
		super("D", Information.Normal, 999, 999, 999, 999, 100000000, "D", 999);
	}
	
	public void attack() {
		
		Combat.takeDamage();
		
	}

}

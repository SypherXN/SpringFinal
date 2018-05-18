package Enemy;

import Combat.Combat;
import GameInfo.Information;
import GameInfo.Type;

public class Dargon extends Enemy{

	public Dargon(String name, Type type, int maxHP, int hp, int att, int def, int sp, String desc, int difficulty) {
		super(name, type, maxHP, hp, att, def, sp, desc, difficulty);
		// TODO Auto-generated constructor stub
	}

	public Dargon() {
		
		super("dargon", Information.Normal, 50, 50, 5, 5, 5, "This is NOT a dragon", 999);
	}
	
	public void attack() {

		Combat.takeDamage();
		
	}

}

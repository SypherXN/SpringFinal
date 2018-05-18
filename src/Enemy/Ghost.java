package Enemy;

import Combat.Combat;
import GameInfo.Information;
import GameInfo.Type;

public class Ghost extends Enemy{

	public Ghost(String name, Type type, int maxHP, int hp, int att, int def, int sp, String desc, int difficulty) {
		
		super(name, type, maxHP, hp, att, def, sp, desc, difficulty);
		
	}
	
	public Ghost() {
		
		super("Ghost", Information.Electric, 10, 10, 10, 10, 10, "h", 1);
		
	}
	
	public void attack() {
		
		Combat.takeDamage();
		
	}
	
}

package Enemy;

import GameInfo.*;

public class Monkey extends Enemy{

	public Monkey(String name, Type type, int maxHP, int hp, int att, int def, int sp, String desc) {
		
		super(name, type, maxHP, hp, att, def, sp, desc);
		
	}
	
	public Monkey() {
		
		super("Monkey", Information.Normal, 10, 10, 10, 10, 10, "h");
		
	}
	
	public void attack() {
		
	}
	
}

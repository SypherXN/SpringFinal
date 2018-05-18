package Enemy;

import GameInfo.Information;
import GameInfo.Type;

public class A extends Enemy{

	public A(String name, Type type, int maxHP, int hp, int att, int def, int sp, String desc, int difficulty) {
		super(name, type, maxHP, hp, att, def, sp, desc, difficulty);
		// TODO Auto-generated constructor stub
	}

	public A() {
		super("A", Information.Normal, 999, 999, 999, 999, 999, "A", 999);
	}
	public void attack() {
		// TODO Auto-generated method stub
		
	}

}

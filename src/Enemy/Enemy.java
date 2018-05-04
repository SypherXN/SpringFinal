package Enemy;

import GameInfo.*;

public abstract class Enemy implements Description {

	private String name, desc;
	private Type type;
	private int hp, att, def, sp;
	
	public Enemy(String name, Type type, int hp, int att, int def, int sp, String desc) {
		
		this.name = name;
		this.type = type;
		this.hp = hp;
		this.att = att;
		this.def = def;
		this.sp = sp;
		this.desc = desc;
		
	}
	
	public abstract void attack();
	
}

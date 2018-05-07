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
	
	//Modifier methods
	public void setDesc(String desc) { this.desc = desc; }
	public void setType(Type type) { this.type = type; }
	public void setHP(int hp) { this.hp = hp; }
	public void setATT(int att) { this.att = att; }
	public void setSP(int sp) { this.sp = sp; }
	
	//Accessor methods
	public String getName() { return name; }
	public String getDesc() { return desc; }
	public Type getType() { return type; }
	public int getHP() { return hp; }
	public int getATT() { return att; }
	public int getDEF() { return def; }
	public int getSP() { return sp; }
	
}

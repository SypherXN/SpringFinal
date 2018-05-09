package Enemy;

import GameInfo.*;

public abstract class Enemy implements Description {

	private String name, desc;
	private Type type;
	private int maxHP, hp, att, def, sp;
	private int difficulty;
	
	public Enemy(String name, Type type, int maxHP, int hp, int att, int def, int sp, String desc, int difficulty) {
		
		this.name = name;
		this.type = type;
		this.maxHP = maxHP;
		this.hp = hp;
		this.att = att;
		this.def = def;
		this.sp = sp;
		this.desc = desc;
		this.difficulty = difficulty;
		
	}
	
	public abstract void attack();
	
	//Combat Modifier Methods
	public void modHP(int mod) { hp += mod; }
	
	//Modifier methods
	public void setDesc(String desc) { this.desc = desc; }
	public void setType(Type type) { this.type = type; }
	public void setMaxHP() { this.maxHP = maxHP; }
	public void setHP(int hp) { this.hp = hp; }
	public void setATT(int att) { this.att = att; }
	public void setSP(int sp) { this.sp = sp; }
	public void setDifficulty(int difficulty) { this.difficulty = difficulty; }
	
	//Accessor methods
	public String getName() { return name; }
	public String getDesc() { return desc; }
	public Type getType() { return type; }
	public int getMaxHP() { return maxHP; }
	public int getHP() { return hp; }
	public int getATT() { return att; }
	public int getDEF() { return def; }
	public int getSP() { return sp; }
	public int getDifficulty() { return difficulty; }
	
}

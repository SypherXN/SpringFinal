package Enemy;

import Combat.Combat;
import GameInfo.*;
import Player.PlayerInfo;

public abstract class Enemy implements Description, Comparable<Enemy> {

	private String name, desc;
	private Type type;
	private int maxHP, hp, att, def, sp;
	private int difficulty;
	
	/** Constructor of for Enemy
	 * 
	 * @param name - name of the enemy
	 * @param type - type of the enemy
	 * @param maxHP - max hp of the enemy
	 * @param hp - hp of the enemy
	 * @param att - attack of the enemy
	 * @param def - defense of the enemy
	 * @param sp - speed of the enemy
	 * @param desc - description of the enemy
	 * @param difficulty - difficulty of the enemy
	 */
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
	
	/** Used for attacks and applies special effects if needed
	 * 
	 */
	public abstract void attack();
	
	/** Compares the difficulty of each Enemy
	 * 
	 * @param other - The other Enemy to compare difficulties
	 * @return - Negative if difficulty of other is greater and a positive if lesser
	 */
	public int compareTo(Enemy other) { return ((Integer)difficulty).compareTo(other.getDifficulty()); }
	
	//toString method
	public String toString() { return name; }
	
	//Combat Modifier Methods
	public void modHP(int mod) { hp += mod; }
	public void modATT(int mod) { att += mod; }
	public void modDEF(int mod) { def += mod; }
	public void modSP(int mod) { sp += mod; }
	
	//Modifier methods
	public void setDesc(String desc) { this.desc = desc; }
	public void setType(Type type) { this.type = type; }
	public void setMaxHP() { this.maxHP = maxHP; }
	public void setHP(int hp) { this.hp = hp; }
	public void setATT(int att) { this.att = att; }
	public void setDEF(int def) { this.def = def; }
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

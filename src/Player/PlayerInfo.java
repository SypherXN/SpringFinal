package Player;

import java.util.ArrayList;
import java.util.Scanner;

import Items.Item;
import Items.Weapon;

public class PlayerInfo {

	private static String name;
	private static int maxHP, hp, att, def, sp;
	private static ArrayList<Item> backpack = new ArrayList<Item>();
	private static Weapon weapon;
	
	/** Initializes the player and asks for name and sets stats
	 * 
	 */
	public static void initPlayer() {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("What is your name: ");
		
		name = input.nextLine();
		
		maxHP = 50;
		hp = (int) (Math.random() * 3 + 48);
		att = (int)(Math.random() * 2 + 4);
		def = (int) (Math.random() * 2 + 4);
		sp = (int) (Math.random() * 2 + 4);
		
	}
	
	//Combat Modifier Methods
	public static void modMaxHP(int mod) { maxHP += mod; }
	public static void modHP(int mod) {
		
		if (hp + mod < 0) hp = 0;
		else hp += mod;
		
	}
	public static void modATT(int mod) { att += mod; }
	public static void modDEF(int mod) { def += mod; }
	public static void modSP(int mod) { sp += mod; }
	public static void heal(int mod) {
		
		if ((hp + mod) > maxHP) {
			
			hp = maxHP;
			
		} else {
			
			hp += mod;
			
		}
		
	}
	
	//Modifier Methods
	public static void setName(String set) { name = set; }
	public static void setMaxHP(int set) { maxHP = set; }
	public static void setHP(int set) { hp = set; }
	public static void setATT(int set) { att = set; }
	public static void setDEF(int set) { def = set; }
	public static void setSP(int set) { sp = set; }
	public static void addItem(Item item) { backpack.add(item); }
	public static void setWeapon(Weapon set) { weapon = set; }
	
	//Accessor Methods
	public static String getName() { return name; }
	public static int getMaxHP() { return maxHP; }
	public static int getHP() { return hp; }
	public static int getATT() { return att; }
	public static int getDEF() { return def; }
	public static int getSP() { return sp; }
	public static ArrayList<Item> getBackpack() { return backpack; }
	public static Item getItem(int index) { return backpack.get(index); }
	public static Weapon getWeapon() { return weapon; }
	
}

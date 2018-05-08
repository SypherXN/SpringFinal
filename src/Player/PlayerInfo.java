package Player;

import GameInfo.*;
import java.util.*;

public class PlayerInfo {

	private static String name;
	private static int maxHP, hp, att, def, sp;
	
	/** Initializes te player and asks for name and sets stats
	 * 
	 */
	public static void initPlayer() {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("What is your name: ");
		
		name = input.nextLine();
		
		maxHP = 50;
		hp = 50;
		att = 5;
		def = 5;
		sp = 5;
		
	}
	
	//Combat Modifier Methods
	public static void modMaxHP(int mod) { maxHP += mod; }
	public static void modHP(int mod) { hp += mod; }
	public static void modATT(int mod) { att += mod; }
	public static void modDEF(int mod) { def += mod; }
	public static void modSP(int mod) { sp += mod; }
	
	//Modifier Methods
	public static void setName(String set) { name = set; }
	public static void setMaxHP(int set) { maxHP = set; }
	public static void setHP(int set) { hp = set; }
	public static void setATT(int set) { att = set; }
	public static void setDEF(int set) { def = set; }
	public static void setSP(int set) { sp = set; }
	
	//Accessor Methods
	public static String getName() { return name; }
	public static int getMaxHP() { return maxHP; }
	public static int getHP() { return hp; }
	public static int getATT() { return att; }
	public static int getDEF() { return def; }
	public static int getSP() { return sp; }
	
}

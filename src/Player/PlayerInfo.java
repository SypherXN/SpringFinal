package Player;

import GameInfo.*;
import java.util.*;

public class PlayerInfo {

	private static String name;
	private static int hp, att, def, sp;
	
	public PlayerInfo() {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("What is your name: ");
		
		name = input.nextLine();
		
		hp = 50;
		att = 5;
		def = 5;
		sp = 5;
		
	}
	
	//Modifier Methods
	public void modHP(int mod) { hp += mod; }
	public void modATT(int mod) { att += mod; }
	public void modDEF(int mod) { def += mod; }
	public void modSP(int mod) { sp += mod; }
	
	//Accessor Methods
	public String getName() { return name; }
	public int getHP() { return hp; }
	public int getATT() { return att; }
	public int getDEF() { return def; }
	public int getSP() { return sp; }
	
}

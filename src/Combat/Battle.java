package Combat;

import java.util.InputMismatchException;
import java.util.Scanner;

import Enemy.Enemy;
import Player.PlayerInfo;

public class Battle {

	private static final Scanner input = new Scanner(System.in);
	
	public static void Battle(Enemy enemy) {
		
		Combat.setEnemy(enemy);
		System.out.println("You encountered a " + enemy);
		
		while(enemy.getHP() > 0 && PlayerInfo.getHP() > 0) {
			
			
			
		}
		
	}
	
	public static void itemMenu() {
		
		String itemMenu = "What would you like to use?\n";
		
		for(int i = 0; i < PlayerInfo.getBackpack().size(); i++) {
			
			itemMenu += (i + 1) + ". " + PlayerInfo.getItem(i) + "\n";
			
		}
		
		System.out.print(itemMenu);
		int choice = 0;
		
		while (choice < 1 || choice > PlayerInfo.getBackpack().size()) {
			
			try {
				
				choice = input.nextInt();
				
				if (choice > 0 && choice <= PlayerInfo.getBackpack().size()) {
					
					System.out.println(PlayerInfo.getItem(choice - 1));
					
				} else System.out.println("That is an invalid choice, try again");
				
			} catch(InputMismatchException e) { System.out.println("That is an invalid choice, try again"); } finally { if (choice < 1 || choice > PlayerInfo.getBackpack().size()) { input.nextLine(); } else { } }
			
		}
		
	}
	
}

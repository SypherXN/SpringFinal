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
			
			System.out.println("Your HP: " + PlayerInfo.getHP());
			System.out.println(enemy + " HP: " + enemy.getHP());
			combatMenu();
			
		}
		
		if (enemy.getHP() < 0) System.out.println("You killed " + enemy);
		else if (PlayerInfo.getHP() < 0) {
			
			System.out.println(enemy + " has killed you");
			System.out.println("GAME OVER!");
			System.exit(0);
			
		}
		
	}
	
	public static void combatMenu() {
		
		String combatMenu = "What would you like to do?\n";
		combatMenu += "1. Attack"
					+ "\n2. Use Item"
					+ "\n3. Run"
					+ "\n4. Sudoku";
		System.out.println(combatMenu);
		
		int choice = 0;
		
		while (choice < 1 || choice > 4) {
			
			try {
				
				choice = input.nextInt();
				
				if (choice == 1) { 
					
					Combat.dealDamage();
					Combat.getEnemy().attack();
					
				}
				else if (choice == 2) itemMenu();
				else if (choice == 3) run();
				else if (choice == 4) sudoku();
				else System.out.println("That is an invalid choice, try again");
				
			} catch(InputMismatchException e) { System.out.println("That is an invalid choice, try again"); } finally { if (choice < 1 || choice > 4) { input.nextLine(); } else { } }
			
		}
		
	}
	
	public static void itemMenu() {
		
		if (PlayerInfo.getBackpack().size() == 0) {
			
			System.out.println("Your backpack is empty");
			return;
			
		}
		
		String itemMenu = "What would you like to do?\n"
						+ "1. Check Item Description\n"
						+ "2. Use Item";
		
		System.out.println(itemMenu);
		
		int choice = 0;
		
		while (choice < 1 || choice > 2) {
			
			try {
				
				choice = input.nextInt();
				
				if (choice == 1) checkItemMenu();
				else if (choice == 2) useItemMenu();
				else System.out.println("That is an invalid choice, try again");
				
			} catch(InputMismatchException e) { System.out.println("That is an invalid choice, try again"); } finally { if (choice < 1 || choice > 2) { input.nextLine(); } else { } }
			
		}
		
	}
	
	public static void checkItemMenu() {
		
		String checkItemMenu = "What would you like to learn about?\n";
		
		for(int i = 0; i < PlayerInfo.getBackpack().size(); i++) {
			
			checkItemMenu += (i+1) + ". " + PlayerInfo.getItem(i) + "\n";
			
		}
		
		System.out.println(checkItemMenu);
		int choice = 0;
		
		while (choice < 1 || choice > PlayerInfo.getBackpack().size()) {
			
			try {
				
				choice = input.nextInt();
				
				if (choice > 0 && choice <= PlayerInfo.getBackpack().size()) {
					
					System.out.println(PlayerInfo.getItem(choice - 1).getDesc());
					
				} else System.out.println("That is an invalid choice, try again");
				
			} catch(InputMismatchException e) { System.out.println("That is an invalid choice, try again"); } finally { if (choice < 1 || choice > PlayerInfo.getBackpack().size()) { input.nextLine(); } else { } }
			
		}
		
	}
	
	public static void useItemMenu() {
		
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
					
					PlayerInfo.getItem(choice - 1).applyEffect();
					
				} else System.out.println("That is an invalid choice, try again");
				
			} catch(InputMismatchException e) { System.out.println("That is an invalid choice, try again"); } finally { if (choice < 1 || choice > PlayerInfo.getBackpack().size()) { input.nextLine(); } else { } }
			
		}
		
	}
	
	public static void run() {
		
		System.out.println("You attempt to run but the " + Combat.getEnemy() + " is too fast!");
		System..out.println("GAME OVER!");
		System.exit(0);
		
	}
	
	public static void sudoku() {
		
		System.out.println("You commit Sudoku!");
		System.out.println("GAME OVER!");
		System.exit(0);
		
	}
	
}

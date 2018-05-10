package GameInfo;

import java.util.InputMismatchException;
import java.util.Scanner;

import Combat.Combat;
import Player.PlayerInfo;

public class Menu {

	private static final Scanner input = new Scanner(System.in);
	private static final String mainMenu = "What would you like to do?\n"
										+ "1. Search for enemies\n"
										+ "2. Look at map\n"
										+ "3. Check backpack";
	private static final String mapMenu = "What would you like to do?\n"
										+ "1. Move to adjacent location\n"
										+ "2. Check information of locations";
	private static final String moveMapMenu = "Which way would you like to move\n"
											+ "1. Right\n"
											+ "2. Left\n"
											+ "3. Down\n"
											+ "4. Up";
	private static String backpackMenu = "What would you like to use?\n";
	
	public static void mainMenu() { 
		
		System.out.println(mainMenu);
		int choice = 0;
		
		while (choice < 1 || choice > 3) {
			
			try {
				
				choice = input.nextInt();
				
				if (choice == 1) { }
				else if (choice == 2) { }
				else if (choice == 3) { }
				else System.out.println("That is an invalid choice, try again");
				
			} catch(InputMismatchException e) { System.out.println("That is an invalid choice, try again"); } finally { if (choice < 1 || choice > 3) { input.nextLine(); } else { } }
			
		}
		
	}
	
	public static void mapMenu() {
		
		System.out.println(mapMenu);
		int choice = 0;
		
		while (choice < 1 || choice > 2) {
			
			try {
				
				choice = input.nextInt();
				
				if (choice == 1) { }
				else if (choice == 2) { }
				else System.out.println("That is an invalid choice, try again");
				
			} catch(InputMismatchException e) { System.out.println("That is an invalid choice, try again"); } finally { if (choice < 1 || choice > 2) { input.nextLine(); } else { } }
			
		}
		
	}
	
	public static void backpackMenu() {
		
		for (int i = 0; i < PlayerInfo.getBackpack().size(); i++) { 
			
			backpackMenu += ((i + 1) + ". " + PlayerInfo.getItem(i) + "\n");
			
		}
		
		System.out.print(backpackMenu);
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
	
}

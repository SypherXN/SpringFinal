package GameInfo;

import java.util.InputMismatchException;
import java.util.Scanner;

import Combat.Battle;
import Map.Map;
import Player.PlayerInfo;

public class Menu {

	private static final Scanner input = new Scanner(System.in);
	private static final String mainMenu = "What would you like to do?\n"
										+ "1. Search for enemies\n"
										+ "2. Look at map\n"
										+ "3. Check backpack\n"
										+ "4. Quit";
	private static final String mapMenu = "What would you like to do?\n"
										+ "1. Move to adjacent location\n"
										+ "2. Check information of locations";
	private static final String moveMapMenu = "Which way would you like to move\n"
											+ "(You are at X)\n"
											+ "1. Right\n"
											+ "2. Left\n"
											+ "3. Down\n"
											+ "4. Up";
	private static final String locationInfoMenu = "Which location would you like to learn about?\n"
													+ "(You are at X)";
	private static final String backpackMenu = "What would you like to do?\n"
											+ "1. Check description of an item\n"
											+ "2. Use an item\n";
	private static String itemDescriptionMenu = "What item would you like to know about?\n";
	private static String useItemMenu = "What item would you like to use?\n";
	
	public static void mainMenu() { 
		
		System.out.println(mainMenu);
		int choice = 0;
		
		while (choice < 1 || choice > 4) {
			
			try {
				
				choice = input.nextInt();
				
				if (choice == 1) { Battle.Battle(Map.getCurrent().getEnemy()); }
				else if (choice == 2) { mapMenu(); }
				else if (choice == 3) { backpackMenu(); }
				else if (choice == 4) { System.exit(0); }
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
				
				if (choice == 1) { moveMapMenu(); }
				else if (choice == 2) { locationInfoMenu(); }
				else System.out.println("That is an invalid choice, try again");
				
			} catch(InputMismatchException e) { System.out.println("That is an invalid choice, try again"); } finally { if (choice < 1 || choice > 2) { input.nextLine(); } else { } }
			
		}
		
	}
	
	public static void moveMapMenu() {
		
		System.out.println(moveMapMenu);
		System.out.println(Map.printKnownMap());
		int choice = 0;
		
		while (choice < 1 || choice > 4) {
			
			try {
				
				choice = input.nextInt();
				
				if (choice == 1) {
					
					if (!Map.moveAdjacent("R")) {
						
						System.out.println("You cannot move that way");
						moveMapMenu();
						
					}
					
				} else if (choice == 2) {
					
					if (!Map.moveAdjacent("L")) {
						
						System.out.println("You cannot move that way");
						moveMapMenu();
						
					}
					
				} else if (choice == 3) {
					
					if (!Map.moveAdjacent("D")) {
						
						System.out.println("You cannot move that way");
						moveMapMenu();
						
					}
					
				} else if (choice == 4) {
					
					if (!Map.moveAdjacent("U")) {
						
						System.out.println("You cannot move that way");
						moveMapMenu();
						
					}
					
				} else System.out.println("That is an invalid choice, try again");
				
			} catch(InputMismatchException e) { System.out.println("That is an invalid choice, try again"); } finally { if (choice < 1 || choice > 2) { input.nextLine(); } else { } }
			
		}
		
	}
	
	public static void locationInfoMenu() {
		
		System.out.println(locationInfoMenu);
		System.out.println(Map.printKnownMap());
		int choice = 0;
		
		while (choice < 1 || choice > 26) {
			
			try {
				
				choice = input.nextInt();
				
				int row = (choice - 1) / 5;
				int col = (choice - 1) % 5;
				
				if (choice > 0 && choice < 26) {
					
					Map.getLocationInfo(row, col);
					
				}
				else System.out.println("That is an invalid choice, try again");
				
			} catch(InputMismatchException e) { System.out.println("That is an invalid choice, try again"); } finally { if (choice < 1 || choice > 2) { input.nextLine(); } else { } }
			
		}
		
	}
	
	public static void backpackMenu() {
	
		if (PlayerInfo.getBackpack().size() < 1) {
			
			System.out.println("Your backpack is empty");
			return;
			
		}
		
		System.out.print(backpackMenu);
		int choice = 0;
		
		while (choice < 1 || choice > 2) {
			
			try {
				
				choice = input.nextInt();
				
				if (choice == 1) { itemDescriptionMenu(); }
				else if (choice == 2) { useItemMenu(); }
				else System.out.println("That is an invalid choice, try again");
				
			} catch(InputMismatchException e) { System.out.println("That is an invalid choice, try again"); } finally { if (choice < 1 || choice > 2) { input.nextLine(); } else { } }
			
		}
		
		while (choice < 1 || choice > PlayerInfo.getBackpack().size()) {
			
			try {
				
				choice = input.nextInt();
				
				if (choice > 0 && choice <= PlayerInfo.getBackpack().size()) {
					
					PlayerInfo.getItem(choice - 1).applyEffect();
					
				} else System.out.println("That is an invalid choice, try again");
				
			} catch(InputMismatchException e) { System.out.println("That is an invalid choice, try again"); } finally { if (choice < 1 || choice > PlayerInfo.getBackpack().size()) { input.nextLine(); } else { } }
			
		}
		
	}
	
	public static void itemDescriptionMenu() {
		
		for (int i = 0; i < PlayerInfo.getBackpack().size(); i++) { 
			
			itemDescriptionMenu += ((i + 1) + ". " + PlayerInfo.getItem(i) + "\n");
			
		}
		
		System.out.println(itemDescriptionMenu);
		int choice = 0;
		
		while (choice < 1 || choice > PlayerInfo.getBackpack().size()) {
			
			try {
				
				choice = input.nextInt();
				
				if (choice > 0 && choice <= PlayerInfo.getBackpack().size()) {
					
					System.out.println(PlayerInfo.getItem(choice).getDesc());
					
				} else System.out.println("That is an invalid choice, try again");
				
			} catch(InputMismatchException e) { System.out.println("That is an invalid choice, try again"); } finally { if (choice < 1 || choice > PlayerInfo.getBackpack().size()) { input.nextLine(); } else { } }
			
		}
		
	}
	
	public static void useItemMenu() {
		
		for (int i = 0; i < PlayerInfo.getBackpack().size(); i++) { 
			
			useItemMenu += ((i + 1) + ". " + PlayerInfo.getItem(i) + "\n");
			
		}
		
		System.out.println(useItemMenu);
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

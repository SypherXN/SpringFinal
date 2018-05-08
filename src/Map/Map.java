package Map;

public class Map {

	private static Location[][] map = new Location[5][5];
	private static Location[][] knownMap = new Location[5][5];
	private static int currentRow;
	private static int currentCol;
	
	/** Fills the map 2D array from a 1D array and places Player in a random spot on the map
	 * 
	 * @param list - Array of locations that contains all areas of the map (25 long)
	 */
	public static void initMap(Location[] list) {
		
		int counter = 0;
		
		for (int row = 0; row < map.length; row++) {
			
			for (int col = 0; col < map[row].length; col++) {
				
				map[row][col] = list[counter];
				
			}
			
		}
		
		currentRow = (int)(Math.random() * 5);
		currentCol = (int)(Math.random() * 5);
		discoverLocation(currentRow, currentCol);
		
	}
	
	/** Attempts to move player to the adjacent tile in the desired direction
	 * 
	 * @param direction - Direction that the player wants to move and discovers the tile
	 * @return - Returns false if there is no space to the desired direction and true if player moves to new tile
	 */
	public static boolean moveAdjacent(String direction) {
		
		if (direction.equals("L") && (currentCol == 0)) return false;
		else if (direction.equals("R") && (currentCol == 4)) return false;
		else if (direction.equals("U") && (currentRow == 0)) return false;
		else if (direction.equals("D") && (currentRow == 4)) return false;
		
		if (direction.equals("L")) currentCol--;
		else if (direction.equals("R")) currentCol++;
		else if (direction.equals("U")) currentRow++;
		else if (direction.equals("D")) currentRow--;
		
		discoverLocation(currentRow, currentCol);
		
		return true;
		
	}
	
	/** Adds the Location to the knownMap from map
	 * 
	 * @param row - row of the location discovered
	 * @param col - column of the location discovered
	 */
	public static void discoverLocation(int row, int col) {
		
		knownMap[row][col] = map[row][col];
		
	}
	
	/** Attempts to get the description of the location
	 * 
	 * @param row - Row of location
	 * @param col - Column of location
	 */
	public static void getLocationInfo(int row, int col) {
		
		if (knownMap[row][col] == null) {
			
			System.out.println("You have not explored this area yet");
			
		} else {
			
			System.out.println("Name: " + knownMap[row][col].getName());
			System.out.println("Description: " + knownMap[row][col].getDesc());
			
		}
		
	}
	
	/** Shows a string to show the layout of the map
	 * 
	 * @return - A string that shows the 2D array and the numbers corresponding to the map
	 */
	public static String printKnownMap() {
		
		int counter = 1;
		String output = "";
		
		for (int row = 0; row < map.length; row++) {
			
			for (int col = 0; col < map[row].length; col++) {
				
				if ((row == currentRow) && (col == currentCol)) { 
					
					output += "[X]\t";
					counter++;
					
				} else { 
					
					output += "[" + counter + "]\t";
					counter++;
					
				}
				
			}
			
			output += "\n";
			
		}
		
		return output;
		
	}
	
	//Accessor Methods
	public static int getCurrentRow() { return currentRow; }
	public static int getCurrentCol() { return currentCol; }
	
}

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
			
			System.out.println(knownMap[row][col].getDesc());
			
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
				
				output += "[" + counter + "]\t";
				counter++;
				
			}
			
			output += "\n";
			
		}
		
		return output;
		
	}
	
}

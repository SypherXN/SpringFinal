package Map;

import java.util.ArrayList;
import java.util.Collections;

import Enemy.Enemy;
import GameInfo.Description;

public abstract class Location implements Description {

	private String name;
	private ArrayList<Enemy> enemies = new ArrayList<Enemy> ();
	private String desc;
	
	/** Constructor for Location
	 * 
	 * @param name - name of the location
	 * @param desc - description of the location
	 */
	public Location(String name, String desc) {
		
		this.name = name;
		this.desc = desc;
		
	}
	
	
	/** Adds enemies to the array enemies
	 * 
	 * @param enemies - List of enemies in the location
	 */
	public void initEnemies(Enemy...enemies) {
		
		for(Enemy element : enemies) {
			
			this.enemies.add(element);
			
		}
		
	}
	
	/** Sorts the enemy by level of difficulty
	 * 
	 */
	public void sortEnemies() { Collections.sort(enemies); }
	
	//Modifier Methods
	public void setName(String name) { this.name = name; }
	public void setDesc(String desc) { this.desc = desc; }
	
	//Accessor Methods
	public String getName() { return name; }
	public String getDesc() { return desc; }
	
	
}

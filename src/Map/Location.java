package Map;

import java.util.*;
import Enemy.*;
import GameInfo.*;

public abstract class Location implements Description {

	private String name;
	private ArrayList<Enemy> enemies = new ArrayList<Enemy> ();
	private String desc;
	
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
	
	//Modifier Methods
	public void setName(String name) { this.name = name; }
	public void setDesc(String desc) { this.desc = desc; }
	
	//Accessor Methods
	public String getName() { return name; }
	public String getDesc() { return desc; }
	
	
}

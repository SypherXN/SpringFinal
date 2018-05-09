package Items;

import GameInfo.Description;

public abstract class Item implements Description {

	private String name, desc;
	
	/** Constructor for Item
	 * 
	 * @param name - name of the item
	 * @param desc - description of the item
	 */
	public Item(String name, String desc) { 
		
		this.name = name;
		this.desc = desc;
		
	}
	
	//Modifier Methods
	public void setName(String name) { this.name = name; }
	public void setDesc(String desc) { this.desc = desc; }
	
	//Accessor Methods
	public String getName() { return name; }
	public String getDesc() { return desc; }
	
}

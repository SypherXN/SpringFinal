package Combat;

import GameInfo.Description;

public abstract class Effect implements Description {

	private String name;
	private String desc;
	
	public Effect(String name, String desc) {
		
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

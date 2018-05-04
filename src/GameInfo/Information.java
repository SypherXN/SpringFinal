package GameInfo;

public class Information {

	//Initializes the types
	public static final Type 
			
		Normal = new Type("Normal"),
		Fire = new Type("Fire"),
		Water = new Type("Water"),
		Ground = new Type("Ground"),
		Ice = new Type("Ice"),
		Electric = new Type("Electric");
	
	//Initializes the Types' resistances
	public static void initResistances() {
		
		Normal.addResistances();
		Fire.addResistances(Water);
		Water.addResistances();
		Ground.addResistances();
		Ice.addResistances();
		Electric.addResistances();
		
	}
	
	//Initializes the Types' weaknesses
	public static void initWeaknesses() {
		
		Normal.addWeakness();
		Fire.addWeakness();
		Water.addWeakness();
		Ground.addWeakness();
		Ice.addWeakness();
		Electric.addWeakness();
		
	}
	
}

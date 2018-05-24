package GameInfo;

import Enemy.A;
import Enemy.Android;
import Enemy.B;
import Enemy.C;
import Enemy.D;
import Enemy.Dargon;
import Enemy.Ghost;
import Enemy.Monkey;
import Enemy.Shaymus;
import Map.Location;

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
	
	public static void initEnemiesLocation(Location...locations) {
		
		locations[0].initEnemies(new Dargon(), new A());
		locations[1].initEnemies(new Shaymus());
		locations[2].initEnemies(new A(), new B(), new C(), new D());
		locations[3].initEnemies(new Android());
		locations[4].initEnemies(new Ghost(), new Monkey());
		locations[5].initEnemies(new Dargon(), new Monkey());
		locations[6].initEnemies(new Shaymus(), new A(), new B(), new C(), new D());
		locations[7].initEnemies(new Ghost(), new Dargon());
		locations[8].initEnemies(new Android(), new Shaymus());
		locations[9].initEnemies(new A());
		locations[10].initEnemies(new B());
		locations[11].initEnemies(new C());
		locations[12].initEnemies(new D());
		locations[13].initEnemies(new Dargon());
		locations[14].initEnemies(new Ghost());
		locations[15].initEnemies(new Monkey());
		locations[16].initEnemies(new A(), new B());
		locations[17].initEnemies(new B(), new C());
		locations[18].initEnemies(new Dargon(), new D());
		locations[19].initEnemies(new A(), new C());
		locations[20].initEnemies(new Shaymus(), new Monkey());
		locations[21].initEnemies(new D(), new Shaymus());
		locations[22].initEnemies(new Ghost(), new Shaymus());
		locations[23].initEnemies(new Dargon(), new Shaymus());
		locations[24].initEnemies(new Shaymus(), new A(), new B(), new C(), new D(), new Android(), new Dargon(), new Ghost(), new Monkey());
		
	}
	
}

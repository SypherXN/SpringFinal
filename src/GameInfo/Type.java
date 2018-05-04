package GameInfo;

import java.util.ArrayList;

public class Type {

	private String type;
	private ArrayList<Type> resistanceList;
	private ArrayList<Type> weaknessList;
	
	/** Creates a reference for Type
	 * 
	 * @param type - Name of the type
	 */
	public Type(String type) {
		
		this.type = type;
		
	}
	
	/** Fills weaknessList with the Types that Type is weak to
	 * 
	 * @param types - List of types that Type is weak to
	 */
	public void addWeakness(Type...types) {
		
		for(Type element : types) {
			
			resistanceList.add(element);
			
		}
		
	}
	
	/** Fills resistanceList with the Types that Type is weak to
	 * 
	 * @param types - List of types that Type is resistant to
	 */
	public void addResistances(Type...types) {
		
		for(Type element : types) {
			
			weaknessList.add(element);
			
		}
		
	}
	
	/** Checks if attackingType is on receivingType's resistanceList
	 * 
	 * @param attackingType - Type that is attacking the other
	 * @param receivingType - Type that is receiving the attack
	 * @return - Return true if Type is present in resistanceList, false if not
	 */
	public boolean isResistance(Type attackingType, Type receivingType) {
		
		for(Type element : receivingType.getResistanceList()) {
			
			if (element.getType().equals(attackingType.getType())) {
				
				return true;
				
			}
			
		}
		
		return false;
		
	}
	
	/** Checks if attackingType is on receivingType's weaknessList
	 * 
	 * @param attackingType - Type that is attacking the other
	 * @param receivingType - Type that is receiving the attack
	 * @return - Return true if Type is present in weaknessList, false if not
	 */
	public boolean isWeakness(Type attackingType, Type receivingType) {
		
		for(Type element : receivingType.getWeaknessList()) {
			
			if (element.getType().equals(attackingType.getType())) {
				
				return true;
				
			}
			
		}
		
		return false;
		
	}
	
	/* Accessor Methods */
	public String getType() { return type; }
	public ArrayList<Type> getResistanceList() { return resistanceList; }
	public ArrayList<Type> getWeaknessList() { return weaknessList; }
	
}

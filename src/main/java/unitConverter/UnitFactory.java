package unitConverter;

/**
 * A UnitFactory class is a singleton class that use to get types of unit, 
 * units of that type and set an instance of UnitFactory also.
 * @author Kunyaruk Katebunlu
 */
public class UnitFactory {
	/** singleton instance of UnitFactory. */
	private static UnitFactory factory;
	
	/** Create new UnitFactory. */
	private UnitFactory() { }
	
	/**
	 * Get an instance of UnitFactory.
	 * @return an object of a UnitFactory
	 */
	public static UnitFactory getInstance() {
		if(factory == null) factory = new UnitFactory();
		return factory;
	}
	
	/** Get the names of the types of units that the factory knows about.
	 * @return collection of UnitType
	 */
	public UnitType[] getUnitTypes() {
		return UnitType.values();
	}
	
	/** Get all the units of one type.
	 * @return collection of units
	 */
	public Unit<?>[] getUnits(UnitType unitType) {
		if(unitType.toString().equals("Length")) return Length.values();
		else if(unitType.toString().equals("Temperature")) return Temperature.values();
		else if(unitType.toString().equals("Weight")) return Weight.values();
		else if(unitType.toString().equals("Volume")) return Volume.values();
		else return null;
	}
}

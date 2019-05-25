package unitConverter;

/**
 * An interface for any unit types objects.
 * @author Kunyaruk Katebunlu
 * @param <T> the type of units that this object may be converted to
 */
public interface Unit<T> {
	/**
	 * Convert value (same type) from one unit to another unit.
	 * @param amount is amount that want to convert.
	 * @param toUnit is a unit that want to convert to.
	 * @return converted result
	 */
	public double convert(double amount, Unit<?> toUnit);
	
	/**
	 * 
	 * @return information of a unit
	 */
	public String toString();
	
	/**
	 * Get value of a unit type.
	 * @return value of a unit type
	 */
	public double getValue();
}

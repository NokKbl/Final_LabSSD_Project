package unitConverter;

/**
 * Length enum is a class with a fixed set of static instances for Length units.
 * @author Kunyaruk Katebunlu
 */
public enum Length implements Unit<Length>{
	/** enum members */
	Meter(1.0000),
	Centimeter(100.00),
	Kilometer(0.001),
	Inch(39.3701),
	Mile(0.000621371),
	Yard(1.09361),
	Sok(2.0000),
	Yod(0.0000625);
	
	/** attribute of the enum numbers */
	private final double value;
	
	/**
	 * Constructor of Length.
	 * @param value is an input value.
	 */
	private Length(double value) {
		this.value = value;
	}
	
	/**
	 * Convert input value from one unit to another.
	 * @param amount is a value that want to convert.
	 * @param toUnit is a unit that want to convert to.
	 * @return converted value
	 */
	@Override
	public double convert(double amount, Unit<?> toUnit) {
		Length unit = (Length) toUnit;
		return (amount/this.getValue())*unit.getValue();
	}

	/**
	 * Return a value of the Length units.
	 * @return value of Length units.
	 */
	@Override
	public double getValue() {
		return this.value;
	}

}

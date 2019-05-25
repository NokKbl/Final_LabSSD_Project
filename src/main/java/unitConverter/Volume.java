package unitConverter;

/**
 * Volume enum is a class with a fixed set of static instances for Volume units.
 * @author Kunyaruk Katebunlu
 */
public enum Volume implements Unit<Volume> {
	/** enum members */
	Litre(1.0000),
	Millilitre(1000.00),
	Cubic_Kilometer(1.00E-12),
	Cubic_Meter(0.001),
	Teaspoon(202.884),
	Gallon(0.264172),
	Gwian(0.0005),
	Thang(0.05);

	/** attribute of the enum numbers */
	private double value;
	
	/**
	 * Constructor of Volume.
	 * @param value is an input value.
	 */
	private Volume(double value){
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
		Volume unit = (Volume) toUnit;
		return (amount/this.getValue())*unit.getValue();
	}

	/**
	 * Return a value of the Volume units.
	 * @return value of Volume units.
	 */
	@Override
	public double getValue() {
		return value;
	}

}

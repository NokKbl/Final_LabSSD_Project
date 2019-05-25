package unitConverter;

/**
 * Weight enum is a class with a fixed set of static instances for Weight units.
 * @author Kunyaruk Katebunlu
 */
public enum Weight implements Unit<Weight>{
	/** enum members */
	Kilogram(1.0000),
	Gram(1000.00),
	Milligram(1000000.00),
	Metric_Ton(0.001),
	Ounce(35.274),
	Stone(0.157473),
	Chung(1/1.2),
	Harb(1/60.0);

	/** attribute of the enum numbers */
	private double value;
	
	/**
	 * Constructor of Weight.
	 * @param value is an input value.
	 */
	private Weight(double value){
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
		Weight unit = (Weight) toUnit;
		return (amount/this.getValue())*unit.getValue();
	}

	/**
	 * Return a value of the Weight units.
	 * @return value of Weight units.
	 */
	@Override
	public double getValue() {
		return this.value;
	}
	
}

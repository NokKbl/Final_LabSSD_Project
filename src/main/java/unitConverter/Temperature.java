package unitConverter;

/**
 * Temperature enum is a class with a fixed set of static instances for Temperature units.
 * @author Kunyaruk Katebunlu
 */
public enum Temperature implements Unit<Temperature> {
	/** enum members */
	Celsius(0.00),
	Kelvin(273.15),
	Fahrenheit(32.00),
	Rankine_Scale(491.67),
	Delisle_Scale(150.00);

	/** attribute of the enum numbers */
	private double value;
	
	/**
	 * Constructor of Temperature.
	 * @param value is an input value.
	 */
	private Temperature(double value) {
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
		Temperature unit = (Temperature) toUnit;
		double convertToBase;
		
		if(this.equals(Temperature.Kelvin)) convertToBase = amount - 273.15;
		else if(this.equals(Temperature.Fahrenheit)) convertToBase = (amount - 32.00)/1.8;
		else if(this.equals(Temperature.Rankine_Scale)) convertToBase = (amount - 491.67)*(5.0/9.0);
		else if(this.equals(Temperature.Delisle_Scale)) convertToBase = (150.00 - amount)*(2.0/3.0);
		else convertToBase = amount;
		
		if(unit.equals(Kelvin)) return convertToBase + unit.getValue();
		else if(unit.equals(Fahrenheit)) return (convertToBase*1.8) + unit.getValue();
		else if(unit.equals(Rankine_Scale)) return ((9.0/5.0)*convertToBase)+unit.getValue();
		else if(unit.equals(Delisle_Scale)) return unit.getValue() - ((3.0/2.0)*convertToBase);
		return convertToBase;
	}

	/**
	 * Return a value of the Temperature units.
	 * @return value of Temperature units.
	 */
	@Override
	public double getValue() {
		return this.value;
	}

}

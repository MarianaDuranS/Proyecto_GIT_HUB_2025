
public class ConversionTemperaturas {
	// CELSIUS
	public double gradosCelsiusAFahrenheit(double celsius) {
		double fahrenheit = (celsius * 9 / 5) + 32;
		return fahrenheit;

	}

	public double gradosCelsiusAKelvin(double celsius) {
		double kelvin = celsius + 273.15;
		return kelvin;

	}

	public double gradosCelsiusARankine(double celsius) {
		double rankine = (celsius * 9 / 5) + 491.67;
		return rankine;

	}

	// FAHRENHEIT
	public double gradosFahrenheitACelsius(double fahrenheit) {
		double celsius = (fahrenheit - 32) * 5 / 9;
		return celsius;

	}

	public double gradosFahrenheitAKelvin(double fahrenheit) {
		double kelvin = (fahrenheit + 459.67) * 5 / 9;
		return kelvin;

	}

	public double gradosFahrenheitARankine(double fahrenheit) {
		double rankine = fahrenheit + 459.67;
		return rankine;

	}

	// KELVIN
	public double gradosKelvinACelsius(double kelvin) {
		double celsius = kelvin - 273.15;
		return celsius;

	}

	public double gradosKelvinAFahrenheit(double kelvin) {
		double fahrenheit = (kelvin * 9 / 5) - 459.67;
		return fahrenheit;

	}

	public double gradosKelvinARankine(double kelvin) {
		double rankine = kelvin * 9 / 5;
		return rankine;

	}

	// RANKINE
	public double gradosRankineACelsius(double rankine) {
		double celsius = (rankine - 491.67) * 5 / 9;
		return celsius;

	}

	public double gradosRankineAFahrenheit(double rankine) {
		double fahrenheit = rankine - 459.67;
		return fahrenheit;

	}

	public double gradosRankineAKelvin(double rankine) {
		double kelvin = rankine * 5 / 9;
		return kelvin;

	}

}

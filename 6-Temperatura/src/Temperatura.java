
public class Temperatura {
	private double celsius;
	private double fahrenheit;
	public Temperatura() {
		super();
	}
	public Temperatura(double celsius, double fahrenheit) {
		super();
		this.celsius = celsius;
		this.fahrenheit = fahrenheit;
	}
	public double getCelsius() {
		return celsius;
	}
	public void setCelsius(double celsius) {
		this.celsius = celsius;
	}
	public double getFahrenheit() {
		return fahrenheit = (9 * celsius + 160) / 5;
	}
	public void setFahrenheit(double fahrenheit) {
		this.fahrenheit = fahrenheit;
	}
}

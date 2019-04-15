
public class Volume {
	private double altura;
	private double r;
	private double volume;
	public Volume() {
		super();
	}
	public Volume(double altura, double r, double volume) {
		super();
		this.altura = altura;
		this.r = r;
		this.volume = volume;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public double getR() {
		return r;
	}
	public void setR(double r) {
		this.r = r;
	}
	public double getVolume() {
		return volume = 3.14 * (r * r)* altura;
	}
	public void setVolume(double volume) {
		this.volume = volume;
	}
}

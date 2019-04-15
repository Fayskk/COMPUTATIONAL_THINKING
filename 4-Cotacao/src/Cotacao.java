
public class Cotacao {
	private double dolar;
	private double reaisPossui;
	private double reaisValeDolar;
	public Cotacao() {
		super();
	}
	public Cotacao(double dolar, double reaisPossui, double reaisValeDolar) {
		super();
		this.dolar = dolar;
		this.reaisPossui = reaisPossui;
		this.reaisValeDolar = reaisValeDolar;
	}
	public double getDolar() {
		return dolar;
	}
	public void setDolar(double dolar) {
		this.dolar = dolar;
	}
	public double getReaisPossui() {
		return reaisPossui;
	}
	public void setReaisPossui(double reaisPossui) {
		this.reaisPossui = reaisPossui;
	}
	public double getReaisValeDolar() {
		return reaisValeDolar = (reaisPossui / dolar);
	}
	public void setReaisValeDolar(double reaisValeDolar) {
		this.reaisValeDolar = reaisValeDolar;
	}
}

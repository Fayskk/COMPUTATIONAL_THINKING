
public class Abastecimento {
	private double precoLitro;
	private double valorAbastecer;
	private double litrosComprados;
	public Abastecimento() {
		super();
	}
	public Abastecimento(double precoLitro, double valorAbastecer, double litrosComprados) {
		super();
		this.precoLitro = precoLitro;
		this.valorAbastecer = valorAbastecer;
		this.litrosComprados = litrosComprados;
	}
	public double getPrecoLitro() {
		return precoLitro;
	}
	public void setPrecoLitro(double precoLitro) {
		this.precoLitro = precoLitro;
	}
	public double getValorAbastecer() {
		return valorAbastecer;
	}
	public void setValorAbastecer(double valorAbastecer) {
		this.valorAbastecer = valorAbastecer;
	}
	public double getLitrosComprados() {
		return litrosComprados = (valorAbastecer / precoLitro);
	}
	public void setLitrosComprados(double litrosComprados) {
		this.litrosComprados = litrosComprados;
	}
}

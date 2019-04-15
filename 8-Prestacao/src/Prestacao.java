
public class Prestacao {
	private double valorBoleto;
	private double percentualJuros;
	private int diasAtrasado;
	private double novoValor;
	public Prestacao() {
		super();
	}

	public Prestacao(double valorBoleto, double percentualJuros, int diasAtrasado) {
		super();
		this.valorBoleto = valorBoleto;
		this.percentualJuros = percentualJuros;
		this.diasAtrasado = diasAtrasado;
		this.novoValor = valorBoleto + (valorBoleto * (percentualJuros/100)) * diasAtrasado;;
	}
	public double getValorBoleto() {
		return valorBoleto;
	}
	public double getPercentualJuros() {
		return percentualJuros;
	}
	public int getDiasAtrasado() {
		return diasAtrasado;
	}
	public double novoValor() {
		return novoValor;
	}
	
}

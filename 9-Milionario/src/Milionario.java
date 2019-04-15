
public class Milionario {
	private double salario;
	private double despesasMes;
	private int anos;
	private double sobra;
	public Milionario() {
		super();
	}
	public Milionario(double salario, double despesasMes, int anos, double sobra) {
		super();
		this.salario = salario;
		this.despesasMes = despesasMes;
		this.anos = anos;
		this.sobra = sobra;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public double getDespesasMes() {
		return despesasMes;
	}
	public void setDespesasMes(double despesasMes) {
		this.despesasMes = despesasMes;
	}
	public int getAnos() {
		return anos;
	}
	public void setAnos(int anos) {
		this.anos = anos;
	}
	public double getSobra() {
		return sobra;
	}	
	public void calcularSobra() {
		this.sobra = salario - despesasMes;
	}
}

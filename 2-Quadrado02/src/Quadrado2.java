
public class Quadrado2 {
	private double num1;
	private double num2;
	private double num3;
	private double somaos3;
	public Quadrado2() {
		super();
	}
	public Quadrado2(double num1, double num2, double num3, double somaos3) {
		super();
		this.num1 = num1;
		this.num2 = num2;
		this.num3 = num3;
		this.somaos3 = somaos3;
	}
	public double getNum1() {
		return num1;
	}
	public void setNum1(double num1) {
		this.num1 = num1;
	}
	public double getNum2() {
		return num2;
	}
	public void setNum2(double num2) {
		this.num2 = num2;
	}
	public double getNum3() {
		return num3;
	}
	public void setNum3(double num3) {
		this.num3 = num3;
	}
	public double getSomaos3() {
		return somaos3 = (num1 + num2 + num3) * (num1 + num2 + num3) ;
	}
	public void setSomaos3(double somaos3) {
		this.somaos3 = somaos3;
	}
}

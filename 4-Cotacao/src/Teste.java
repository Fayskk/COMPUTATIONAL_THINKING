import javax.swing.JOptionPane;

public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cotacao c = new Cotacao();
		
		c.setDolar(Double.parseDouble(JOptionPane.showInputDialog("Digite o Valor do dolar")));
		c.setReaisPossui(Double.parseDouble(JOptionPane.showInputDialog("Digite quantos reais possui")));
		
		JOptionPane.showMessageDialog(null, "Você possui $" + c.getReaisValeDolar(), "Aviso", JOptionPane.INFORMATION_MESSAGE);
	}

}

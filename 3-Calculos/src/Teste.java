import javax.swing.JOptionPane;

public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculo c = new Calculo();
		c.setNum1(Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro numero")));
		c.setNum2(Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo numero")));
		c.setNum3(Double.parseDouble(JOptionPane.showInputDialog("Digite o terceiro numero")));
		c.setNum4(Double.parseDouble(JOptionPane.showInputDialog("Digite o quarto numero")));
		
		JOptionPane.showMessageDialog(null, c.getMultiplica());
		JOptionPane.showMessageDialog(null, c.getSoma());

	}

}

import javax.swing.JOptionPane;

public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Quadrado2 q = new Quadrado2();
		q.setNum1(Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro numero")));
		q.setNum2(Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo numero")));
		q.setNum3(Double.parseDouble(JOptionPane.showInputDialog("Digite o terceiro numero")));
		
		JOptionPane.showMessageDialog(null, q.getSomaos3());

	}

}

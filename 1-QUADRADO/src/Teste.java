import javax.swing.JOptionPane;

public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Quadrado q = new Quadrado();
		q.setNumero(Double.parseDouble(JOptionPane.showInputDialog("Digite um numero")));
		
		JOptionPane.showMessageDialog(null, q.getNumero());
	}

}

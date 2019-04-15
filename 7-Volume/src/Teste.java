import javax.swing.JOptionPane;

public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Volume v = new Volume();
		
		v.setAltura(Double.parseDouble(JOptionPane.showInputDialog("Digite a altura da lata de óleo")));
		v.setR(Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de R")));
		
		JOptionPane.showMessageDialog(null, "O volume é " + v.getVolume());
	}

}

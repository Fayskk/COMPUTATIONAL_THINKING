import javax.swing.JOptionPane;

public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Temperatura t = new Temperatura();
		
		t.setCelsius(Double.parseDouble(JOptionPane.showInputDialog("Digite a temperatura em Celsius")));
		
		JOptionPane.showMessageDialog(null, "Temperatura em Fahrenheit é " + t.getFahrenheit(), "Aviso", JOptionPane.INFORMATION_MESSAGE);


	}

}

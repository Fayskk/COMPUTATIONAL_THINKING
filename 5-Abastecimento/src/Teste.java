import javax.swing.JOptionPane;

public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Abastecimento a = new Abastecimento();
		
		a.setPrecoLitro(Double.parseDouble(JOptionPane.showInputDialog("Digite o Valor do litro R$")));
		a.setValorAbastecer(Double.parseDouble(JOptionPane.showInputDialog("Digite quantos reais deseja abastecer R$")));
		
		JOptionPane.showMessageDialog(null, "Você irá abastecer " + a.getLitrosComprados() + " Litros!", "Aviso", JOptionPane.INFORMATION_MESSAGE);

	}

}

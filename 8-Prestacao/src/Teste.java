import javax.swing.JOptionPane;

public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Prestacao p = new Prestacao();
		
		p.setValorBoleto(Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do boleto")));
		p.setPercentualJuros(Double.parseDouble(JOptionPane.showInputDialog("Digite o percentual do juros")));
		p.setDiasAtrasado(Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de dias em atraso")));
		
		JOptionPane.showMessageDialog(null, "Novo valor a pagar � R$" + p.novoValor());

	}

}

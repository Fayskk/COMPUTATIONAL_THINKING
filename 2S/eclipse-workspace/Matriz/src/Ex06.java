import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		int codProduto[] = new int [5];
		String nomeProduto[] = new String [5];
		String nomeLoja[] = new String [6];
		float m [][] = new float [5][6];
		double menorPreco[] = new double[5];
		String menorLoja [] = new String [5];
		
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Digite o c�digo de 5 produtos: ");
		for (int i = 0; i < 5; i++) {
			codProduto[i] = scn.nextInt();
		}
		/* N�o consegui corrigir!!! =(
		 * Quando vou digitar o nome do produto ele pula o primeiro produto 
		 * e o primeiro produto de todas as lojas fica sem nome*/
		System.out.println("Digite o nome de 5 produtos: ");
		for (int i = 0; i < 5; i++) {
			nomeProduto[i] = scn.nextLine();
		}
		
		System.out.println("Digite o nome de 6 lojas: ");
		for (int i = 0; i < 6; i++) {
			nomeLoja[i] = scn.nextLine();
		}
		
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 6; j++) {
				System.out.println("Digite o valor do Produto " + nomeProduto[i] + " da loja " + nomeLoja[j]);
				m[i][j] = scn.nextFloat();
				
				if (j == 0) {
					menorPreco[i] = m[i][j];
					menorLoja[i] = nomeLoja[j];
				} else {
					if (m[i][j] < menorPreco[i]) {
						menorPreco[i] = m[i][j];
						menorLoja[i] = nomeLoja[j];
					}
				}
			}
		}
				
		System.out.println("Loja com menor pre�o: ");
		
		for (int i = 0; i < 5; i++) {
			System.out.println("Produto " + nomeProduto[i] + " na loja " + menorLoja[i] + " por " + menorPreco[i]);
		}
		
		scn.close();
	}
		
}

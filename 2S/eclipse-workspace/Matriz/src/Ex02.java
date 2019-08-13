import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		int m [] [] = new int [4] [4];
		int r [] [] = new int [4] [4];
		int maior = 0;
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite 16 n�meros inteiros:");
		
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				m[i][j] = entrada.nextInt();
				
				if (i == 0 && j == 0) {
					maior = m[i][j];
				} else {
					if (m[i][j] > maior) {
						maior = m[i][j];
					}
				}
			}
		}
		
		System.out.println("Matriz resultante: ");
		
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				r[i][j] = maior * m[i][j];
				System.out.println("\t" + r[i][j]);
			}
			System.out.println(" ");
		}
		
		entrada.close();
	}

}

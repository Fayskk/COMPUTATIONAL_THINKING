import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int valor = 0;
		int soma = 0;
		for (int num = 1; num <= 5; num++) {
			System.out.println("Digite um numero ");
			valor = scn.nextInt();
			if (valor < 0) {
				soma = valor + soma;
			}
		}
		System.out.println("Soma dos numero negativos � " + soma);
	}

}

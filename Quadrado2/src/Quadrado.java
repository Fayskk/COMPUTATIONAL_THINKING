import java.util.Scanner;

public class Quadrado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero1;
		int numero2;
		int numero3;
		int soma;
		int quadrado;
		Scanner scn = new Scanner (System.in);
		System.out.println("Digite 3 (tres) numeros ");
		numero1 = scn.nextInt();
		numero2 = scn.nextInt();
		numero3 = scn.nextInt();
		soma = (numero1 + numero2 + numero3);
		quadrado = (soma * soma);
		System.out.println("O quadrado dos 3 numeros � " + quadrado);

	}

}

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner (System.in);
		
		//Exerc�cio usando for
		//int soma = 0;
		//int par = 0;
		//int valor = 0;
		//for(int num=1;num<=40;num++) {
		//	System.out.println("Digite um numero: ");
		//	valor = scn.nextInt();
		//	par = valor % 2;
		//	if (par == 0) {
		//		soma = valor + soma;
		//	}
		//}
		//System.out.println("Soma de todos os pares " + soma);
		//fim do exerc�cio usando for
		
		//Exerc�cio usando while
		/*int soma = 0;
		int par = 0;
		int valor = 0;
		int num = 1;
		while (num <=40) {
			System.out.println("Digite um numero: ");
			valor = scn.nextInt();
			par = valor % 2;
			if (par == 0) {
				soma = valor + soma;
			}
			num++;
		}
		System.out.println("Soma de todos os pares " + soma);*/
		//Fim do exerc�cio com while
		//Exercicio com Do while
		int soma = 0;
		int par = 0;
		int valor = 0;
		int num = 1;
		do {
			System.out.println("Digite um numero: ");
			valor = scn.nextInt();
			par = valor % 2;
			if (par == 0) {
				soma = valor + soma;
			}
			num++;
		} while (num <= 4);
		System.out.println("Soma de todos os pares " + soma);
		//fim do exerc�cio do while
	}

}

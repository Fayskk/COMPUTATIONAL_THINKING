import java.util.Scanner;
public class Teste {
	public static void main(String[] args) {
		// Variáveis: nota1, nota2 e média do aluno
		double nota1 = 0, nota2 = 0, media = 0;
		Scanner scn = new Scanner(System.in);
		System.out.println("Entre com a primeira e a segunda nota do aluno:");
		// entrada de dados
		nota1 = scn.nextDouble();
		nota2 = scn.nextDouble();
		// cálculo da média
		media = (nota1 + nota2)/2;
		System.out.println("A média é : "+media);
		}
	
}

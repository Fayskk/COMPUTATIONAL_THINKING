import java.util.Scanner;
public class Teste {
	public static void main(String[] args) {
		// Vari�veis: nota1, nota2 e m�dia do aluno
		double nota1 = 0, nota2 = 0, media = 0;
		Scanner scn = new Scanner(System.in);
		System.out.println("Entre com a primeira e a segunda nota do aluno:");
		// entrada de dados
		nota1 = scn.nextDouble();
		nota2 = scn.nextDouble();
		// c�lculo da m�dia
		media = (nota1 + nota2)/2;
		System.out.println("A m�dia � : "+media);
		}
	
}

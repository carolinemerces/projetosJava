import java.util.*;
public class MaiorNumero {

	public static void main(String[] args) {
		
		// Fa�a um programa que receba tr�s inteiros e diga qual deles � o maior.
		
		int n1, n2, n3;
		Scanner ler = new Scanner(System.in);
		System.out.print("Digite o valor do primeiro n�mero: ");
		n1 = ler.nextInt();
		System.out.print("Digite o valor do segundo n�mero: ");
		n2 = ler.nextInt();
		System.out.print("Digite o valor do terceiro n�mero: ");
		n3 = ler.nextInt();
		
		if (n1>n2 && n1>n3) {
			System.out.printf("\nO maior n�mero � %d!", n1);
		}
		else if (n2>n1 && n2>n3) {
			System.out.printf("\nO maior n�mero � %d!", n2);
		}
		else if (n1==0 && n2==0 && n3==0) {
			System.out.printf("\nNenhum n�mero � maior!");
		}
		else {
			System.out.printf("\nO maior n�mero � %d!", n3);
		}
		
		ler.close();
	}

}

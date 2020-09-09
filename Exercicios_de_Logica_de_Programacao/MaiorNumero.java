import java.util.*;
public class MaiorNumero {

	public static void main(String[] args) {
		
		// Faça um programa que receba três inteiros e diga qual deles é o maior.
		
		int n1, n2, n3;
		Scanner ler = new Scanner(System.in);
		System.out.print("Digite o valor do primeiro número: ");
		n1 = ler.nextInt();
		System.out.print("Digite o valor do segundo número: ");
		n2 = ler.nextInt();
		System.out.print("Digite o valor do terceiro número: ");
		n3 = ler.nextInt();
		
		if (n1>n2 && n1>n3) {
			System.out.printf("\nO maior número é %d!", n1);
		}
		else if (n2>n1 && n2>n3) {
			System.out.printf("\nO maior número é %d!", n2);
		}
		else if (n1==0 && n2==0 && n3==0) {
			System.out.printf("\nNenhum número é maior!");
		}
		else {
			System.out.printf("\nO maior número é %d!", n3);
		}
		
		ler.close();
	}

}

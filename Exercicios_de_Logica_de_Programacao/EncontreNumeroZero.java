import java.util.Scanner;

public class EncontreNumeroZero {

	public static void main(String[] args) {
		// Crie um programa que leia um n�mero do teclado at� que encontre um n�mero igual a zero. No final, mostre a soma dos n�meros digitados.(DO...WHILE)
			
		int numero, soma=0;
		Scanner ler = new Scanner(System.in);
		
		
		do {
			System.out.print("Digite um n�mero: ");
			numero = ler.nextInt();
			soma = soma + numero;
		}
		while (numero!=0);
		System.out.printf("A soma dos n�mero � %d.", soma);
		
		ler.close();
	}

}

import java.util.Scanner;

public class EncontreNumeroZero {

	public static void main(String[] args) {
		// Crie um programa que leia um número do teclado até que encontre um número igual a zero. No final, mostre a soma dos números digitados.(DO...WHILE)
			
		int numero, soma=0;
		Scanner ler = new Scanner(System.in);
		
		
		do {
			System.out.print("Digite um número: ");
			numero = ler.nextInt();
			soma = soma + numero;
		}
		while (numero!=0);
		System.out.printf("A soma dos número é %d.", soma);
		
		ler.close();
	}

}

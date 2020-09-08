package PacoteJava;

import java.util.Scanner;

public class Soma {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		int a, b, soma;
		System.out.print("Digite o valor de A: ");
		a = ler.nextInt();
		System.out.print("Digite o valor de B: ");
		b = ler.nextInt();
		soma = (a+b);
		System.out.println("A soma dos valores é: " + soma + ".");
		
		ler.close();
	}

}

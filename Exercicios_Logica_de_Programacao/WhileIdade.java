package snippet;

import java.util.Scanner;

public class WhileIdade {

	public static void main(String[] args) {
		// Faça um programa que mostre a idade do usuário enquanto ela for maior que 1 e mostre a mensagem se ele é de maior 			ou não
		
		int idade;
		Scanner ler = new Scanner(System.in);
		System.out.println("Digite sua idade: ");
		idade = ler.nextInt();
		
		while (idade>=1 || idade<=0) {
			
			System.out.printf("\nSua idade %d", idade);
			
			if (idade<=0) {
				
				System.out.println("\nIdade inválida!\n \nDigite novamente sua idade: ");
				idade = ler.nextInt();
			}
			
			if (idade>=18 && idade!=0) {
				
				System.out.println("\nVocê é maior de idade!");
			}
			else {
				
				System.out.println("\nVocê é menor de idade!");
			}
			
			System.out.println("\nDigite sua idade: ");
			idade = ler.nextInt();
		}
		
		ler.close();
	}

}

package snippet;

import java.util.Scanner;

public class WhileIdade {

	public static void main(String[] args) {
		// Fa�a um programa que mostre a idade do usu�rio enquanto ela for maior que 1 e mostre a mensagem se ele � de maior 			ou n�o
		
		int idade;
		Scanner ler = new Scanner(System.in);
		System.out.println("Digite sua idade: ");
		idade = ler.nextInt();
		
		while (idade>=1 || idade<=0) {
			
			System.out.printf("\nSua idade %d", idade);
			
			if (idade<=0) {
				
				System.out.println("\nIdade inv�lida!\n \nDigite novamente sua idade: ");
				idade = ler.nextInt();
			}
			
			if (idade>=18 && idade!=0) {
				
				System.out.println("\nVoc� � maior de idade!");
			}
			else {
				
				System.out.println("\nVoc� � menor de idade!");
			}
			
			System.out.println("\nDigite sua idade: ");
			idade = ler.nextInt();
		}
		
		ler.close();
	}

}

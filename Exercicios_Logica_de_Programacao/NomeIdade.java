package PacoteJava;

import java.util.Scanner;

public class NomeIdade {

	public static void main(String[] args) {
		
		String nome;
		int idade;
		Scanner kb = new Scanner(System.in);
		System.out.print("Digite seu nome: ");
		nome = kb.next();
		System.out.print("Digite sua idade: ");
		idade = kb.nextInt();
		System.out.print("O nome do usuário é " + nome + " ");
		System.out.println("e sua idade é " + idade + " anos.");
		
		kb.close();

	}

}

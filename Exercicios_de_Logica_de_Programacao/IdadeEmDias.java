package PacoteJava;

import java.util.Scanner;

public class IdadeEmDias {

	public static void main(String[] args) {
		/* Faça um sistema que leia a idade de uma pessoa expressa em anos, meses e
		dias e mostre-a expressa apenas em dias.
		*/
		
		
		int anos, meses, dias, totalDias;
		Scanner ler = new Scanner(System.in);
		System.out.print("Digite sua idade em anos: ");
		anos = ler.nextInt();
		anos = (anos*365);
		System.out.println(anos);
		System.out.print("Digite sua idade em meses: ");
		meses = ler.nextInt();
		meses = (meses*30);
		System.out.println(meses);
		System.out.print("Digite sua idade em dias: ");
		dias = ler.nextInt();
		totalDias = (anos+meses+dias);
		System.out.println("Sua idade total em dias é: " + totalDias);
		
		
		ler.close();
		
		
	}

}

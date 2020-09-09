package PacoteJava;

import java.util.Scanner;

public class IdadeDiasMesesAnos {
	
	public static void main(String[] args) {
		
		/*Faça um sistema que leia a idade de uma pessoa expressa em dias e mostre-a
expressa em anos, meses e dias.
		 */
		
		int diasTotal, dias, meses, anos;
		Scanner ler = new Scanner(System.in);
		System.out.print("Digite sua idade total em dias: ");
		diasTotal = ler.nextInt();
		anos = (diasTotal/365);
		meses = ((diasTotal % 365)/30);
		//System.out.println(diasTotal % 365);
		dias = ((diasTotal % 365)%30);
		System.out.println("A sua idade é " + anos + " anos, " + meses + " meses e " + dias + " dias.");
		
		
		
		ler.close();
		
	}

}

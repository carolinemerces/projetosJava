import java.util.Scanner;

public class MediaMultiplos3 {

	public static void main(String[] args) {
		// Escrever um programa que receba vários números inteiros no teclado. E no final imprimir a média dos números múltiplos de 3. Para sair digitar 0(zero).(DO...WHILE)
			
		int numero;
		double media=0, soma=0, contador=0;
		Scanner ler = new Scanner(System.in);
		
		
		do {
			System.out.print("Digite um número: ");
			numero = ler.nextInt();
			
			if ((numero%3)==0 && numero!=0) {
				contador = contador+1;
				soma = soma + numero;
				media = (soma/contador);
			}
		//System.out.printf("A média dos múltiplos de 3 é %d.", contador);
		}
		while (numero!=0);
		System.out.printf("A média dos múltiplos de 3 é %.2f.", media);
		
		ler.close();
	}

}


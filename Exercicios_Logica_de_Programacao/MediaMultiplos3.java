import java.util.Scanner;

public class MediaMultiplos3 {

	public static void main(String[] args) {
		// Escrever um programa que receba v�rios n�meros inteiros no teclado. E no final imprimir a m�dia dos n�meros m�ltiplos de 3. Para sair digitar 0(zero).(DO...WHILE)
			
		int numero;
		double media=0, soma=0, contador=0;
		Scanner ler = new Scanner(System.in);
		
		
		do {
			System.out.print("Digite um n�mero: ");
			numero = ler.nextInt();
			
			if ((numero%3)==0 && numero!=0) {
				contador = contador+1;
				soma = soma + numero;
				media = (soma/contador);
			}
		//System.out.printf("A m�dia dos m�ltiplos de 3 � %d.", contador);
		}
		while (numero!=0);
		System.out.printf("A m�dia dos m�ltiplos de 3 � %.2f.", media);
		
		ler.close();
	}

}


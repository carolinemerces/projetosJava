import java.util.*;
public class ParImpar_RaizPotencia {

	public static void main(String[] args) {
		/* Faça um programa em que permita a entrada de um número qualquer e 
		 * exiba se este número é par ou ímpar. Se for par exiba também a raiz quadrada do mesmo;
		 *  se for ímpar exiba o número elevado ao quadrado.
		 */

		double numero, resto;
		Scanner ler = new Scanner(System.in);
		System.out.print("Digite um número: ");
		numero = ler.nextDouble();
		resto = (numero%2);
		
		
		if (resto==0) {
			System.out.printf("A raiz quadrada de %f é: %.2f", numero, Math.sqrt(numero));
		}
		else {
			System.out.printf("Esse número elevado ao quadrado é: %.2f", Math.pow(numero, 2) /*(numero*numero)*/);
		}
		
		ler.close();
		
	}

}

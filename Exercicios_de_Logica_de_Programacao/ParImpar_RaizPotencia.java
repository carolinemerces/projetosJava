import java.util.*;
public class ParImpar_RaizPotencia {

	public static void main(String[] args) {
		/* Fa�a um programa em que permita a entrada de um n�mero qualquer e 
		 * exiba se este n�mero � par ou �mpar. Se for par exiba tamb�m a raiz quadrada do mesmo;
		 *  se for �mpar exiba o n�mero elevado ao quadrado.
		 */

		double numero, resto;
		Scanner ler = new Scanner(System.in);
		System.out.print("Digite um n�mero: ");
		numero = ler.nextDouble();
		resto = (numero%2);
		
		
		if (resto==0) {
			System.out.printf("A raiz quadrada de %f �: %.2f", numero, Math.sqrt(numero));
		}
		else {
			System.out.printf("Esse n�mero elevado ao quadrado �: %.2f", Math.pow(numero, 2) /*(numero*numero)*/);
		}
		
		ler.close();
		
	}

}

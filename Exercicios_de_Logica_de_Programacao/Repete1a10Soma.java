package snippet;

public class Repete1a10Soma {

	public static void main(String[] args) {
		// Fa�a um programa que apresente a sequ�ncia de 1 a 10 e fa�a a soma total destes n�meros.
		
		int x, soma=0;
		
		for(x=1;x<=10;x++) {
			
			System.out.printf("\n %d", x);
			soma = soma + x;
		}
		System.out.printf("\nSoma total: %d", soma);
	}

}

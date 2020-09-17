package snippet;

public class Repete1a10Soma {

	public static void main(String[] args) {
		// Faça um programa que apresente a sequência de 1 a 10 e faça a soma total destes números.
		
		int x, soma=0;
		
		for(x=1;x<=10;x++) {
			
			System.out.printf("\n %d", x);
			soma = soma + x;
		}
		System.out.printf("\nSoma total: %d", soma);
	}

}

import java.util.Random;

public class Matriz3X3Maior10 {

	public static void main(String[] args) {
		// Leia uma matriz 3 x 3, conte e escreva quantos valores maiores que 10 ela possui.

		Random gerador = new Random ();
		final int LINHA=3, COLUNA=3;	
		int matriz[][] = new int [LINHA][COLUNA];
		int l, c, maior=0, valorDigitado;
		
		for (l=0;l<LINHA;l++) {
			System.out.printf(" | ");
			for (c=0;c<COLUNA;c++) {
				valorDigitado = gerador.nextInt(100)+1;
				matriz[l][c] = valorDigitado;
				
				System.out.print(matriz[l][c]);
				System.out.print(" | ");
				
				if (matriz[l][c]>10) {
					maior++;
				}
			}
			System.out.print("\n");
		}
		System.out.printf("Quantidade de valores maiores que 10: %d.", maior);
		
			
	}

}

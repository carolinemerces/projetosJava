import java.util.Random;
import java.util.Scanner;

public class DuasMatriz2X2MenuOpcao {

	public static void main(String[] args) {
		// Faça um programa que leia duas matrizes 2 x 2 com valores reais. Ofereça ao usuário um menu de opções:
		//(1) somar as duas matrizes 
		//(2) subtrair a primeira matriz da segunda 
		//(3) adicionar uma constante as duas matrizes
		//(4) imprimir as matrizes 
		// Nas duas primeiras opções uma terceira matriz 2 x 2 deve ser criada. 
		// Na terceira opção o valor da constante deve ser lido e o resultado da adição da constante deve ser armazenado na própria matriz.
		
		Random gerador = new Random ();
		Scanner ler = new Scanner(System.in);
		final int LINHA=2, COLUNA=2;	
		int matriz1[][] = new int [LINHA][COLUNA];
		int matriz2[][] = new int [LINHA][COLUNA];
		int matrizSoma[][] = new int [LINHA][COLUNA];
		int matrizSub[][] = new int [LINHA][COLUNA];
		int matriz1Const[][] = new int [LINHA][COLUNA];
		int matriz2Const[][] = new int [LINHA][COLUNA];
		int l, c, valorDigitado, constante, opcao;
		
		System.out.print("Escolha uma das opções no menu: ");
		opcao = ler.nextInt();
		
	
			for (l=0;l<LINHA;l++) {
				//System.out.printf(" | ");
				for (c=0;c<COLUNA;c++) {
					valorDigitado = gerador.nextInt(100)+1;
					matriz1[l][c] = valorDigitado;
				
					//System.out.print(matriz1[l][c]);
					//System.out.print(" | ");
				}
				//System.out.print("\n");
			}
			//System.out.print("\n");
				
			for (l=0;l<LINHA;l++) {
				//System.out.printf(" | ");
				for (c=0;c<COLUNA;c++) {
					valorDigitado = gerador.nextInt(100)+1;
					matriz2[l][c] = valorDigitado;
				
					//System.out.print(matriz2[l][c]);
					//System.out.print(" | ");
				}
				//System.out.print("\n");
			}
			
		
		if (opcao==1) {
			System.out.print("\nSoma das matrizes:\n");
			for (l=0;l<LINHA;l++) {
				//System.out.printf(" | ");
				for (c=0;c<COLUNA;c++) {
					matrizSoma[l][c]=matriz1[l][c]+matriz2[l][c];
					System.out.print(matrizSoma[l][c]);
					System.out.print(" | ");
					}
				System.out.print("\n");
			}
		}
		
		if (opcao==2) {
			System.out.print("\nSubtração da primeira matriz pela segunda:\n");
			for (l=0;l<LINHA;l++) {
				System.out.printf(" | ");
				for (c=0;c<COLUNA;c++) {
					matrizSub[l][c]=matriz1[l][c]-matriz2[l][c];
					System.out.print(matrizSub[l][c]);
					System.out.print(" | ");
				}
				System.out.print("\n");
			}
		}
		
		if (opcao==3) {
			constante = gerador.nextInt(100);
			System.out.printf("\nPrimeira matriz com a adição da constante %d", constante, ":");
			System.out.print("\n");
			for (l=0;l<LINHA;l++) {
				System.out.printf(" | ");
				for (c=0;c<COLUNA;c++) {
					matriz1Const[l][c] = matriz1[l][c] + constante;				
					System.out.print(matriz1Const[l][c]);
					System.out.print(" | ");
				}
				System.out.print("\n");
			}
		
			System.out.print("\n");
			
			System.out.printf("\nSegunda matriz com a adição da constante %d", constante, ":");
			System.out.print("\n");
			for (l=0;l<LINHA;l++) {
				System.out.printf(" | ");
				for (c=0;c<COLUNA;c++) {
					matriz2Const[l][c] = matriz2[l][c] + constante;				
					System.out.print(matriz2Const[l][c]);
					System.out.print(" | ");
				}
				System.out.print("\n");
			}
		}
		
	if (opcao==4) {
		System.out.printf("\nPrimeira matriz:");
		System.out.print("\n");
		for (l=0;l<LINHA;l++) {
			System.out.printf(" | ");
			for (c=0;c<COLUNA;c++) {
				valorDigitado = gerador.nextInt(100)+1;
				matriz1[l][c] = valorDigitado;
			
				System.out.print(matriz1[l][c]);
				System.out.print(" | ");
			}
			System.out.print("\n");
		}
		System.out.print("\n");
			
		System.out.printf("Segunda matriz:");
		System.out.print("\n");
		for (l=0;l<LINHA;l++) {
			System.out.printf(" | ");
			for (c=0;c<COLUNA;c++) {
				valorDigitado = gerador.nextInt(100)+1;
				matriz2[l][c] = valorDigitado;
			
				System.out.print(matriz2[l][c]);
				System.out.print(" | ");
			}
			System.out.print("\n");
		}
		
	
	
		System.out.print("\nSoma das matrizes:\n");
		for (l=0;l<LINHA;l++) {
			//System.out.printf(" | ");
			for (c=0;c<COLUNA;c++) {
				matrizSoma[l][c]=matriz1[l][c]+matriz2[l][c];
				System.out.print(matrizSoma[l][c]);
				System.out.print(" | ");
				}
			System.out.print("\n");
		}
	
	
	
		System.out.print("\nSubtração da primeira matriz pela segunda:\n");
		for (l=0;l<LINHA;l++) {
			System.out.printf(" | ");
			for (c=0;c<COLUNA;c++) {
				matrizSub[l][c]=matriz1[l][c]-matriz2[l][c];
				System.out.print(matrizSub[l][c]);
				System.out.print(" | ");
			}
			System.out.print("\n");
		}
	
	
	
		constante = gerador.nextInt(100);
		System.out.printf("\nPrimeira matriz com a adição da constante %d", constante, ":");
		System.out.print("\n");
		for (l=0;l<LINHA;l++) {
			System.out.printf(" | ");
			for (c=0;c<COLUNA;c++) {
				matriz1Const[l][c] = matriz1[l][c] + constante;				
				System.out.print(matriz1Const[l][c]);
				System.out.print(" | ");
			}
			System.out.print("\n");
		}
	
		System.out.print("\n");
		
		System.out.printf("\nSegunda matriz com a adição da constante %d", constante, ":");
		System.out.print("\n");
		for (l=0;l<LINHA;l++) {
			System.out.printf(" | ");
			for (c=0;c<COLUNA;c++) {
				matriz2Const[l][c] = matriz2[l][c] + constante;				
				System.out.print(matriz2Const[l][c]);
				System.out.print(" | ");
			}
			System.out.print("\n");
		}
	}
		
		
		//System.out.printf((opcao==1)? "\nSoma das matrizes:\n" + matrizSoma[l][c] + " | " + "\n" : (opcao==2)? "\nSubtração da primeira matriz pela segunda:\n" + matrizSub[l][c] + " | " + "\n" : (opcao==3)? ("\nPrimeira matriz com a adição da constante %d")+ ":" + "\n" + " | " + matriz1Const[l][c] + " | " + "\n" + "\n" + "Segunda matriz com a adição da constante %d"+ ":" + "\n" + " | " + matriz2Const[l][c] + " | " : "\nSoma das matrizes:\n" + matrizSoma[l][c] + " | " + "\n" + "\nSubtração da primeira matriz pela segunda:\n" + matrizSub[l][c] + " | " + "\n" + ("\nPrimeira matriz com a adição da constante %d")+ ":" + "\n" + " | " + matriz1Const[l][c] + " | " + "\n" + "\n" + ("Segunda matriz com a adição da constante")+ ":" + "\n" + " | " + matriz2Const[l][c] + " | ");
		
		ler.close();
	}

}

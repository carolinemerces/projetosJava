import java.util.Random;

public class Vetor6NumerosParesImpar {

	public static void main(String[] args) {
		// 2- Faça um programa que receba 6 números inteiros e mostre: 
		//• Os números pares digitados;  
		//• A soma dos números pares digitados; 
		//• Os números ímpares digitados; 
		//• A quantidade de números ímpares digitados.
		
		int[] vetor= new int[5];
		int i, somaPar=0, contaImpar=0, contaPar=0;
		Random gerador = new Random ();
		
		 
		for (i=0; i<5; i++) {
		vetor[i]= gerador.nextInt(100);
		System.out.printf("%d ", vetor[i]);
			if ((vetor[i]%2)==0) {
				contaPar++;
			}
			if ((vetor[i]%2)!=0) {
				contaImpar++;
				
			}
			System.out.printf("\n");
		}
		System.out.printf("\n");
		String tpar=(( contaPar ==0)?"Nenhum número par.":(contaPar==1)?"O número par é: ":"Os números pares são: ");
		System.out.printf(tpar);
		for (i=0; i<vetor.length; i++) {
			if ((vetor[i]%2)==0) {
				somaPar=somaPar+vetor[i];
				System.out.printf("%d ", vetor[i]);
			}
			
		}
		
		System.out.printf("\nA soma de números pares é: ");
		System.out.printf("%d \n", somaPar);
			
		String tImpar=(( contaImpar ==0)?"\nNenhum número ímpar.":(contaImpar==1)?"\nO número ímpar é: ":"\nOs números ímpares são: ");
		System.out.printf(tImpar);
		for (i=0; i<5; i++) {
			if ((vetor[i]%2)!=0) {
		System.out.printf("%d ", vetor[i]);
			}
		}
		
		System.out.printf("\nQuantidade de números ímpares: ");
		System.out.printf("%d ", contaImpar);
		
	}
}
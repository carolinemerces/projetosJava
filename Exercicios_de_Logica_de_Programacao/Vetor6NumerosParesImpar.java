import java.util.Random;

public class Vetor6NumerosParesImpar {

	public static void main(String[] args) {
		// 2- Fa�a um programa que receba 6 n�meros inteiros e mostre: 
		//� Os n�meros pares digitados;  
		//� A soma dos n�meros pares digitados; 
		//� Os n�meros �mpares digitados; 
		//� A quantidade de n�meros �mpares digitados.
		
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
		String tpar=(( contaPar ==0)?"Nenhum n�mero par.":(contaPar==1)?"O n�mero par �: ":"Os n�meros pares s�o: ");
		System.out.printf(tpar);
		for (i=0; i<vetor.length; i++) {
			if ((vetor[i]%2)==0) {
				somaPar=somaPar+vetor[i];
				System.out.printf("%d ", vetor[i]);
			}
			
		}
		
		System.out.printf("\nA soma de n�meros pares �: ");
		System.out.printf("%d \n", somaPar);
			
		String tImpar=(( contaImpar ==0)?"\nNenhum n�mero �mpar.":(contaImpar==1)?"\nO n�mero �mpar �: ":"\nOs n�meros �mpares s�o: ");
		System.out.printf(tImpar);
		for (i=0; i<5; i++) {
			if ((vetor[i]%2)!=0) {
		System.out.printf("%d ", vetor[i]);
			}
		}
		
		System.out.printf("\nQuantidade de n�meros �mpares: ");
		System.out.printf("%d ", contaImpar);
		
	}
}
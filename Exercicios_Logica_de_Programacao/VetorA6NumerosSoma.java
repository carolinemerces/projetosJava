
public class VetorA6NumerosSoma {

	public static void main(String[] args) {
		// 1- Fa�a um programa que possua um vetor denominado A que armazene 6 n�meros inteiros. O programa deve executar os seguintes passos: 
		//(a) Atribua os seguintes valores a esse vetor: 1, 0, 5, -2, -5, 7. 
		//(b) Armazene em uma vari�vel inteira (simples) a soma entre os valores das posi��es A[0], A[1] e A[5] do vetor e mostre na tela esta soma. 
		//(c) Modifique o vetor na posi��o 4, atribuindo a esta posi��o o valor 100. 
		//(d) Mostre na tela cada valor do vetor A, um em cada linha.
			
		int[] vetorA= {1, 0, 5, -2, -5, 7};
		int soma, aux;
		
		soma=vetorA[0]+vetorA[1]+vetorA[5];
		System.out.printf("A soma dos valores nas posi��es A[1], A[2] e A[6] � %d.", soma);
		
		aux= 100;
		System.out.printf("\nO valor na posi��o A[5] era %d e agora � %d.", vetorA[4],aux);
		
		vetorA[4]=aux;
		System.out.printf("\nLista dos valores: \nA[1]: %d \nA[2]: %d \nA[3]: %d \nA[4]: %d \nA[5]: %d \nA[6]: %d.", vetorA[0], vetorA[1], vetorA[2], vetorA[3], vetorA[4], vetorA[5]);

	}

}

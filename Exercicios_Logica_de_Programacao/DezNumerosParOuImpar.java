
public class DezNumerosParOuImpar {

	public static void main(String[] args) {
		// Ler 10 n�meros e imprimir quantos s�o pares e quantos s�o �mpares. (FOR)

		int numero, par=0, impar=0;
		
		for(numero=1;numero<=10;numero++) {
			if((numero%2) == 0) {
				par = par + 1;
			}
			else {
				impar = impar + 1;
			}
		}
		System.out.printf("Existem %d n�meros pares", par);
		System.out.printf(" e %d n�meros �mpares.", impar);
	}

}

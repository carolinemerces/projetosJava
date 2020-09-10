
public class DezNumerosParOuImpar {

	public static void main(String[] args) {
		// Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR)

		int numero, par=0, impar=0;
		
		for(numero=1;numero<=10;numero++) {
			if((numero%2) == 0) {
				par = par + 1;
			}
			else {
				impar = impar + 1;
			}
		}
		System.out.printf("Existem %d números pares", par);
		System.out.printf(" e %d números ímpares.", impar);
	}

}


public class N1000A1999DivisaoPor11Resto5 {

	public static void main(String[] args) {
		// Informar todos os números de 1000 a 1999 que quando divididos por 11 obtemos resto = 5. (FOR)

		int numero, resto;
		
		for (numero=1000;numero<=1999;numero++) {
			
			resto = (numero%11);
			
			if (resto == 5) {
				System.out.printf("\n %d", numero);
			}
		}
	}

}

import java.util.*;
public class CustoCarro {

	public static void main(String[] args) {

		/*
		 * O custo ao consumidor de um carro novo � a soma do custo de f�brica com a
	percentagem do distribuidor e dos impostos (aplicados ao custo de f�brica).
	Supondo que a percentagem do distribuidor seja de 28% e os impostos de 45%,
	escrever um sistema que leia o custo de f�brica de um carro e escreva o custo ao
	consumidor.
		 */
		
		double custof, perc= 0.28, imp=0.45, custoc;
		Scanner ler = new Scanner(System.in);
		System.out.print("Digite o custo do carro de f�brica: ");
		custof = ler.nextDouble();
		
		custoc = (custof+(custof*(perc+imp)));
		
		System.out.printf("\nO custo do carro de f�brica ao consumidor � de R$%.2f: ",custoc);
		
		ler.close();
	}

}

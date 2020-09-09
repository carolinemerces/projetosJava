import java.util.*;
public class CustoCarro {

	public static void main(String[] args) {

		/*
		 * O custo ao consumidor de um carro novo é a soma do custo de fábrica com a
	percentagem do distribuidor e dos impostos (aplicados ao custo de fábrica).
	Supondo que a percentagem do distribuidor seja de 28% e os impostos de 45%,
	escrever um sistema que leia o custo de fábrica de um carro e escreva o custo ao
	consumidor.
		 */
		
		double custof, perc= 0.28, imp=0.45, custoc;
		Scanner ler = new Scanner(System.in);
		System.out.print("Digite o custo do carro de fábrica: ");
		custof = ler.nextDouble();
		
		custoc = (custof+(custof*(perc+imp)));
		
		System.out.printf("\nO custo do carro de fábrica ao consumidor é de R$%.2f: ",custoc);
		
		ler.close();
	}

}

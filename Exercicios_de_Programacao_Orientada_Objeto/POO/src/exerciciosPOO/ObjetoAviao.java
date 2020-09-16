package exerciciosPOO;

import java.util.Scanner;

public class ObjetoAviao {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		
		Aviao aviao1 = new Aviao();
		
		System.out.print("Digite o nome do avião: ");
		aviao1.nomeAviao  = ler.next();
		
		System.out.print("Digite o número identificador: ");
		aviao1.numeroIdentificadorAviao = ler.nextInt();
		
		System.out.print("Digite a capacidade: ");
		aviao1.capacidadeAviao = ler.nextInt();
		
		
		aviao1.mostraNomeAviao();
		aviao1.mostraNumeroIdentificadorAviao();
		aviao1.mostraCapacidadeAviao();
	
		
		ler.close();

	}

}

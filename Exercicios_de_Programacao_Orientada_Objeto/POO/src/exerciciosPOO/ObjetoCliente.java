package exerciciosPOO;

import java.util.Scanner;

public class ObjetoCliente {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		
		Cliente cliente1 = new Cliente("Caroline", "das Mercês"); //novo objeto
		System.out.println(cliente1.getNomeCompleto());
		
		System.out.print("Digite o CPF sem o dígito: ");
		cliente1.cpfCliente = ler.nextInt();
		
		System.out.printf("Digite o ano de nascimento: ");
		cliente1.anoNascimentoCliente = ler.nextInt();
		System.out.printf("Digite o gênero: ");
		cliente1.generoCliente = ler.next().toUpperCase().charAt(0);
		
		cliente1.mostracpfCliente();
		cliente1.mostraIdadeCliente();
		cliente1.mostrageneroCliente();
			
		
		ler.close();

	}

}

package aplicacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entidades.Funcionario;
import entidades.Terceiros;

public class Principal {

	public static void main(String[] args) {
		
		/*Funcionario exemploF = new Funcionario("João", 40, 50);
		
		System.out.printf("O funcionário %s receberá R$ %.2f de salário.", exemploF.getNome(), exemploF.pagamento());
		
		Terceiros exemploT = new Terceiros("Julia",50,100,20);
		System.out.printf("\nA funcionária terceirizada %s receberá R$ %.2f de salário.", exemploT.getNome(), exemploT.pagamento());*/
		
		Scanner ler  = new Scanner(System.in);
		List<Funcionario> list = new ArrayList<>();
		
		System.out.println("          CADASTRO FUNCIONÁRIOS");
		System.out.println("------------------------------------------");
		
		System.out.println("Digite o número de funcionários: ");
		int n = ler.nextInt();
		
		double valor=50;
		
		for (int i=1;i<=n;i++) {
			System.out.print("\nNome do funcionário "+i+": ");
			String nome = ler.next();
			System.out.print("\nTerceiro (S - Sim | N - Não): ");
			char ch = ler.next().toUpperCase().charAt(0);
			System.out.print("\nDigite as horas trabalhadas: ");
			int hora = ler.nextInt();
			//System.out.print("\nDigite o valor por hora: ");
			//double valor = ler.nextDouble();
			
			if (ch=='S') {
				System.out.print("\nDigite as horas extras trabalhadas: ");
				int valorExtra = ler.nextInt();
				list.add(new Terceiros(nome, hora, valor, valorExtra));
			}
			else {
				list.add(new Funcionario(nome, hora, valor));
			}
		}
			System.out.println("\n                PAGAMENTO");
			System.out.println("------------------------------------------");
			
			for (Funcionario func : list) {
			System.out.printf("\n%s R$ %.2f",func.getNome(),func.pagamento());
			}
	
	}
}

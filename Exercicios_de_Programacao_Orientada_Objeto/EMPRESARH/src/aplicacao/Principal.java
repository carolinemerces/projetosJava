package aplicacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entidades.Funcionario;
import entidades.Terceiros;

public class Principal {

	public static void main(String[] args) {
		
		/*Funcionario exemploF = new Funcionario("Jo�o", 40, 50);
		
		System.out.printf("O funcion�rio %s receber� R$ %.2f de sal�rio.", exemploF.getNome(), exemploF.pagamento());
		
		Terceiros exemploT = new Terceiros("Julia",50,100,20);
		System.out.printf("\nA funcion�ria terceirizada %s receber� R$ %.2f de sal�rio.", exemploT.getNome(), exemploT.pagamento());*/
		
		Scanner ler  = new Scanner(System.in);
		List<Funcionario> list = new ArrayList<>();
		
		System.out.println("          CADASTRO FUNCION�RIOS");
		System.out.println("------------------------------------------");
		
		System.out.println("Digite o n�mero de funcion�rios: ");
		int n = ler.nextInt();
		
		double valor=50;
		
		for (int i=1;i<=n;i++) {
			System.out.print("\nNome do funcion�rio "+i+": ");
			String nome = ler.next();
			System.out.print("\nTerceiro (S - Sim | N - N�o): ");
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

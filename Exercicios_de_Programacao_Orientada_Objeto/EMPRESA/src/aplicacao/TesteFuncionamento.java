package aplicacao;

import java.util.Scanner;

import entidades.Administrador;
import entidades.Empregado;
import entidades.Fornecedor;
import entidades.Operario;
import entidades.Vendedor;

public class TesteFuncionamento {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		int opcao;
		System.out.println("Escolha uma das op��es: \n1 - Para saber o saldo do Fornecedor \n2 - Para saber o sal�rio do Funcion�rio  \n3 - Administrador \n4 - Oper�rio \n5 - Vendedor ");
		opcao = ler.nextInt();
		
		if(opcao == 1) {
		Fornecedor saldoFornecedor = new Fornecedor("LL Softwares", "Rua Augusta, 168 - Paulista", "(11) 23254543", 4500, 8000);
		
		System.out.printf("\nFornecedor: %s",saldoFornecedor.getNome());
		System.out.printf("\nEndere�o: %s",saldoFornecedor.getEndereco());
		System.out.printf("\nContato: %s",saldoFornecedor.getTelefone());
		//System.out.println(saldoFornecedor.getValorCreditado);
		
		System.out.printf("\nCr�dito m�ximo atribu�do ao fornecedor = %d", saldoFornecedor.getValorCredito());
		System.out.printf("\nMontante da d�vida para com o fornecedor = %d",saldoFornecedor.getValorDivida());
		
		System.out.printf("\nSaldo = %d",saldoFornecedor.obterSaldo());
		}
		
		else if(opcao==2) {
			
		Empregado salarioEmpregado = new Empregado("Laura Joff", 'F', 1986, "Parda", "Rua Lua Minguante, 2 - Vila Lunar", "(11) 963258414", 333, 5800, 0.35);
		
		System.out.printf("\nEmpregado: %s",salarioEmpregado.getNome());
		System.out.printf("\nG�nero: %c",salarioEmpregado.getSexo());
		System.out.printf("\nIdade: %d anos",salarioEmpregado.idade());
		System.out.printf("\nCor/Ra�a: %s",salarioEmpregado.getEtnia());
		System.out.printf("\nEndere�o: %s",salarioEmpregado.getEndereco());
		System.out.printf("\nContato: %s",salarioEmpregado.getTelefone());
		
		System.out.printf("\nVencimento base R$: %.2f",salarioEmpregado.getSalarioBase());
		System.out.print("\nPorcentagem retida do vencimento base do empregado 35%");
		System.out.printf("\nSal�rio R$: %.2f",salarioEmpregado.calcularSalario());
	}
		
		else if(opcao==3) {
			
			Administrador salarioAdministrador = new Administrador("Nando Costa", 2000, 7800);
			System.out.printf("\nAdministrador: %s",salarioAdministrador.getNome());
			
			System.out.printf("\nVencimento base R$: %.2f",salarioAdministrador.getSalarioBase());
			System.out.printf("\nAjuda de custo R$: %.2f",salarioAdministrador.getAjudaDeCusto());
			System.out.printf("\nSal�rio R$: %.2f",salarioAdministrador.calcularSalario());
		}
		
		else if (opcao==4) {
			
			Operario salarioOperario = new Operario("La�s Voxx", 3000, 0.50);
			System.out.printf("\nOper�rio: %s",salarioOperario.getNome());
			
			System.out.printf("\nValor monet�rio dos artigos efetivamente produzidos pelo oper�rio R$: %.2f",salarioOperario.getValorProducao());
			System.out.print("\nPorcentagem do valor de Produ��o que ser� adicionado ao vencimento base do oper�rio 50%");
			System.out.printf("\nSal�rio R$: %.2f",salarioOperario.calcularSalario());
				
		}
		
		else if(opcao==5) {
			
			Vendedor salarioVendedor = new Vendedor("Valdir Pereira", 4000, 0.40);
			
			System.out.printf("\nOper�rio: %s",salarioVendedor.getNome());
			
			System.out.printf("\nValor monet�rio dos artigos efetivamente produzidos pelo oper�rio R$: %.2f",salarioVendedor.getValorVendas());
			System.out.print("\nPorcentagem do valor das Vendas que ser� adicionado ao vencimento base do vendedor 40%");
			System.out.printf("\nSal�rio R$: %.2f",salarioVendedor.calcularSalario());
			
		}
		
		ler.close();
	}
	
	
}

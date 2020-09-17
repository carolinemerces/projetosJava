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
		System.out.println("Escolha uma das opções: \n1 - Para saber o saldo do Fornecedor \n2 - Para saber o salário do Funcionário  \n3 - Administrador \n4 - Operário \n5 - Vendedor ");
		opcao = ler.nextInt();
		
		if(opcao == 1) {
		Fornecedor saldoFornecedor = new Fornecedor("LL Softwares", "Rua Augusta, 168 - Paulista", "(11) 23254543", 4500, 8000);
		
		System.out.printf("\nFornecedor: %s",saldoFornecedor.getNome());
		System.out.printf("\nEndereço: %s",saldoFornecedor.getEndereco());
		System.out.printf("\nContato: %s",saldoFornecedor.getTelefone());
		//System.out.println(saldoFornecedor.getValorCreditado);
		
		System.out.printf("\nCrédito máximo atribuído ao fornecedor = %d", saldoFornecedor.getValorCredito());
		System.out.printf("\nMontante da dívida para com o fornecedor = %d",saldoFornecedor.getValorDivida());
		
		System.out.printf("\nSaldo = %d",saldoFornecedor.obterSaldo());
		}
		
		else if(opcao==2) {
			
		Empregado salarioEmpregado = new Empregado("Laura Joff", 'F', 1986, "Parda", "Rua Lua Minguante, 2 - Vila Lunar", "(11) 963258414", 333, 5800, 0.35);
		
		System.out.printf("\nEmpregado: %s",salarioEmpregado.getNome());
		System.out.printf("\nGênero: %c",salarioEmpregado.getSexo());
		System.out.printf("\nIdade: %d anos",salarioEmpregado.idade());
		System.out.printf("\nCor/Raça: %s",salarioEmpregado.getEtnia());
		System.out.printf("\nEndereço: %s",salarioEmpregado.getEndereco());
		System.out.printf("\nContato: %s",salarioEmpregado.getTelefone());
		
		System.out.printf("\nVencimento base R$: %.2f",salarioEmpregado.getSalarioBase());
		System.out.print("\nPorcentagem retida do vencimento base do empregado 35%");
		System.out.printf("\nSalário R$: %.2f",salarioEmpregado.calcularSalario());
	}
		
		else if(opcao==3) {
			
			Administrador salarioAdministrador = new Administrador("Nando Costa", 2000, 7800);
			System.out.printf("\nAdministrador: %s",salarioAdministrador.getNome());
			
			System.out.printf("\nVencimento base R$: %.2f",salarioAdministrador.getSalarioBase());
			System.out.printf("\nAjuda de custo R$: %.2f",salarioAdministrador.getAjudaDeCusto());
			System.out.printf("\nSalário R$: %.2f",salarioAdministrador.calcularSalario());
		}
		
		else if (opcao==4) {
			
			Operario salarioOperario = new Operario("Laís Voxx", 3000, 0.50);
			System.out.printf("\nOperário: %s",salarioOperario.getNome());
			
			System.out.printf("\nValor monetário dos artigos efetivamente produzidos pelo operário R$: %.2f",salarioOperario.getValorProducao());
			System.out.print("\nPorcentagem do valor de Produção que será adicionado ao vencimento base do operário 50%");
			System.out.printf("\nSalário R$: %.2f",salarioOperario.calcularSalario());
				
		}
		
		else if(opcao==5) {
			
			Vendedor salarioVendedor = new Vendedor("Valdir Pereira", 4000, 0.40);
			
			System.out.printf("\nOperário: %s",salarioVendedor.getNome());
			
			System.out.printf("\nValor monetário dos artigos efetivamente produzidos pelo operário R$: %.2f",salarioVendedor.getValorVendas());
			System.out.print("\nPorcentagem do valor das Vendas que será adicionado ao vencimento base do vendedor 40%");
			System.out.printf("\nSalário R$: %.2f",salarioVendedor.calcularSalario());
			
		}
		
		ler.close();
	}
	
	
}

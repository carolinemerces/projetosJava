package entidades;

import java.util.List;

public abstract class ContaBancaria {
	private int numeroDaConta;
	private double saldo;
	private List<Integer> transacoes;
	
	
	public ContaBancaria() {
		super();
	}

	public ContaBancaria(int numeroDaConta, double saldo, List<Integer> transacoes) {
		super();
		this.numeroDaConta = numeroDaConta;
		this.saldo = saldo;
		this.transacoes = transacoes;
	}

	
	
	public int getNumeroDaConta() {
		return numeroDaConta;
	}



	public void setNumeroDaConta(int numeroDaConta) {
		this.numeroDaConta = numeroDaConta;
	}



	public double getSaldo() {
		return saldo;
	}


	public List<Integer> getTransacoes() {
		return transacoes;
	}



	public void setTransacoes(List<Integer> transacoes) {

		this.transacoes = transacoes;
	}



	public void emiteExtrato() {
		System.out.printf("\nSaldo: R$ %.2f" , this.saldo);
	}
	
	public void credite(double valorCreditado) {
		
		this.saldo += valorCreditado;
		System.out.println("Valor creditado!");

	}
	
	public void debite(double valorDebitado) {
		if(this.saldo > valorDebitado) {
		this.saldo -= valorDebitado;
		System.out.println("Valor debitado!");
		} else {
		System.out.println("Saldo insuficiente!");	
		}
	}
	
	public void menu() {
		System.out.println("ESCOLHA UMA OPERA��O");
  	  System.out.println("1 - SAQUE");
  	  System.out.println("2 - DEP�SITO");
  	  System.out.println("3 - EXTRATO");
	}
	
}

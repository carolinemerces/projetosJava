package entidades;

import java.util.List;

public class ContaEmpresa extends ContaBancaria{
	
	private double limiteEmpresa = 5000;
	
	
	
	public ContaEmpresa() {
		super();
		// TODO Auto-generated constructor stub
	}



	public ContaEmpresa(int numeroDaConta, double saldo, List<Integer> transacoes) {
		super(numeroDaConta, saldo, transacoes);
		// TODO Auto-generated constructor stub
	}

	

	public ContaEmpresa(double limiteEmpresa) {
		super();
		this.limiteEmpresa = limiteEmpresa;
	}


	
	public double getLimiteEmpresa() {
		return limiteEmpresa;
	}



	public void setLimiteEmpresa(double limiteEmpresa) {
		this.limiteEmpresa = limiteEmpresa;
	}



	private void emprestimoEmpresarial(double limiteEmpresa) {
		
		if(getSaldo()< this.limiteEmpresa/2) {
			System.out.println("Saldo insunficiente para empréstimo!");
		} else {
			System.out.printf("\nSeu limite é de: R$ %f", getSaldo()*2);
		
		}

	}
}
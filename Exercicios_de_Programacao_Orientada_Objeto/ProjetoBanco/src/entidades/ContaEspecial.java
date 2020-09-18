package entidades;

import java.util.List;

public class ContaEspecial extends ContaCorrente{
	
	private double limite = 500;

	public ContaEspecial() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ContaEspecial(int numeroDaConta, double saldo, List<Integer> transacoes) {
		super(numeroDaConta, saldo, transacoes);
		// TODO Auto-generated constructor stub
	}

	public ContaEspecial(double limite) {
		super();
		this.limite = limite;
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}
	
	public double calculaJuros() {
		if( getSaldo() == 0) {
			credite(limite);
			
			
		}
		
		
		return 0;
	}

	@Override
	public void menu() {
		// TODO Auto-generated method stub
		super.menu();
		
		System.out.println("4 - Cheque Especial ");
	}
	
	

}

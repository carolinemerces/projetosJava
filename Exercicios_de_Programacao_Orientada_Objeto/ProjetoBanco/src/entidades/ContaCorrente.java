package entidades;

import java.util.List;

public class ContaCorrente extends ContaBancaria {
	
	private int talonario = 10;
	
	

	public ContaCorrente() {
		super();
		// TODO Auto-generated constructor stub
	}



	public ContaCorrente(int numeroDaConta, double saldo, List<Integer> transacoes) {
		super(numeroDaConta, saldo, transacoes);
		// TODO Auto-generated constructor stub
	}


	public void emiteTalonario() {
		
		if(this.talonario > 0) {
		
		this.talonario--;
		
		System.out.println("Tal�o emitido:");
		} else {
			System.out.println("Sem tal�es!");
		}
		
	}



	@Override
	public void menu() {
		// TODO Auto-generated method stub
		super.menu();
	}
	
	
	

}

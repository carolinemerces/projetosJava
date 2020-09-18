package entidades;

public class Terceiros extends Funcionario{

	private double horasAdicionais;

	public Terceiros(String nome, int horasTrabalhadas, double valorPorHora, double horasAdicionais) {
		super(nome, horasTrabalhadas, valorPorHora);
		this.horasAdicionais = horasAdicionais;
	}

	public double getHorasAdicionais() {
		return horasAdicionais;
	}

	public void setHorasAdicionais(double horasAdicionais) {
		this.horasAdicionais = horasAdicionais;
	}
	
	@Override//metodo com over ride - mudança apenas para a situação 
	public double pagamento() {
		return super.pagamento() + (this.horasAdicionais*super.getValorPorHora());
		//return ((getHorasTrabalhadas()*getValorPorHora()) + (((getValorPorHora())*horasAdicionais)));
		
	}
	
}

package entidades;

public class Administrador extends Pessoa {
	
	private double ajudaDeCusto;
	private double salarioBase;

	public Administrador(String nome, double ajudaDeCusto, double salarioBase) {
		super(nome);
		this.ajudaDeCusto = ajudaDeCusto;
		this.salarioBase = salarioBase;
	}

	public double getAjudaDeCusto() {
		return ajudaDeCusto;
	}

	public void setAjudaDeCusto(double ajudaDeCusto) {
		this.ajudaDeCusto = ajudaDeCusto;
	}

	public double getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}
	
	public double calcularSalario() {
		return (salarioBase + ajudaDeCusto);
	}
	

}

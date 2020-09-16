package teste;

public class Carro {
	
	//criando atributos
	String cor;
	String modelo;
	double velocidadeAtual;
	double velocidadeMaxima;
	
	//criando metodos void  - apenas indica a mensagem, n�o retorna conte�do
	void liga() {
		System.out.println("O carro est� ligado...");
	}
	//passando o parametro
	void acelera(double quantidade) {
		double velocidadeNova = (this.velocidadeAtual + quantidade);
		this.velocidadeAtual = velocidadeNova;
	}
	//metodo par retornar um valor
	int pegaMarcha() {
		if(this.velocidadeAtual<0) {
			return -1;
		}
		if(this.velocidadeAtual>=0 && this.velocidadeAtual<40) {
			return 1;
		}
		if(this.velocidadeAtual>=40 && this.velocidadeAtual<80) {
			return 2;
		}
		return 3;
	}	
}

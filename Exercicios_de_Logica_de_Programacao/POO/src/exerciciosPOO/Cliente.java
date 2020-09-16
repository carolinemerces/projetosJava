package exerciciosPOO;

public class Cliente {
	//1) Crie uma classe cliente e apresente os atributos e métodos referentes esta classe, em seguida crie um objeto cliente, defina as instancias deste objeto e apresente as informações deste objeto no console.
	
	//atributos
	public String nomeCliente;
	public String sobrenomeCliente;
	public int cpfCliente;
	public int anoNascimentoCliente;
	public char generoCliente;
	
	
	//construtor
	public Cliente (String primeiro, String ultimo){	//passando como argumento para os atributos
		nomeCliente = primeiro; //atribundo parametro para cada atributo
		sobrenomeCliente = ultimo;
		}
	
	//metodo com retorn
	public String getNomeCompleto() {
		String nomeCompletoCliente = nomeCliente +" "+ sobrenomeCliente;
		return nomeCompletoCliente;
	}
	
	//metodo void
	public void mostraIdadeCliente() {
		if(generoCliente == 'M') {
			System.out.printf("\nA idade do cliente é %d anos", 2020 - anoNascimentoCliente);
		}
		else if(generoCliente == 'F') {
			System.out.printf("\nA idade da cliente é %d anos", 2020 - anoNascimentoCliente);
		}
	}
	
	public void mostracpfCliente() {
		if(generoCliente == 'M') {
			System.out.printf("\nO CPF do cliente é %d", cpfCliente);
		}
		else if(generoCliente == 'F') {
			System.out.printf("\nO CPF da cliente é %d", cpfCliente);
		}
		
	}
	
	public void mostrageneroCliente() {
		if(this.generoCliente == 'M') {
			System.out.printf("\nO cliente é do gênero Masculino");
		}
		else if(this.generoCliente == 'F') {
			System.out.printf("\nA cliente é do gênero Feminino");
		}
		
	}
	
}

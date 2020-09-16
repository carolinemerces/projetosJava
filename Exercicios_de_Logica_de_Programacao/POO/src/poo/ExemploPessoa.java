package poo;

public class ExemploPessoa {
	
	private String primeiroNome;
	private String ultimoNome;
	private String nomesDoMeio;
	
	//construtor - executa o procedimento - deve ter o mesmo nome da classe
	
	public ExemploPessoa (String primeiro, String meio, String ultimo){	//passando como argumento para os atributos
	
	primeiroNome = primeiro; //atribundo parametro para cada atributo
	ultimoNome = ultimo;
	nomesDoMeio = meio;
	}
	
	//metodo que retorna o nome completo
	public String getNomeCompleto() {
		String nomeCompleto = primeiroNome +" "+ nomesDoMeio +" "+ ultimoNome;
		return nomeCompleto;
	}
	
	
}

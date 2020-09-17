package entidades;
public class Pessoa {
		
		private String nome;
		private char sexo;
		private int anoNasc;
		private String etnia;
		private String endereco;
		private String telefone;
		
				
		//construtores
		public Pessoa(String nome) {
			this.nome = nome;
		}

		public Pessoa(String nome, char sexo) {
			this.nome = nome;
			this.sexo = sexo;
		}

		public Pessoa(String nome, char sexo, int anoNasc) {
			this.nome = nome;
			this.sexo = sexo;
			this.anoNasc = anoNasc;
		}

		public Pessoa(String nome, char sexo, int anoNasc, String etnia) {
			this.nome = nome;
			this.sexo = sexo;
			this.anoNasc = anoNasc;
			this.etnia = etnia;
		}
		

		public Pessoa(String nome, char sexo, int anoNasc, String etnia, String endereco) {
			super();
			this.nome = nome;
			this.sexo = sexo;
			this.anoNasc = anoNasc;
			this.etnia = etnia;
			this.endereco = endereco;
		}

		
		
		public Pessoa(String nome, char sexo, int anoNasc, String etnia, String endereco, String telefone) {
			super();
			this.nome = nome;
			this.sexo = sexo;
			this.anoNasc = anoNasc;
			this.etnia = etnia;
			this.endereco = endereco;
			this.telefone = telefone;
		}

		
		
		public Pessoa(String nome, String endereco, String telefone) {
			super();
			this.nome = nome;
			this.endereco = endereco;
			this.telefone = telefone;
		}

		public int idade() {
			int idade = 2020 - this.anoNasc;
			return idade;
		}
		
		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public char getSexo() {
			return sexo;
		}

		public void setSexo(char sexo) {
			this.sexo = sexo;
		}

		public int getAnoNasc() {
			return anoNasc;
		}

		public void setAnoNasc(int anoNasc) {
			this.anoNasc = anoNasc;
		}

		public String getEtnia() {
			return etnia;
		}

		public void setEtnia(String etnia) {
			this.etnia = etnia;
		}

		public String getEndereco() {
			return endereco;
		}

		public void setEndereco(String endereco) {
			this.endereco = endereco;
		}

		public String getTelefone() {
			return telefone;
		}

		public void setTelefone(String telefone) {
			this.telefone = telefone;
		}
		
		
		
				
}


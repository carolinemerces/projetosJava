package exerciciosPOO;

public class Aviao {

	//Crie uma classe avi�o e apresente os atributos e m�todos referentes esta classe, em seguida crie um objeto avi�o, defina as instancias deste objeto e apresente as informa��es deste objeto no console
	
	//atributos
		public String nomeAviao;
		public int numeroIdentificadorAviao;
		public int capacidadeAviao;
		
		public void mostraNomeAviao() {
			System.out.printf("\nAvi�o %s", nomeAviao);
		}
		public void mostraNumeroIdentificadorAviao() {
			System.out.printf(" %d", numeroIdentificadorAviao);
		}
		
		public void mostraCapacidadeAviao() {
				System.out.printf(" com capacidade para %d pessoas", capacidadeAviao);
		}

	
}

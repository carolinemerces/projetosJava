package exerciciosPOO;

public class Aviao {

	//Crie uma classe avião e apresente os atributos e métodos referentes esta classe, em seguida crie um objeto avião, defina as instancias deste objeto e apresente as informações deste objeto no console
	
	//atributos
		public String nomeAviao;
		public int numeroIdentificadorAviao;
		public int capacidadeAviao;
		
		public void mostraNomeAviao() {
			System.out.printf("\nAvião %s", nomeAviao);
		}
		public void mostraNumeroIdentificadorAviao() {
			System.out.printf(" %d", numeroIdentificadorAviao);
		}
		
		public void mostraCapacidadeAviao() {
				System.out.printf(" com capacidade para %d pessoas", capacidadeAviao);
		}

	
}

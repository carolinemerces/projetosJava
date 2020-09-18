package aplicacao;

import entidades.Cachorro;
import entidades.Cavalo;
import entidades.Preguica;

public class SomAnimais {

	public static void main(String[] args) {
		
		Cachorro cachorro = new Cachorro("Scoob", 2);
		System.out.printf("O cachorro %s tem %d anos e faz o seguinte som: ",cachorro.getNome(),cachorro.getIdade());
		System.out.print(cachorro.emitirSom("Au au."));
		//System.out.print("\n"+cachorro.correr());
		
		Cavalo cavalo = new Cavalo("Dudu",9);
		System.out.printf("\nO cavalo %s tem %d anos e faz o seguinte som: ",cavalo.getNome(),cavalo.getIdade());
		System.out.print(cavalo.emitirSom("Hinn in in."));
		//System.out.print("\n"+cavalo.correr());
		
		Preguica preguica = new Preguica("Laila",15);
		System.out.printf("\nA preguiça %s tem %d anos e faz o seguinte som: ",preguica.getNome(),preguica.getIdade());
		System.out.print(preguica.emitirSom("Fiiiiiiiiiian."));
		//System.out.print("\n"+preguica.subir());
		
	}

}

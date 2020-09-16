package teste;

import java.util.Random;

public class TesteCarro {

	public static void main(String[] args) {
		
		Random v = new Random();
		int valor = v.nextInt(100);
		//instanciar a class Carro
		Carro meuCarro = new Carro(); //criando um novo objeto do tipo carro e instanciou os atributos (meuCarro)
		meuCarro.cor = "Vermelho";
		meuCarro.modelo = "Passat";
		meuCarro.velocidadeAtual = 0;
		meuCarro.velocidadeMaxima = 90;
		
		//chamando os metodos da classe carro
		meuCarro.liga();
		meuCarro.acelera(valor);
		
		System.out.printf("Velocidade do carro: %.2f km/h", meuCarro.velocidadeAtual);
		
		meuCarro.pegaMarcha();
		System.out.printf("\nUtilize a marcha: %d", meuCarro.pegaMarcha());

	}

}

import java.util.Scanner;

public class IdadeMenor21Maior50ParaMenos99 {

	public static void main(String[] args) {
		// Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de 21 anos. Total de pessoas com mais de 50 anos. O programa termina quando idade for =-99. (WHILE)
			
		int idade, menor=0, maior=0;
		Scanner ler = new Scanner(System.in);
		System.out.println("Digite sua idade: ");
		idade = ler.nextInt();
		
		while (idade!=-99){
			if (idade<=0 && idade!=-99) {
				System.out.println("\nIdade inválida! Digite sua idade novamente: ");
				idade = ler.nextInt();
			}
			if (idade<=21) {
			menor = menor + 1;
			
			System.out.printf("Existem %d pessoa(s) menores de 21 anos", menor);
			System.out.printf("\nExistem %d pessoa(s) maiores de 50 anos\n", maior);
			}
			else if (idade>=50){
				maior = maior +1;
				System.out.printf("Existem %d pessoa(s) menores de 21 anos", menor);
				System.out.printf("\nExistem %d pessoa(s) maiores de 50 anos\n", maior);
			}
		System.out.println("\nDigite sua idade: ");
		idade = ler.nextInt();
		}

	}
}

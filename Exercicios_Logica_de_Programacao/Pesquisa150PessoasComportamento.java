import java.util.Scanner;

public class Pesquisa150PessoasComportamento {

	public static void main(String[] args) {
		// Uma empresa desenvolveu uma pesquisa para saber as características psicológicas dos indivíduos de uma região. Para tanto, a cada uma das pessoas era perguntado: idade, sexo (1-feminino / 2-masculino), e as opções (1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa era agressiva). Pede-se para elaborar um sistema que permita ler os dados de 150 pessoas, calcule e mostre: (WHILE)
/*
o número de pessoas calmas; 
o número de mulheres nervosas; 
o número de homens agressivos; 
o número de pessoas nervosas com mais de 40 anos; 
o número de pessoas calmas com menos de 18 anos.
*/
		
		int contador=0, idade, genero, comportamento, calm=0, nervous=0, aggressive=0, mulher=0, homem=0, mais=0, menos=0;
		Scanner ler = new Scanner(System.in);
		
		while (contador <=150) {
			contador++;
			//System.out.printf("%d", contador);
			
			System.out.println("Digite sua idade: ");
			idade = ler.nextInt();
			
			System.out.println("Digite seu gênero (1 - Feminino ou 2 - Masculino): ");
			genero = ler.nextInt();
			
			System.out.println("Digite seu comportamento (1 - Calmo(a), 2 - Nervoso(a) ou 3 - Agressivo(a)): ");
			comportamento = ler.nextInt();
			
			if (comportamento==1) {
				calm = calm +1;
			}
			else if (comportamento==2) {
				nervous = nervous+1;
			}
			else {
				aggressive = aggressive+1;
			}
			
			if (genero==1 && comportamento==2) {
				mulher=mulher+1;
			}
			if (genero==2 && comportamento==3) {
				homem=homem+1;
			}
			if (comportamento==2 && idade>40) {
				mais=mais+1;
			}
			if (comportamento==1 && idade<18) {
				menos=menos+1;
			}
		}
		System.out.printf("No total existem %d pessoa(s) calma(s), %d pessoa(s) nervosa(s) e %d pessoa(s) agressiva(s).",calm, nervous, aggressive);
		System.out.printf("\nO total de mulher(es) nervosa(s) é %d e de ",mulher);
		System.out.printf("homem(ens) agressivo(s) é %d.",homem);
		System.out.printf("\nNo total existem %d pessoa(s) nervosa(s) com mais de 40 anos ",mais);
		System.out.printf("e %d pessoa(s) calma(s) com menos de 18 anos.",menos);
	
		ler.close();
	}

}

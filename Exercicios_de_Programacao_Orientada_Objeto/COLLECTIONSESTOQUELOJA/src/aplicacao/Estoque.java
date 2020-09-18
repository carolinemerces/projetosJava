package aplicacao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Estoque {

	public static void main(String[] args) {
		
		String nome;
		
		List<String> list = new ArrayList<>();
		Scanner ler  = new Scanner(System.in);
		//int opcao;
		
		System.out.print("                                              CONTROLE DE ESTOQUE");
		System.out.print("\n--------------------------------------------------------------------------------------------------------------------------------");
		//System.out.print("\nEscolha entre as opções do estoque (1 - Inserir itens | 2 - Remover os itens | 3 - Atualizar itens | 4 - Mostrar a lista de itens) : ");
		//opcao = ler.nextInt();
		
		System.out.print("\nDigite o NÚMERO de itens a entrar no estoque: ");
		int n = ler.nextInt();
		
		for (int i=1;i<=n;i++) {
			System.out.printf("Insira o item %d a entrar no estoque: ",i);
			nome = ler.next().toUpperCase();

			list.add(nome);
		}
		
		//Armazenando os dados da List
		
			System.out.printf("\nItens em estoque: %s",list);
			System.out.print("\n");
		
		
		//Removendo os dados da List
			System.out.print("\nDeseja REMOVER TODOS os itens? (S - SIM | N - NÃO): ");
			char resposta = ler.next().toUpperCase().charAt(0);
			if (resposta=='S'){
			list.clear();
			//System.out.printf("\nItens em estoque: %s",list);
			}
			else {
				System.out.print("\nDeseja REMOVER ALGUM item? (S - SIM | N - NÃO): ");
				resposta = ler.next().toUpperCase().charAt(0);
				if (resposta=='S') {
					System.out.print("\nDigite o item a ser REMOVIDO: ");
					list.remove(nome=ler.next().toUpperCase());
				}
			}
			System.out.printf("\nItens em estoque: %s",list);
			System.out.print("\n");
		
		//Atualizando os dados da List
			System.out.print("\nDeseja ATUALIZAR ALGUM item? (S - SIM | N - NÃO): ");
			resposta = ler.next().toUpperCase().charAt(0);
			if (resposta=='S'){
				System.out.print("\nDigite o NÚMERO de itens a ser ATUALIZADO no estoque: ");
				int n1 = ler.nextInt();
				for (int i=1;i<=n1;i++) {
					System.out.printf("\nInsira o item a ser atualizado no estoque: ");
					List<String> listAtualizada = Arrays.asList(nome = ler.next().toUpperCase());
					list.addAll(listAtualizada);
				}
			}
			System.out.printf("\n                                          Itens em estoque(ATUALIZADO): ");
			System.out.print("\n--------------------------------------------------------------------------------------------------------------------------------\n");
			System.out.print(list);
		
		
		//Apresentar todos os dados da lista
	
			//for (String list1 : list) {
				//System.out.printf("\nItens em estoque: %s",list1);

		
		ler.close();
	}
}


import java.util.*;
public class Genero {

	public static void main(String[] args) {
		// Faça um programa que informe o gênero do usuário.
		
		int genero;
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Informe o gênero (1 - Feminino, 2 - Masculino, 3 - Outro ou 4 - Prefiro não informar): ");
		genero = ler.nextInt();
		
		System.out.print((genero == 1)? "Gênero Feminino." : (genero == 2)? "Gênero Masculino." : (genero == 3)? "Outro gênero." : (genero == 4)? "Gênero não informado." : "Opção inválida!");
		
		ler.close();
	}

}

import java.util.*;
public class Genero {

	public static void main(String[] args) {
		// Fa�a um programa que informe o g�nero do usu�rio.
		
		int genero;
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Informe o g�nero (1 - Feminino, 2 - Masculino, 3 - Outro ou 4 - Prefiro n�o informar): ");
		genero = ler.nextInt();
		
		System.out.print((genero == 1)? "G�nero Feminino." : (genero == 2)? "G�nero Masculino." : (genero == 3)? "Outro g�nero." : (genero == 4)? "G�nero n�o informado." : "Op��o inv�lida!");
		
		ler.close();
	}

}

import java.util.*;
public class Condicional1 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		int idade;
		String nome;
		
		
		System.out.printf("Digite sua idade: ");
		idade = ler.nextInt();
		System.out.printf("Digite seu nome: ");
		nome = ler.next();
		
		if (idade>=18) {
			
			System.out.printf("\n%s é maior de idade...", nome);
		}
		else if (idade>1 && idade<18){
			
			System.out.printf("\n%s é menor de idade...", nome);
		}
		else if (idade==0) {
			System.out.printf("\n%s é um bebê...", nome);
		}
		else {
			System.out.printf("\n%s digitou uma idade inválida...", nome);
		}
		
		ler.close();
	}

}

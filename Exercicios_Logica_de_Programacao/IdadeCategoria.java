import java.util.*;
public class IdadeCategoria {

	public static void main(String[] args) {
		/*Fa�a um programa que receba a idade de uma pessoa e mostre na sa�da
		 *  em qual categoria ela se encontra:
            10-14 infantil
            15-17 juvenil
            18-25 adulto
		 */
			
		int idade;
		Scanner ler = new Scanner(System.in);
		System.out.print("Digite a sua idade: ");
		idade = ler.nextInt();
		
		if (idade>=1 && idade<=9) {
			System.out.print("Voc� est� na categoria infantil.");
		}
		else if (idade>=10 && idade<=14) {
			System.out.print("Voc� est� na categoria infantojuvenil.");
		}
		else if (idade>=15 && idade<=17) {
			System.out.print("Voc� est� na categoria juvenil.");
		}
		else if (idade>=18 && idade<=25){
			System.out.print("Voc� est� na categoria jovem adulto.");
		}
		else if (idade>=26 && idade<=55){
			System.out.print("Voc� est� na categoria adulto.");
		}
		else if (idade>=56 && idade<=75) {
			System.out.print("Voc� est� na categoria da melhor idade.");
		}
		else if (idade>76) {
			System.out.print("Voc� est� na categoria idoso.");
		}
		else {
			System.out.print("Idade inv�lida!");
		}
		ler.close();
	}
		
}

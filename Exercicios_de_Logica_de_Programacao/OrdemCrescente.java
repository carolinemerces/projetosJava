import java.util.*;
public class OrdemCrescente {

	public static void main(String[] args) {
		// Fa�a um programa que entre com tr�s n�meros e coloque em ordem crescente.
		
		int n1, n2, n3;
		Scanner ler = new Scanner(System.in);
		System.out.print("Digite o valor do primeiro n�mero: ");
		n1 = ler.nextInt();
		System.out.print("Digite o valor do segundo n�mero: ");
		n2 = ler.nextInt();
		System.out.print("Digite o valor do terceiro n�mero: ");
		n3 = ler.nextInt();
		
		if (n1>n2 && n1>n3 && n2>n3) {
			System.out.printf("\n%d %d %d", n3,  n2, n1);
		}
		else if (n1>n2 && n1<n3) {
			System.out.printf("\n%d %d %d", n2 , n1 , n3);
		}
		else if (n1<n2 && n3>n2 /*&& n2>n1*/) {
			System.out.printf("\n%d %d %d",n1 , n2 , n3);
		}
		else if (n2<n3 && n2<n1 && n3>n1) {
			System.out.printf("\n%d %d %d", n2, n3, n1);
		}
		else if (n1>n2 && n1>n3 && n2<n3) {
			System.out.printf("\n%d %d %d",n2, n3, n1);
		}
		else if (n1<n2 && n3<n1) {
			System.out.printf("\n%d %d %d",n3, n1, n2);
		}
		else {
			System.out.printf("\n%d %d %d",n1 , n3 , n2);
		}
		ler.close();

	}

}

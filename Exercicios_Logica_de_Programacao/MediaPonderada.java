import java.util.Scanner;

public class MediaPonderada {

	public static void main(String[] args) {
		/* Fa�a um sistema que leia as 3 notas de um aluno e calcule a m�dia final deste
aluno. Considerar que a m�dia � ponderada e que o peso das notas �: 2,3 e 5,
respectivamente.
		*/
		
		double n1, n2, n3, p1=2, p2=3, p3=5, pT, mediaP;
		Scanner ler = new Scanner(System.in);
		System.out.print("Digite a primeira nota: ");
		n1 = ler.nextDouble();
		System.out.print("Digite a segunda nota: ");
		n2 = ler.nextDouble();
		System.out.print("Digite a terceira nota: ");
		n3 = ler.nextDouble();
		mediaP = (n1*p1)+(n2*p2)+(n3*p3);
		pT=(p1+p2+p3);
		mediaP = (mediaP/pT);
		System.out.printf("A m�dia �: %.1f", mediaP);
		
		ler.close();

	}

}

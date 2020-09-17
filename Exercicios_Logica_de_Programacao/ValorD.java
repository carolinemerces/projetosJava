import java.util.Scanner;

public class ValorD {

	public static void main(String[] args) {
		/* Escreva um sistema que leia três números inteiros e positivos (A, B, C) e
		calcule a seguinte expressão: D=(R+S)/2, onde R=(A+B)^2 e S=(B+C)^2
				*/
		
		
		double r, d, s, p=2;
		int a, b, c;
		Scanner ler = new Scanner(System.in);
		System.out.print("Digite o valor de A: ");
		a = ler.nextInt();
		System.out.print("Digite o valor de B: ");
		b = ler.nextInt();
		System.out.print("Digite o valor de C: ");
		c = ler.nextInt();
		r = (a+b);
		r = Math.pow(r, 2);
		s = (b+c);
		s = Math.pow(s, 2);
		d = ((r+s)/2);
		System.out.println("O valor de D é: "+d);
		
		ler.close();
		}

}

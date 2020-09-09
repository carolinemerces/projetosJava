import java.util.Locale;
import java.util.Scanner;
public class DistanciaDoisPontos {
	public static void main(String[] args)
	{
		/*/*Construa um programa em c que, tendo como dados de entrada dois pontos
		quaisquer no plano, P(x1, y1) e P(x2, y2), escreva a distância entre eles. 
		A fórmula d=raiz((x2-x1)^2 + (y2-y1)^2)
		*/
		
		Locale.setDefault(Locale.US); 
		double d, x1, x2, y1, y2, p1, p2;
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Entre com o primeiro valor do primeiro ponto (X1): ");
		x1 = ler.nextDouble();
		System.out.print("Entre com o segundo valor do primeiro ponto (X2): ");
		x2 = ler.nextDouble();
		System.out.print("Entre com o primeiro valor do segundo ponto (Y1): ");
		y1 = ler.nextDouble();
		System.out.print("Entre com o segundo valor do segundo ponto (Y2): ");
		y2 = ler.nextDouble();
		p1 = Math.pow((x2-x1), 2);
		p2 = Math.pow((y2-y1), 2);
		d=Math.sqrt(p1+p2);
		
		System.out.printf("\nValor de D é %.3f", d);
		
		ler.close();
	}
}

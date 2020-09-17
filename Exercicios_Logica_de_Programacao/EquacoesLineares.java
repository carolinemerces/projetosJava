import java.util.Locale;
import java.util.Scanner;
public class EquacoesLineares {
	public static void main(String[] args)
	{
		/*/*Um sistema de equações lineares do tipo: ax+by=c, dx+ey=f, pode ser 
		 * resolvido segundo mostrado x=((ce-bf)/(ae-bd)) e y=((af-cd)/(ae-bd)). Escreva um 
		 * sistema que lê os coeficientes a,b,c,d,e e f e calcula e mostra os valores de x e y.
		 */
		
		Locale.setDefault(Locale.US); 
		Scanner ler = new Scanner(System.in);
		
		
		double a,b,c,d,e,f,x,y; //declarei todas as varaveis
		
		System.out.print("Entre com o valor de A: ");
		a = ler.nextDouble();
		System.out.print("Entre com o valor de B: ");
		b = ler.nextDouble();
		System.out.print("Entre com o valor de C: ");
		c = ler.nextDouble();
		System.out.print("Entre com o valor de D: ");
		d = ler.nextDouble();
		System.out.print("Entre com o valor de E: ");
		e = ler.nextDouble();
		System.out.print("Entre com o valor de F: ");
		f = ler.nextDouble();
		
		x = (c*e - b*f)/(a*e - b*d);
		y = (a*f - c*d)/(a*e - b*d);
		
		System.out.printf("\nValor de X: %.2f",x);
		System.out.printf("\nValor de Y: %.2f",y);
		
		ler.close();
	}
}

import java.util.Scanner;

public class EventoEmHorasMinutosSegundos {

	public static void main(String[] args) {
		/* Faça um sistema que leia o tempo de duração de um evento em uma fábrica
		expressa em segundos e mostre-o expresso em horas, minutos e segundos.
		*/

		int segundosTotais, segundos, minutos, horas;
		Scanner ler = new Scanner(System.in);
		System.out.println("Digite o tempo total do evento em segundos: ");
		segundosTotais = ler.nextInt();
		horas = (segundosTotais/3600);
		minutos = ((segundosTotais%3600)/60);
		segundos = ((segundosTotais%3600)%60);
		
		
		
		
		
		
		ler.close();		
	}

}

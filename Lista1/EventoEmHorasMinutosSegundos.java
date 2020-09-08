import java.util.Scanner;

public class EventoEmHorasMinutosSegundos {

	public static void main(String[] args) {
		/* Faça um sistema que leia o tempo de duração de um evento em uma fábrica
		expressa em segundos e mostre-o expresso em horas, minutos e segundos.
		*/

		int segundosTotais, segundos, minutos, horas;
		Scanner ler = new Scanner(System.in);
		System.out.print("Digite o tempo total do evento em segundos: ");
		segundosTotais = ler.nextInt();
		horas = (segundosTotais/3600);
		minutos = ((segundosTotais%3600)/60);
		segundos = ((segundosTotais%3600)%60);
		System.out.println("A duração do evento foi de "+horas+" hora(s), "+minutos+" minuto(s) e "+segundos+" segundo(s).");
		
		
		
		
		
		
		ler.close();		
	}

}
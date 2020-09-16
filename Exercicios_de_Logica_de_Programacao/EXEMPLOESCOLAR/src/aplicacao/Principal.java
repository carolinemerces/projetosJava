package aplicacao;
import java.util.Scanner;
import entidades.Aluno;
public class Principal {
	public static void main(String[] args) {
		
		Scanner kb = new Scanner(System.in);
		Aluno aluno = new Aluno();
		int i;
		
		System.out.printf("Digite o nome do aluno: ");
		aluno.nomeAluno = kb.nextLine().toUpperCase();
		System.out.printf("Digite a turma do aluno: ");
		aluno.turmaAluno = kb.next().toUpperCase().charAt(0);
		System.out.printf("Digite o ano de nascimento do aluno: ");
		aluno.anoNascimentoAluno = kb.nextInt();
		System.out.printf("Digite o gênero do aluno: (M) para masculino ou (F) para feminino: ");
		aluno.sexoAluno = kb.next().toUpperCase().charAt(0);	
		System.out.printf("Digite a nota média necessária para aprovação: ");
		aluno.mediaAprovacao = kb.nextDouble();
		for(i = 0; i < 4; i++) {
			System.out.printf("Digite a %dª nota: ", (i + 1));
			aluno.nota[i] = kb.nextDouble();
		}
		
		aluno.mostra();
		aluno.mostraIdadeAluno();
		aluno.media();
		aluno.alunoResultado();
		
		kb.close();
	}
}
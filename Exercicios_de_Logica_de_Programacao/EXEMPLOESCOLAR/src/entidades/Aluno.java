package entidades;
public class Aluno {
	public String nomeAluno;
	public int anoNascimentoAluno;
	public char sexoAluno;
	public char turmaAluno;
	public double nota[] = new double[4];
	public double media;
	public double mediaAprovacao;
	
	public double media() {
		return media = (nota[0] + nota[1] + nota[2] + nota[3]) / 4;
	}
	
	public void mostraIdadeAluno() {
		if(sexoAluno == 'M') {
			System.out.printf("\nA idade do aluno é %d", 2020 - anoNascimentoAluno);
		}
		else if(sexoAluno == 'F') {
			System.out.printf("\nA idade da aluna é %d", 2020 - anoNascimentoAluno);
		}
	}
	public void alunoResultado() {
		if(media > mediaAprovacao) {
			if(sexoAluno == 'M') {
				System.out.printf("\nEle está aprovado");
			}
			else if(sexoAluno == 'F') {
				System.out.printf("\nEla está aprovada");
			}
		}
		else {
			if(sexoAluno == 'M') {
				System.out.printf("\nEle está reprovado");
			}
			else if(sexoAluno == 'F') {
				System.out.printf("\nEla está reprovada");
			}
		}
	}	
	
	public void mostra() {
		if(sexoAluno == 'M') {
			System.out.printf("\nO aluno %s pertence a turma %c", nomeAluno, turmaAluno);
		}
		else if(sexoAluno == 'F') {
			System.out.printf("\nA aluna %s pertence a turma %c", nomeAluno, turmaAluno);
		}	
	}
}


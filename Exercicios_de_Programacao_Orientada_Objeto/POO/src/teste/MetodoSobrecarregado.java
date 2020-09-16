package teste;

public class MetodoSobrecarregado {
		
	//uma classe com vários métodos com mesmo nome, diferenciando pelos argumentos ou números, tipos ou ordem de declaração
	
	//criando os metodos
	public void testaMetodosSobrecarregados() {
		System.out.printf("Salário em número inteiro %d\n", salario(1000));
		System.out.printf("Salário em número inteiro %.3f\n", salario(7.500));
	}
	
	//primeiro metodo chamado salario, mas com parametros diferentes pelo tipo
	public int salario(int valorInt) { //valorInt é meu parametro do tipo Inteiro
		System.out.printf("Salário com argumento inteiro %d\n", valorInt);
		return (valorInt*valorInt);
	}
	
	//segundo metodo chamado salario, mas com parametros diferentes pelo tipo
	public double salario(double valorDbl) {//valorDbl é meu parametro do tipo Double
		System.out.printf("Salário com argumento fracionário %.3f\n", valorDbl);
		return (valorDbl*valorDbl);	
	}
	
	
}

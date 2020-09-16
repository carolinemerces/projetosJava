package teste;

public class MetodoSobrecarregado {
		
	//uma classe com v�rios m�todos com mesmo nome, diferenciando pelos argumentos ou n�meros, tipos ou ordem de declara��o
	
	//criando os metodos
	public void testaMetodosSobrecarregados() {
		System.out.printf("Sal�rio em n�mero inteiro %d\n", salario(1000));
		System.out.printf("Sal�rio em n�mero inteiro %.3f\n", salario(7.500));
	}
	
	//primeiro metodo chamado salario, mas com parametros diferentes pelo tipo
	public int salario(int valorInt) { //valorInt � meu parametro do tipo Inteiro
		System.out.printf("Sal�rio com argumento inteiro %d\n", valorInt);
		return (valorInt*valorInt);
	}
	
	//segundo metodo chamado salario, mas com parametros diferentes pelo tipo
	public double salario(double valorDbl) {//valorDbl � meu parametro do tipo Double
		System.out.printf("Sal�rio com argumento fracion�rio %.3f\n", valorDbl);
		return (valorDbl*valorDbl);	
	}
	
	
}

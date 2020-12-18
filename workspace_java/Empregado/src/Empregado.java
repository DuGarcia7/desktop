
public class Empregado {
	
	String nome;
	String cargo;
	double salario;
	
	void imprimir() {
		System.out.println("Nome: "+nome);
		System.out.println("Cargo: "+cargo);
		System.out.printf("Salario: R$ %.2f%n", salario);
	}
	
	void aumentarSalario(double Percentual) {
		salario = salario + salario*Percentual/100;
	}
	
}

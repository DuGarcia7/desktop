
public class EmpregadoTeste {
	public static void main(String args[]) {
		Empregado e1;
		e1 = new Empregado();
		
		e1.nome = "Isisdro";
		e1.cargo = "Professor";
		e1.salario = 10000.0;
		
		System.out.println("Ordenado antes do aumento");		
		e1.imprimir();
		
		System.out.println("Aumento de 15%");
		e1.aumentarSalario(15.0);
		
		System.out.println("Ordenado após aumento");
		e1.imprimir();		
		
	}

}

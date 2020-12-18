package userInterface;

import core.Conta;
import core.ContaEspecial;

public class Banco {
	public static void main(String args[]) {
		Conta c1 = new Conta("Eduardo","987.654.321-00",1234);
		ContaEspecial ce1 = new ContaEspecial("Mariana","123.456.789-00", 4321, 2000);
		
		c1.deposito(50000);
		System.out.println(c1);
		
		if (c1.saque(10000)) {
			System.out.println("Saque autorizado na conta "+c1.getNumConta()+"\n");
		}
		else {
			System.out.println("Saldo insuficiente na conta "+c1.getNumConta()+"\n");
		}
		
		ce1.deposito(30000);
		ce1.setLimite(2000);
		ce1.saque(31000);
		
		System.out.println(ce1);
		
		if (c1.saque(10000)) {
			System.out.println("Saque autorizado na conta "+ce1.getNumConta()+"\n");
		}
		else {
			System.out.println("Saldo insuficiente na conta "+ce1.getNumConta()+"\n");
		}
	}
	

}

package userInterface;

import model.Chefe;
import model.Comissionado;
import model.Empreiteiro;
import model.Funcionario;
import model.Horista;

public class Empresa {
	public static void main(String args []) {
		Funcionario f [];
		f = new Funcionario[4];
		
		f[0] = new Chefe ("Cassia Lago",1234,10000.0,10,2000.0);
		f[1] = new Comissionado ("Lucas Santos",4567,4000,2);
		f[2] = new Horista ("Mariana Ribeiro",6789,30.0,900);
		f[3] = new Empreiteiro ("Jo�o Mario",3456,5000);
		
		System.out.println(">>>>>>>> FOLHA DE PAGAMENTO <<<<<<<<");
		System.out.println("====================================");
		
		/*
		for (int cont=0 ; cont < f.length ; cont++) {
			System.out.println("Nome: "+f[cont].getNome()+"\nSalario: R$"+String.format("%.2f", f[cont].calcularSalario())+
								"\n==================");*/
		
		//a express�o abaixo substitui a de cima, apenas quando temos uma lista.	
		//s� funciona com printF
		for (Funcionario fun : f) {
			System.out.printf("%d - %-15s - R$%8.2f%n",fun.getNumRegistro(),fun.getNome(),fun.calcularSalario());
			//"%d" significa que � um numero inteiro
			//"%-15s" indica que a string tera 15 caracteres, alinhada para a esquerda por conta do sinal de menos
		}
		
	}

}

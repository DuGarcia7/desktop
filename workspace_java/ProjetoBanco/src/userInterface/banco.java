package userInterface;
//importar conta bancaria do package core
import core.contaBancaria;
//importar JOptionPane
import javax.swing.JOptionPane;

public class banco {
	public static void main(String args[]) {
		contaBancaria c1,c2,c3;
		
		c1 = new contaBancaria();
		c2 = new contaBancaria();
		c3 = new contaBancaria();
		
		c1.setNumeroConta(123);
		c1.setTitular("Mariana Rodrigues Faria");
		c1.setCpfTitular("367.258.903-44");
		c1.deposito(50000.0);
		//System.out.println(c1.exibirConta());
		JOptionPane.showMessageDialog(null, c1.exibirConta());
		
		c2.setNumeroConta(456);
		c2.setTitular("Lucas Moreira");
		c2.setCpfTitular("447.582.655-32");
		c2.deposito(3000.0);
		//System.out.println(c2.exibirConta());
		JOptionPane.showMessageDialog(null, c2.exibirConta());
		
		c3.setNumeroConta(789);
		c3.setTitular("Bruna Santos Gimenez");
		c3.setCpfTitular("234.754.436-72");
		c3.deposito(130000.0);
		//System.out.println(c3.exibirConta());
		JOptionPane.showMessageDialog(null, c3.exibirConta());
		
		// boolean saque = c1.saque(60000); substitui "saque" pela opera��o
		// Por defini��o, a primeira instru��o do if � a condi��o de verdade
		
		if (c1.saque(60000)) {
			System.out.println("\nSaque Autorizado!");
		}
		else {
			System.out.println("\nSaldo Indispon�vel!!!");
		}
		System.out.println(c1.exibirConta());

	}

}

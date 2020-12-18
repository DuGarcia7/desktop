package userInterface;

import core.Combustivel;
import javax.swing.JOptionPane;

public class Posto {
	public static void main(String args[]) {
		Combustivel b1;
		
		b1 = new Combustivel("Gasolina", 4.199);
		
		b1.abastecerPorLitro(20.0);
		System.out.println(b1.exibirRecibo());
		JOptionPane.showMessageDialog(null,b1.exibirRecibo());
		
		b1.abastecerPorValor(100.0);
		System.out.println(b1.exibirRecibo());
		
				
	}

}

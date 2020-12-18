package userInterface;

import java.util.ArrayList;

import core.CartaoCB;
import core.CartaoPP;

public class Festa {
	public static void main(String args[]) {
		
		//VRSÃO 2.0 - COM ARRAYLIST
		ArrayList <CartaoPP> cartao;
		cartao = new ArrayList <CartaoPP>();
		
		cartao.add(new CartaoPP("123","Roberto Araujo",2025,2));
		cartao.add(new CartaoCB("456","Larissa Campos",2022,5,"gold"));
		cartao.add(new CartaoCB("789","Luiza Pereira",2023,8,"silver"));
		cartao.add(new CartaoCB("478","Andre Lourenço",2027,3,"bronze"));
		
		for (CartaoPP card : cartao) {
			card.deposito(200.00);
			if(card.compra(80.0)) {
				System.out.println("Compra aprovada no cartao "+ card.getNumCartao());
			}
			else {
				System.out.println("Saldo insuficiente no cartao "+ card.getNumCartao());
			}
			System.out.println(card);
			}
		}
		
		
		
		/* VERSÃO 1.0
		CartaoPP pp1 = new CartaoPP("123","Roberto Araujo",2025,02);
		CartaoPP cb1 = new CartaoCB("456","Larissa Campos",2022,05,"gold");
		
		pp1.deposito(100.0);
		cb1.deposito(200.0);
		
		if(pp1.compra(50.5)){
			System.out.println("Compra aprovada no cartao "+ pp1.getNumCartao());
		}
		else {
			System.out.println("Saldo insuficiente no cartao "+pp1.getNumCartao());
		}
		System.out.println(pp1);
		
		//só estou declarando valor novamente para poder imprimir esse valor
		//mas poderia declarar direto no parenteses, pois ja declarei a variavel na classe CartaoCB
			
		if(cb1.compra(80.0)) {
			System.out.println("Compra aprovada no cartao "+ cb1.getNumCartao());
		}
		else {
			System.out.println("Saldo insuficiente no cartao "+cb1.getNumCartao());
		}
		System.out.println(cb1);*/
		
}
	


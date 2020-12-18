
public class Carros {
		String marca;
		String modelo;
		int ano;
		String cor;
		double preco;
		
		void imprimir() {
			System.out.println("----- CARRO -----");
			System.out.println("Marca: "+marca"/"+modelo);
			System.out.println("Ano: "+ano "    Cor: "+cor);
			System.out.prinln("Valor: R$ "+preco);
		}
		
		double calcularIPVA{
			if (ano < 2000) {
				return 0;
			}
			else {
				return preco * 0.04;
			}
		}
}

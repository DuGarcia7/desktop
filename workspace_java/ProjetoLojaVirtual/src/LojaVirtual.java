
public class LojaVirtual {
	public static void main(String args[]) {
		Produto p1 = new Produto();
		Produto p2 = new Produto();
		Produto p3 = new Produto();
		
		p1.setCodigo(1);
		p1.setNome("Celular");
		p1.setPreco(3500.0);
		p1.setDepartamento("Eletronicos");
		
		System.out.println(p1.exibirProduto());
		System.out.println("COM DESCONTO: R$ "+p1.aplicarDesconto(7.0));
		
		p2.setCodigo(2);
		p2.setNome("Microondas");
		p2.setPreco(500.0);
		p2.setDepartamento("Eletrodomesticos");
				
		System.out.println(p2.exibirProduto());
		System.out.println("COM DESCONTO: R$ "+p2.aplicarDesconto(5.0));
		
		p3.setCodigo(3);
		p3.setNome("Notebook");
		p3.setPreco(7000.0);
		p3.setDepartamento("Eletronicos");				
			
		System.out.println(p3.exibirProduto());
		System.out.println("COM DESCONTO: R$ "+p3.aplicarDesconto(10.0));
		
	}

}


public class Produto {
	private int codigo;
	private String nome;
	private double preco;
	private String departamento;
	
	//deixar private e depois gerar getters and setters
	//Source > Generate getters and setters > select all > generate
	
	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	
	
	public String exibirProduto() {
		String resultado = "\nPRODUTO: " +nome+ " (" +codigo+ ") \nDEPARTAMENTO: " +departamento+ "PRECO: R$" +preco;
		return resultado;
	}
		
	public double aplicarDesconto(double desconto) {
		return preco - preco*desconto/100;
	}
	
}

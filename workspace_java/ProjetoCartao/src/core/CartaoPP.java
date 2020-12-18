package core;

public class CartaoPP {
	
	protected String numCartao;
	protected String nome;
	protected int anoValidade;
	protected int mesValidade;
	protected double saldo;
		
	public CartaoPP(String numCartao, String nome, int anoValidade, int mesValidade) {
		super();
		this.numCartao = numCartao;
		this.nome = nome;
		this.anoValidade = anoValidade;
		this.mesValidade = mesValidade;
		this.saldo = 0.0;
	}

	public void deposito(double valorDeposito) {
		saldo += valorDeposito;
	}
	
	public boolean compra (double valorCompra) {
		if (valorCompra > saldo) {
			return false;
		}
		else {
			saldo -= valorCompra;
			return true;
		}		
	}
	
	public String toString( ){
		return "Cartao: "+numCartao+"\nNome: "+nome+
				"\nValidade: "+anoValidade+"/"+mesValidade+
				"\nSaldo: R$ "+String.format("%.2f", saldo)+"\n";
	}

	public String getNumCartao() {
		return numCartao;
	}


	public void setNumCartao(String numCartao) {
		this.numCartao = numCartao;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public int getAnoValidade() {
		return anoValidade;
	}


	public void setAnoValidade(int anoValidade) {
		this.anoValidade = anoValidade;
	}


	public int getMesValidade() {
		return mesValidade;
	}


	public void setMesValidade(int mesValidade) {
		this.mesValidade = mesValidade;
	}


	public double getSaldo() {
		return saldo;
	}
	
	
}

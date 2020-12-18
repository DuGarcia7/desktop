package core;

public class CartaoCB extends CartaoPP {
	
	private String tipo;

	public CartaoCB(String numCartao, String nome, int anoValidade, int mesValidade, String tipo) {
		super(numCartao, nome, anoValidade, mesValidade);
		this.tipo = tipo;
	}
	
	public void deposito(double valorDeposito) {
		saldo += valorDeposito;
	}
	
	public boolean compra(double valorCompra) {
		if (valorCompra > saldo) {
			return false;
		}
		else {
			saldo -= valorCompra;
			if (tipo.equals("gold")) {
				saldo += valorCompra*0.08;
			}
			else if (tipo.equals("silver")) {
				saldo += valorCompra*0.05;
			}
			else if (tipo.equals("bronze")) {
				saldo += valorCompra*0.02;
			}
			return true;
		}	
	}
	public String toString( ){
		return "Cartao: "+numCartao+"\nNome: "+nome+"\nTipo: "+tipo+
				"\nValidade: "+anoValidade+"/"+mesValidade+
				"\nSaldo: R$ "+String.format("%.2f", saldo)+"\n";
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
		
}

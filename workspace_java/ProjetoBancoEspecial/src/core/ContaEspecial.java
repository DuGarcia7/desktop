package core;

public class ContaEspecial extends Conta {
	private double limite;
	
	public ContaEspecial(String nome, String cpf, int numConta, double limite) {
		super(nome, cpf, numConta);
		this.limite = limite;
	}
	public boolean saque(double valorSaque) {
		if (saldo + limite >= valorSaque) {
			saldo = saldo - valorSaque;
			return true;
		}
		return true;
	}
	public void deposito(double valorDeposito) {
		saldo += valorDeposito;
	}	

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}	
	public String toString() {
		return "Nome: "+super.nome+"\nCPF: "+super.cpf+"\nConta: "+super.numConta+"\nSaldo: "+String.format("%.2f", super.saldo);
		//o operador "super" mostra que está sendo referenciado o dado da classe pai, nesse caso a classe CONTA.
	}
}

package core;

public class Conta {
	protected String nome;
	protected String cpf;
	protected int numConta;
	protected double saldo;
	
		public Conta(String nome, String cpf, int numConta) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.numConta = numConta;
		this.saldo = 0;
		
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public int getNumConta() {
		return numConta;
	}
	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}
	public double getSaldo() {
		return saldo;
	}
	public boolean saque(double valorSaque) {
		if (valorSaque >= saldo) {
			return false;
		}
		else {
			saldo = saldo - valorSaque;
			return true;
		}
	}
	public void deposito(double valorDeposito) {
		saldo = saldo + valorDeposito;
	}
	/*public String exibirInfo() {
		String resultado = "Nome: "+nome+"\nCPF: "+cpf+"\nConta: "+numConta+"\nSaldo: "+saldo;
		return resultado;
	}*/
	//o m�todo abaixo substitui o de cima, e s� � preciso mandar imprimir o objeto
	public String toString( ){
		return "Nome: "+nome+"\nCPF: "+cpf+"\nConta: "+numConta+"\nSaldo: "+String.format("%.2f", saldo);
	}
}

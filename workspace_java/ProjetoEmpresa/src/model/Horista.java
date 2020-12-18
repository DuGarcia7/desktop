package model;

public class Horista extends Funcionario {
	
	private double valorHora;
	private int numHora;
	
	public Horista(String nome, int numRegistro, double valorHora, int numHora) {
		super(nome, numRegistro);
		this.valorHora = valorHora;
		this.numHora = numHora;
	}
	
	@Override //indica que voc� est� copiando o enunciado da classe pai
	public double calcularSalario() {
		return valorHora * numHora;
	}

	public double getValorHora() {
		return valorHora;
	}

	public void setValorHora(double valorHora) {
		this.valorHora = valorHora;
	}

	public int getNumHora() {
		return numHora;
	}

	public void setNumHora(int numHora) {
		this.numHora = numHora;
	}

	

}

package model;

public class Comissionado extends Funcionario {
	
	private double salarioBase;
	private double comissao;
	
	public Comissionado(String nome, int numRegistro, double salarioBase, double comissao) {
		super(nome, numRegistro);
		this.salarioBase = salarioBase;
		this.comissao = comissao;
	}
	
	@Override //indica que voc� est� copiando o enunciado da classe pai
	public double calcularSalario() {
		return salarioBase + salarioBase * comissao / 100;
	}

	public double getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}

	public double getComissao() {
		return comissao;
	}

	public void setComissao(double comissao) {
		this.comissao = comissao;
	}
	
	
	
	

}
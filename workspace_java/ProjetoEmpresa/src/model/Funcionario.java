package model;

public abstract class Funcionario {
	
	protected String nome;
	protected int numRegistro;
	
	public Funcionario(String nome, int numRegistro) {
		super();
		this.nome = nome;
		this.numRegistro = numRegistro;
	}	

	public abstract double calcularSalario();

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getNumRegistro() {
		return numRegistro;
	}

	public void setNumRegistro(int numRegistro) {
		this.numRegistro = numRegistro;
	}
	
	

}

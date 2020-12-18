package model;

//o operador EXTENDS pode ser lido como: a classe ESTUDANTE possui TUDO que h� na classe PESSOA
//mais as suas infos espec�ficas

public class Estudante extends Pessoa {
	private String curso;
	private int numMatricula;
	
	
	public String exibirInfo() {
		String resultado = "Nome: "+nome+ "\nEmail: "+email+"\nTelefone: "+telefone+"\nCurso: "+curso+"\nRA: "+numMatricula;
		return resultado;
	}
	
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	public int getNumMatricula() {
		return numMatricula;
	}
	public void setNumMatricula(int numMatricula) {
		this.numMatricula = numMatricula;
	}

}


package core;

public class Combustivel {
	
	private String tipoCombustivel;
	private double valorLitro;
	private double litros;
	private double valorTotal;
	
	//Para utilizar o metodo abaixo, o valor da classe dever� ser
	//obrigatoriamente igual o da "public class"
	public Combustivel(String tipo, double valor) {
		this.tipoCombustivel = tipo;
		this.valorLitro = valor;
		this.litros = 0;
		this.valorTotal = 0;
	}
	
	
	public void abastecerPorLitro(double qtdeLitros) {
		//sempre declarar a vari�vel abaixo
		//se a nomenclatura for igual ao do atributo private, usar this.
		litros = qtdeLitros;
		valorTotal = valorLitro * qtdeLitros;
	}
	public void abastecerPorValor(double valor) {
		valorTotal = valor;
		litros = valor/valorLitro;
	}
	public String exibirRecibo() {
		String exibicao = "========================\n"+
					      "A U T O P O S T O   G A R C I A\n"+
					      "========================\n"+
					      "Combustivel: "+tipoCombustivel+"\n"+
					      "Valor do Litro: R$ "+String.format("%.3f", valorLitro)+"\n"+
					      "Litros: "+String.format("%.3f", litros)+"\n"+
					      "Total a pagar: R$"+String.format("%.3f", valorTotal);
		return exibicao;
	}
	
	
	public String getTipoCombustivel() {
		return tipoCombustivel;
	}
	public void setTipoCombustivel(String tipoCombustivel) {
		this.tipoCombustivel = tipoCombustivel;
	}
	public double getValorLitro() {
		return valorLitro;
	}
	public void setValorLitro(double valorLitro) {
		this.valorLitro = valorLitro;
	}
	public double getLitros() {
		return litros;
	}
	public void setLitros(double litros) {
		this.litros = litros;
	}
	public double getValorTotal() {
		return valorTotal;
	}
	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}

	
	
	

}

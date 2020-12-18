package com.itau.dashcard.dto;

public class ConsolidadoStatus {
	
	private int id;
	private String nomeAgente;
	private float volume;
	private int status;
	private long operacoes;
	

	public ConsolidadoStatus(int id, String nomeAgente, float volume, int status, long operacoes) {
		super();
		this.id = id;
		this.nomeAgente = nomeAgente;
		this.volume = volume;
		this.status = status;
		this.operacoes = operacoes;
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNomeAgente() {
		return nomeAgente;
	}
	public void setNomeAgente(String nomeAgente) {
		this.nomeAgente = nomeAgente;
	}
	public float getVolume() {
		return volume;
	}
	public void setVolume(long volume) {
		this.volume = volume;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public float getOperacoes() {
		return operacoes;
	}
	public void setOperacoes(long operacoes) {
		this.operacoes = operacoes;
	}

}

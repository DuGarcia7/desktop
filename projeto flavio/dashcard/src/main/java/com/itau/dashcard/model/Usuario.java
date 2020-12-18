package com.itau.dashcard.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tbl_usuario")
public class Usuario {

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getRacf() {
		return racf;
	}

	public void setRacf(String racf) {
		this.racf = racf;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getLinkFoto() {
		return linkFoto;
	}

	public void setLinkFoto(String linkFoto) {
		this.linkFoto = linkFoto;
	}

	@Id
	@GeneratedValue (strategy=GenerationType.IDENTITY)
	@Column(name="id_usuario")
	private int id;
	
	@Column(name="nome_usuario", length=100,nullable=false)
	private String nome;
	
	@Column(name="email_usuario", length=100, nullable=false,unique=true)
	private String email;
	
	@Column(name="racf_usuario", length=7, nullable=false,unique=true)
	private String racf;
	
	@Column(name="senha_usuario",length=50,nullable=false)
	private String senha;

	@Column (name="link_foto",length=255)
	private String linkFoto;
}
package com.itau.dashcard.dao;

import org.springframework.data.repository.CrudRepository;

import com.itau.dashcard.model.*;

public interface UsuarioDAO extends CrudRepository <Usuario,Integer> {

	public Usuario findByEmailAndSenha(String email, String senha);
	
	public Usuario findByEmailOrRacf(String email, String racf);
	
}

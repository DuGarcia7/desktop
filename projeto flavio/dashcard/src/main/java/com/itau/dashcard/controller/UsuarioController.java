package com.itau.dashcard.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.itau.dashcard.dao.UsuarioDAO;
import com.itau.dashcard.model.*;

@RestController
@CrossOrigin("*")
public class UsuarioController {
	
	@Autowired
	UsuarioDAO dao;
	
	@GetMapping ("/todos")
	public ArrayList<Usuario> recuperarTodos(){
		ArrayList<Usuario> lista;
		lista = (ArrayList<Usuario>) dao.findAll();
		return lista;
		
	}
	@PostMapping("/login")
	public ResponseEntity<Usuario> login(@RequestBody Usuario dadosLogin) {		
		Usuario user = dao.findByEmailOrRacf(dadosLogin.getEmail(),dadosLogin.getRacf());
		if (user != null) {
			if (user.getSenha().equals(dadosLogin.getSenha())) {
				return ResponseEntity.ok(user);
			}
			else {
				return ResponseEntity.status(401).build();
			}
		}
		else {
			return ResponseEntity.notFound().build();
		}
	}

}

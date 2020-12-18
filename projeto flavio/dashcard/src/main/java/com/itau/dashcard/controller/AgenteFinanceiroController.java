package com.itau.dashcard.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.itau.dashcard.dao.AgenteFinanceiroDAO;
import com.itau.dashcard.model.AgenteFinanceiro;

@RestController
@CrossOrigin("*")
public class AgenteFinanceiroController {

	@Autowired
	private AgenteFinanceiroDAO dao;
	
	@GetMapping("/agentes")
	public ArrayList<AgenteFinanceiro> recuperarTodos(){
		ArrayList<AgenteFinanceiro> lista;
		lista = dao.findAllByOrderByVolumeDesc();
		return lista;
	}
	
	
}

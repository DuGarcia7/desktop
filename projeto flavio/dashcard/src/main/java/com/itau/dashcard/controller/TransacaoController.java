package com.itau.dashcard.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.itau.dashcard.dao.TransacaoDAO;
import com.itau.dashcard.dto.ConsolidadoStatus;
import com.itau.dashcard.model.AgenteFinanceiro;
import com.itau.dashcard.model.Transacao;
import com.itau.dashcard.model.Usuario;

@RestController
@CrossOrigin("*")
public class TransacaoController {
	
	@Autowired
	TransacaoDAO dao;
	
	@GetMapping ("/transacoes")
	public ArrayList<Transacao> obterTodas(){
		
		ArrayList<Transacao> lista;
		lista = (ArrayList<Transacao>)dao.findAll();
		return lista;
	}
	
	@GetMapping ("/status")
	public ArrayList<ConsolidadoStatus> obterStatusPorAgente(@RequestParam (name="id") int id){
		
		ArrayList<ConsolidadoStatus> lista;
		lista = (ArrayList<ConsolidadoStatus>)dao.recuperarTotaisPorAgente(id);
		//lista = null;
		return lista;
	}
	

}

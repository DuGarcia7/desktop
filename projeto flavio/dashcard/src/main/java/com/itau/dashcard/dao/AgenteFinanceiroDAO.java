package com.itau.dashcard.dao;

import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;

import com.itau.dashcard.model.AgenteFinanceiro;

public interface AgenteFinanceiroDAO extends CrudRepository<AgenteFinanceiro,Integer>{

		public ArrayList<AgenteFinanceiro> findAllByOrderByVolumeDesc();
}

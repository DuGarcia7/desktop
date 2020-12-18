package com.itau.dashcard.dao;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.itau.dashcard.dto.ConsolidadoStatus;
import com.itau.dashcard.model.Transacao;

public interface TransacaoDAO extends CrudRepository <Transacao,Integer> {

	//@Query (value="select id_agente,nome_agente,volume_transacional,status,count(*) operacoes from dashcard.mtb310_transaction inner join dashcard.mtb310_ag_financeiro on dashcard.mtb310_transaction.ag_financeiro = dashcard.mtb310_ag_financeiro.id_agente group by id_agente,nome_agente,volume_transacional,status",nativeQuery=true)
	@Query ("SELECT new com.itau.dashcard.dto.ConsolidadoStatus (t.agente.id, t.agente.nome, t.agente.volume, t.status,  count(t.status) )"
			+ " FROM Transacao t WHERE t.agente.id=:id GROUP BY t.status")
	public ArrayList<ConsolidadoStatus> recuperarTotaisPorAgente(@Param("id") int id);
	
	
}

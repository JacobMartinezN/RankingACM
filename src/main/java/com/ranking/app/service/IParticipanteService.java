package com.ranking.app.service;

import java.util.List;

import com.ranking.app.entity.Participante;

public interface IParticipanteService {

	public void save(Participante participante);
	
	public List<Participante> findAll();
	
	public Participante findById(Long participanteId);
}

package com.ranking.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ranking.app.dao.IParticipanteDao;
import com.ranking.app.entity.Participante;

@Service
public class ParticipanteService implements IParticipanteService {

	@Autowired
	private IParticipanteDao participanteDao;
	
	@Override
	@Transactional
	public void save(Participante participante) {
		// TODO Auto-generated method stub
		participanteDao.save(participante);
	}

	@Override
	@Transactional(readOnly=true)
	public List<Participante> findAll() {
		// TODO Auto-generated method stub
		return participanteDao.findAll();
	}

	@Override
	@Transactional
	public Participante findById(Long participanteId) {
		// TODO Auto-generated method stub
		return participanteDao.findById(participanteId).orElse(null);
	}
	
	
	
}

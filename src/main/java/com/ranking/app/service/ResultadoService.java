package com.ranking.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ranking.app.dao.IResultadoDao;
import com.ranking.app.entity.Participante;
import com.ranking.app.entity.Resultado;

@Service
public class ResultadoService implements IResultadoService {

	@Autowired
	private IResultadoDao resultadoDao;
	
	@Override
	public void save(Resultado resultado) {
		// TODO Auto-generated method stub
		this.calcularPuntaje(resultado);
		this.CalcularPuntajeTotal(resultado.getParticipante(), resultado);
		resultadoDao.save(resultado);
		
	}

	@Override
	public List<Resultado> findAll() {
		// TODO Auto-generated method stub
		return resultadoDao.findAll();
	}
	
	private void calcularPuntaje(Resultado entity) {
		switch(entity.getPuesto()) {
		case 1:
			entity.setPuntos(5);
			break;
		case 2:
			entity.setPuntos(3);
			break;
		case 3:
			entity.setPuntos(2);
			break;
		default:
			entity.setPuntos(1);
			break;
		}
	}
	
	public void CalcularPuntajeTotal (Participante participante, Resultado resultado) {
		participante.setPuntosTotales(resultado.getParticipante().getPuntosTotales() + resultado.getPuntos());
	}

}

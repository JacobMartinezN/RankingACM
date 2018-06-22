package com.ranking.app.service;

import java.util.List;

import com.ranking.app.entity.Resultado;

public interface IResultadoService {

	public void save(Resultado resultado);
	
	public List<Resultado> findAll();
}

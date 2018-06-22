package com.ranking.app.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ranking.app.entity.Resultado;

@Repository
public interface IResultadoDao extends JpaRepository<Resultado, Long> {

}

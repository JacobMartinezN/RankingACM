package com.ranking.app.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ranking.app.entity.Participante;

@Repository
public interface IParticipanteDao extends JpaRepository<Participante, Long> {

}

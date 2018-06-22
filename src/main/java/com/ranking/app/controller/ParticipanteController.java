package com.ranking.app.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.ranking.app.entity.Participante;
import com.ranking.app.service.IParticipanteService;

@Controller
@SessionAttributes("participante")
@RequestMapping(value="/participante")
public class ParticipanteController {
	
	@Autowired
	private IParticipanteService serviceParticipante;
	
	@GetMapping(value ="/listar")
	public String listar(Model model) {
		model.addAttribute("titulo", "Listado de Participantes");
		model.addAttribute("participantes", serviceParticipante.findAll());
		return "participante/listar";
	}
	
	@GetMapping(value="/crear")
	public String crear(Model model) {
		
		Participante participante = new Participante();
		model.addAttribute("titulo", "Agregar Participante");
		model.addAttribute("participante", participante);
		return "/participante/crear";
	}
	
	@PostMapping(value="/crear")
	public String guardar(Model model, @Valid Participante participante) {
		
		serviceParticipante.save(participante);
		return "redirect:/participante/listar";
	}
	
	

}

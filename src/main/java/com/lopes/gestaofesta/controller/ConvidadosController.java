package com.lopes.gestaofesta.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.lopes.gestaofesta.repository.ConvidadosRepository;

@Controller
public class ConvidadosController {

	@Autowired
	private ConvidadosRepository convidadosRepository;

	@GetMapping("/convidados")
	public ModelAndView listar() {
		ModelAndView modelAndView = new ModelAndView("ListaConvidados");

		modelAndView.addObject("convidados", convidadosRepository.findAll());

		return modelAndView;
	}

}

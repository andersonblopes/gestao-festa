package com.lopes.gestaofesta.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.lopes.gestaofesta.model.Convidado;
import com.lopes.gestaofesta.repository.ConvidadosRepository;

@Controller
@RequestMapping("/convidados")
public class ConvidadosController {

	@Autowired
	private ConvidadosRepository convidadosRepository;

	@GetMapping
	public ModelAndView listar() {
		ModelAndView modelAndView = new ModelAndView("ListaConvidados");

		modelAndView.addObject(new Convidado());
		modelAndView.addObject("convidados", convidadosRepository.findAll());

		return modelAndView;
	}

	@PostMapping
	public String salvar(Convidado convidado) {
		this.convidadosRepository.save(convidado);
		return "redirect:/convidados";
	}

}

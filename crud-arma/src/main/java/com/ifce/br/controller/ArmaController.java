package com.ifce.br.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.ifce.br.model.Arma;
import com.ifce.br.service.ArmaService;

@Controller
public class ArmaController {
	@Autowired
	private ArmaService armaService;
	
	@GetMapping("/armas")
	public String armas() {
		return "armas";
	}
	
	@GetMapping("armas/formulario")
	public String formulario() {
		return "formulario";
	}
	
	@GetMapping("/armas/salvar")
	public String salvar(Arma arma) {
		armaService.cadastrarArma(arma);
		
		return "sucesso";
		
	}

}

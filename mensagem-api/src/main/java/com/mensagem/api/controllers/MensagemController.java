package com.mensagem.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mensagem.api.entities.Mensagem;
import com.mensagem.api.services.MensagemService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/mensagem")
public class MensagemController {

	@Autowired
	private MensagemService service;

	@GetMapping
	public List<Mensagem> listar(){
		List<Mensagem> mensagem = service.listarTodos();
		return mensagem;
	}
	
	@PostMapping
	public Mensagem salvar(@Valid @RequestBody Mensagem mensagem) {
		Mensagem mensagemNova = service.salvar(mensagem);
		return mensagemNova;
	}
	
}


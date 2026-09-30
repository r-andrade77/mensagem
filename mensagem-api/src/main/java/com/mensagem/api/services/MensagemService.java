package com.mensagem.api.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mensagem.api.entities.Mensagem;
import com.mensagem.api.repositories.MensagemRepository;

@Service
public class MensagemService {
	
	@Autowired
	private MensagemRepository repository;
	
	public List<Mensagem> listarTodos(){
		return repository.findAll();
	}

	public Mensagem salvar(Mensagem mensagem ) {
		return repository.save(mensagem);
	}
	
	public void excluir(Long id) {
		repository.deleteById(id);
	}
}

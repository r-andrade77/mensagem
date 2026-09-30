package com.mensagem.api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mensagem.api.entities.Mensagem;

public interface MensagemRepository extends JpaRepository<Mensagem, Long> {

}

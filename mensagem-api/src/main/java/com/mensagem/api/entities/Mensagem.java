package com.mensagem.api.entities;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_mensagem")
public class Mensagem {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column
	private String conteudo;
	
	@Column(name = "data_hora_recebimento")
	private LocalDateTime dataHoraRecebimento;

	public Mensagem() {
		
	}
	
	public Mensagem(Long id, String conteudo, LocalDateTime dataHoraRecebimento) {
		super();
		this.id = id;
		this.conteudo = conteudo;
		this.dataHoraRecebimento = dataHoraRecebimento;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getConteudo() {
		return conteudo;
	}

	public void setConteudo(String conteudo) {
		this.conteudo = conteudo;
	}

	public LocalDateTime getDataHoraRecebimento() {
		return dataHoraRecebimento;
	}

	public void setDataHoraRecebimento(LocalDateTime dataHoraRecebimento) {
		this.dataHoraRecebimento = dataHoraRecebimento;
	}
	
	
}

package com.notas.dto;

import lombok.Data;

@Data
public class TarefaDTO {

    private Long id;
    private String nome;
    
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

}


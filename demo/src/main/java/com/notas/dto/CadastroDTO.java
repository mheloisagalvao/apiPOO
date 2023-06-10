package com.notas.dto;

import lombok.Data;

@Data
public class CadastroDTO {

    private Long id;
    private String name;
    
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getname() {
		return name;
	}
	public void setname(String name) {
		this.name = name;
	}

}

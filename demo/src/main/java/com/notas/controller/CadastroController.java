package com.notas.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.notas.model.Cadastro;
import com.notas.service.CadastroService;

@RestController
@RequestMapping("/api_cadastro")
public class CadastroController {

    private final CadastroService cadastroService;

    @Autowired
    public CadastroController(CadastroService cadastroService) {
        this.cadastroService = cadastroService;
    }
    
    @RequestMapping(value="/create", method=RequestMethod.POST)
    public ResponseEntity<Cadastro> createCadastro 
    	(@RequestBody Cadastro cadastro) {
    	return ResponseEntity.status(HttpStatus.OK).
    			body(cadastroService.createCadastro(cadastro));
    }
    
    @RequestMapping(value="/list", method=RequestMethod.GET)
    public ResponseEntity<List<Cadastro>> readCadastro() {
            return ResponseEntity.status(HttpStatus.OK)
            .body(cadastroService.getAllCadastros());
            }
            
    @RequestMapping(value="/update/{cadastroId}", method=RequestMethod.PUT)
    public ResponseEntity<Object> updateCdastro(
    @PathVariable(value = "cadastroId") Long id,
    @RequestBody Cadastro cadastro) throws NotFoundEntityException {
            return ResponseEntity.status(HttpStatus.OK)
            .body(cadastroService.updateCadastro(id, cadastro));
            }
    
            
}
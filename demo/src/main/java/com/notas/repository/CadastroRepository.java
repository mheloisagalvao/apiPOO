package com.notas.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.notas.model.Cadastro;

@Repository
public interface CadastroRepository extends JpaRepository<Cadastro, Long> {
//	List<Cadastro> findAll();
//	Optional<Cadastro> findById(Long Id);
//	Cadastro findByName(String name);
//	long countByName(String name);
//	void deleteByName(String name);
//	void deleteById(Long id);
//	boolean existsByName(String name);
}


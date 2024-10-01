package com.reuso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.reuso.entities.PessoaFisica;

public interface PessoaFisicaRepository extends JpaRepository<PessoaFisica, Long>{
	
}

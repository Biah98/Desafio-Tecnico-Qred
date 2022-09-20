package com.desafiotecnicoqred.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.desafiotecnicoqred.api.models.Smoothie;

public interface SmoothieRepository extends JpaRepository<Smoothie, Long>{
	
	//Smoothie findById(long  id);
	Smoothie findAllByNomeContainingIgnoreCase(String nome);

}

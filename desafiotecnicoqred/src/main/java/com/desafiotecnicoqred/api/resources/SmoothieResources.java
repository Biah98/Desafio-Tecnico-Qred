package com.desafiotecnicoqred.api.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.desafiotecnicoqred.api.models.Smoothie;
import com.desafiotecnicoqred.api.repository.SmoothieRepository;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping(value="/api")
public class SmoothieResources {

	@Autowired
	private SmoothieRepository smoothieRepository;
	
	@GetMapping("/smoothies")
	public ResponseEntity<List<Smoothie>> listaSmoothie(){
		return ResponseEntity.ok(smoothieRepository.findAll());
	}
	
	/* 
	@GetMapping("/smoothies/{id}")
	public Smoothie smoothieId(@PathVariable (value="id")long id){
		return smoothieRepository.findById(id);
	}
	 */
	
	
	@GetMapping("/smoothies/{nome}")
	public Smoothie smoothieNome(@PathVariable (value="nome")String nome){
		return smoothieRepository.findAllByNomeContainingIgnoreCase(nome);
	}
}	

		


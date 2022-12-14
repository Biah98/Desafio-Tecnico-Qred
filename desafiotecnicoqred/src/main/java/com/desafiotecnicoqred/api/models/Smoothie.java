package com.desafiotecnicoqred.api.models;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name="smoothie")
public class Smoothie implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@NotNull
	@Size(max = 50)
	private String nome;
	
	@Size(max = 50)
	private String ingrediente1;
	
	@Size(max = 50)
	private String ingrediente2;
	
	@Size(max = 50)
	private String ingrediente3;
	
	@Size(max = 50)
	private String ingrediente4;
	
	@Size(max = 50)
	private String ingrediente5;
	
	@Size(max = 50)
	private String ingrediente6;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getIngrediente1() {
		return ingrediente1;
	}

	public void setIngrediente1(String ingrediente1) {
		this.ingrediente1 = ingrediente1;
	}

	public String getIngrediente2() {
		return ingrediente2;
	}

	public void setIngrediente2(String ingrediente2) {
		this.ingrediente2 = ingrediente2;
	}

	public String getIngrediente3() {
		return ingrediente3;
	}

	public void setIngrediente3(String ingrediente3) {
		this.ingrediente3 = ingrediente3;
	}

	public String getIngrediente4() {
		return ingrediente4;
	}

	public void setIngrediente4(String ingrediente4) {
		this.ingrediente4 = ingrediente4;
	}

	public String getIngrediente5() {
		return ingrediente5;
	}

	public void setIngrediente5(String ingrediente5) {
		this.ingrediente5 = ingrediente5;
	}

	public String getIngrediente6() {
		return ingrediente6;
	}

	public void setIngrediente6(String ingrediente6) {
		this.ingrediente6 = ingrediente6;
	}

}

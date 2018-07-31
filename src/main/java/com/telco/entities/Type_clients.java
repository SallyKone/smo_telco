package com.telco.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;



@Entity
public class Type_clients implements Serializable  {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	@ManyToOne
	@JoinColumn(name="Utilisateurs", referencedColumnName = "id")
	private Utilisateurs utilisateurs;
	private String libelle;
	private String description;
	public Type_clients() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Type_clients(Utilisateurs utilisateurs, String libelle, String description) {
		super();
		this.utilisateurs = utilisateurs;
		this.libelle = libelle;
		this.description = description;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Utilisateurs getUtilisateurs() {
		return utilisateurs;
	}
	public void setUtilisateurs(Utilisateurs utilisateurs) {
		this.utilisateurs = utilisateurs;
	}
	public String getLibelle() {
		return libelle;
	}
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	

}

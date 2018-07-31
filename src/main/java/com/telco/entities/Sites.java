package com.telco.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Sites {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String nom;
	private String adresse;
	@ManyToOne
	@JoinColumn(name="Ville", referencedColumnName = "id")
	private Ville ville;
	@ManyToOne
	@JoinColumn(name="Clients", referencedColumnName = "id")
	private Clients clients;
	@ManyToOne
	@JoinColumn(name="Utilisateurs", referencedColumnName = "id")
	private Utilisateurs utilisateurs;
	public Sites() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Sites(String nom, String adresse, Ville ville, Clients clients, Utilisateurs utilisateurs) {
		super();
		this.nom = nom;
		this.adresse = adresse;
		this.ville = ville;
		this.clients = clients;
		this.utilisateurs = utilisateurs;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public Ville getVille() {
		return ville;
	}
	public void setVille(Ville ville) {
		this.ville = ville;
	}
	public Clients getClients() {
		return clients;
	}
	public void setClients(Clients clients) {
		this.clients = clients;
	}
	public Utilisateurs getUtilisateurs() {
		return utilisateurs;
	}
	public void setUtilisateurs(Utilisateurs utilisateurs) {
		this.utilisateurs = utilisateurs;
	}
	
	

}

package com.telco.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


@Entity
public class Clients implements Serializable {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	@ManyToOne
	@JoinColumn(name="Type_clients", referencedColumnName = "id")
	private Type_clients type_clients;
	private String nom;
	private String adresse;
	private String telephone;
	@ManyToOne
	@JoinColumn(name="Utilisateurs", referencedColumnName = "id")
	private Utilisateurs utilisateurs;
	public Clients(Type_clients type_clients, String nom, String adresse, String telephone, Utilisateurs utilisateurs) {
		super();
		this.type_clients = type_clients;
		this.nom = nom;
		this.adresse = adresse;
		this.telephone = telephone;
		this.utilisateurs = utilisateurs;
	}
	public Clients() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Type_clients getType_clients() {
		return type_clients;
	}
	public void setType_clients(Type_clients type_clients) {
		this.type_clients = type_clients;
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
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public Utilisateurs getUtilisateurs() {
		return utilisateurs;
	}
	public void setUtilisateurs(Utilisateurs utilisateurs) {
		this.utilisateurs = utilisateurs;
	}

}

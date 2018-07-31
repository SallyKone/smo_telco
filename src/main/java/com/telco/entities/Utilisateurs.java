package com.telco.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


@Entity
public class Utilisateurs implements Serializable {
	@Id
	@GeneratedValue (strategy=GenerationType.IDENTITY) 
	
	private Long id;
	@ManyToOne
	@JoinColumn(name ="groupe_utilisateurs", referencedColumnName = "id")
	private Groupe_utilisateurs groupe_utilisateurs;
	
	private String nom;
	
	private String prenom;
	
	private String dateNaissance;
	
	private String email;
	
	private String telephone;
	
	private String lieu_habitation;
	
	private String type_piece;
	public Utilisateurs() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Utilisateurs(Groupe_utilisateurs groupe_utilisateurs, String nom, String prenom, String dateNaissance, String email, String telephone, String lieu_habitation, String type_piece) {
		super();
		this.groupe_utilisateurs = groupe_utilisateurs;
		this.nom = nom;
		this.prenom = prenom;
		this.dateNaissance = dateNaissance;
		this.email = email;
		this.telephone = telephone;
		this.lieu_habitation = lieu_habitation;
		this.type_piece = type_piece;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Groupe_utilisateurs getGroupe_utilisateurs() {
		return groupe_utilisateurs;
	}
	public void setGroupe_utilisateurs(Groupe_utilisateurs groupe_utilisateurs) {
		this.groupe_utilisateurs = groupe_utilisateurs;
	}
	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getDateNaissance() {
		return dateNaissance;
	}
	public void setDateNaissance(String dateNaissance) {
		this.dateNaissance = dateNaissance;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public String getLieu_habitation() {
		return lieu_habitation;
	}
	public void setLieu_habitation(String lieu_habitation) {
		this.lieu_habitation = lieu_habitation;
	}
	public String getType_piece() {
		return type_piece;
	}
	public void setType_piece(String type_piece) {
		this.type_piece = type_piece;
	}
	

}

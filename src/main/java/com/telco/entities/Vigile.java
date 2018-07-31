package com.telco.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


@Entity
public class Vigile implements Serializable {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)	
	private Long id;
	@ManyToOne
	@JoinColumn(name ="Utilisateurs", referencedColumnName = "id")
	private Utilisateurs utilisateurs;
	@Column(name = "nom")
	private String nom;
	@Column(name = "prenom")
	private String prenom;
	@Column(name = "dateNaissance")
	private Date dateNaissance;
	@Column(name = "email")
	private String email;
	@Column(name = "telephone")
	private String telephone;
	@Column(name = "lieuHabitation")
	private String lieuHabitation;
	@Column(name = "typePiece")
	private String typePiece;
	@Column(name = "numeroPiece")
	private String numeroPiece;
	public Vigile() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Vigile(Utilisateurs utilisateurs, String nom, String prenom, Date dateNaissance, String email,
			String telephone, String lieuHabitation, String typePiece, String numeroPiece) {
		super();
		this.utilisateurs = utilisateurs;
		this.nom = nom;
		this.prenom = prenom;
		this.dateNaissance = dateNaissance;
		this.email = email;
		this.telephone = telephone;
		this.lieuHabitation = lieuHabitation;
		this.typePiece = typePiece;
		this.numeroPiece = numeroPiece;
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
	public Date getDateNaissance() {
		return dateNaissance;
	}
	public void setDateNaissance(Date dateNaissance) {
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
	public String getLieuHabitation() {
		return lieuHabitation;
	}
	public void setLieuHabitation(String lieuHabitation) {
		this.lieuHabitation = lieuHabitation;
	}
	public String getTypePiece() {
		return typePiece;
	}
	public void setTypePiece(String typePiece) {
		this.typePiece = typePiece;
	}
	public String getNumeroPiece() {
		return numeroPiece;
	}
	public void setNumeroPiece(String numeroPiece) {
		this.numeroPiece = numeroPiece;
	} 
	

}

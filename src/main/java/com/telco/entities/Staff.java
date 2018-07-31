package com.telco.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

@Entity
public class Staff implements Serializable {
	@Id
	@GeneratedValue (strategy=GenerationType.IDENTITY)
	 
	private Long id;
	@Column(name="nom", length=30)
	private String nom;
	@Column(name="prenom", length=50)
	private String prenom;
	@Temporal(TemporalType.DATE)
	private Date dateNaissance;
	private String telephone;
	@NotEmpty
 	@Email
 	@Column(name="email", length=55)
	private String email;
	@Column(name="cni", length=50)
	private String cni;
	private String photo;
	
	public Staff() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Staff(String nom, String prenom, Date dateNaissance, String telephone, String email, String cni,
			String photo) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.dateNaissance = dateNaissance;
		this.telephone = telephone;
		this.email = email;
		this.cni = cni;
		this.photo = photo;
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

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCni() {
		return cni;
	}

	public void setCni(String cni) {
		this.cni = cni;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	

}

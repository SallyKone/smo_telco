package com.telco.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


@Entity
public class Formule_paie implements Serializable {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String montant;
	private Date datePaie;
	private Date nombreHeureTravailler;
	@ManyToOne
	@JoinColumn(name="Vigile", referencedColumnName = "id")
	private Vigile vigile;
	@ManyToOne
	@JoinColumn(name="Utilisateurs", referencedColumnName = "id")
	private Utilisateurs utilisateurs;
	public Formule_paie() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Formule_paie(String montant, Date datePaie, Date nombreHeureTravailler, Vigile vigile,
			Utilisateurs utilisateurs) {
		super();
		this.montant = montant;
		this.datePaie = datePaie;
		this.nombreHeureTravailler = nombreHeureTravailler;
		this.vigile = vigile;
		this.utilisateurs = utilisateurs;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getMontant() {
		return montant;
	}
	public void setMontant(String montant) {
		this.montant = montant;
	}
	public Date getDatePaie() {
		return datePaie;
	}
	public void setDatePaie(Date datePaie) {
		this.datePaie = datePaie;
	}
	public Date getNombreHeureTravailler() {
		return nombreHeureTravailler;
	}
	public void setNombreHeureTravailler(Date nombreHeureTravailler) {
		this.nombreHeureTravailler = nombreHeureTravailler;
	}
	public Vigile getVigile() {
		return vigile;
	}
	public void setVigile(Vigile vigile) {
		this.vigile = vigile;
	}
	public Utilisateurs getUtilisateurs() {
		return utilisateurs;
	}
	public void setUtilisateurs(Utilisateurs utilisateurs) {
		this.utilisateurs = utilisateurs;
	}
	

}

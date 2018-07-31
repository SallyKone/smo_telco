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
public class Travaille implements Serializable {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private Date dateTravail;
	@ManyToOne
	@JoinColumn(name="Vigile", referencedColumnName = "id")
	private Vigile vigile;
	@ManyToOne
	@JoinColumn(name="Sites", referencedColumnName = "id")
	private Sites sites;
	@ManyToOne
	@JoinColumn(name="Utilisateurs", referencedColumnName = "id")
	private Utilisateurs utilisateurs;
	public Travaille() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Travaille(Date dateTravail, Vigile vigile, Sites sites, Utilisateurs utilisateurs) {
		super();
		this.dateTravail = dateTravail;
		this.vigile = vigile;
		this.sites = sites;
		this.utilisateurs = utilisateurs;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Date getDateTravail() {
		return dateTravail;
	}
	public void setDateTravail(Date dateTravail) {
		this.dateTravail = dateTravail;
	}
	public Vigile getVigile() {
		return vigile;
	}
	public void setVigile(Vigile vigile) {
		this.vigile = vigile;
	}
	public Sites getSites() {
		return sites;
	}
	public void setSites(Sites sites) {
		this.sites = sites;
	}
	public Utilisateurs getUtilisateurs() {
		return utilisateurs;
	}
	public void setUtilisateurs(Utilisateurs utilisateurs) {
		this.utilisateurs = utilisateurs;
	}
	

}

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
public class Pointage implements Serializable {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	private Long id;
	private Date heurePointage;
	private Boolean pointer;
	@ManyToOne
	@JoinColumn(name="Utilisateurs", referencedColumnName = "id")
	private Utilisateurs utilisateurs;
	@ManyToOne
	@JoinColumn(name="Vigile", referencedColumnName = "id")
	private Vigile vigile;
	public Pointage() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Pointage(Date heurePointage, Boolean pointer, Utilisateurs utilisateurs, Vigile vigile) {
		super();
		this.heurePointage = heurePointage;
		this.pointer = pointer;
		this.utilisateurs = utilisateurs;
		this.vigile = vigile;
		
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Date getHeurePointage() {
		return heurePointage;
	}
	public void setHeurePointage(Date heurePointage) {
		this.heurePointage = heurePointage;
	}
	public Boolean getPointer() {
		return pointer;
	}
	public void setPointer(Boolean pointer) {
		this.pointer = pointer;
	}
	public Utilisateurs getUtilisateurs() {
		return utilisateurs;
	}
	public void setUtilisateurs(Utilisateurs utilisateurs) {
		this.utilisateurs = utilisateurs;
	}
	public Vigile getVigile() {
		return vigile;
	}
	public void setVigile(Vigile vigile) {
		this.vigile = vigile;
	}
	
	
	

}

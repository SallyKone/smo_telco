package com.telco.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Messages {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	private Long id;
	@ManyToOne
	@JoinColumn(name="Clients", referencedColumnName = "id")
	private Clients clients;
	@ManyToOne
	@JoinColumn(name="Vigile", referencedColumnName = "id")
	private Vigile vigile;
	@ManyToOne
	@JoinColumn(name="Type_messages", referencedColumnName = "id")
	private Type_messages type_messages;
	private String messages;
	public Messages() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Messages(Clients clients, Vigile vigile, Type_messages type_messages, String messages) {
		super();
		this.clients = clients;
		this.vigile = vigile;
		this.type_messages = type_messages;
		this.messages = messages;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Clients getClients() {
		return clients;
	}
	public void setClients(Clients clients) {
		this.clients = clients;
	}
	public Vigile getVigile() {
		return vigile;
	}
	public void setVigile(Vigile vigile) {
		this.vigile = vigile;
	}
	public Type_messages getType_messages() {
		return type_messages;
	}
	public void setType_messages(Type_messages type_messages) {
		this.type_messages = type_messages;
	}
	public String getMessages() {
		return messages;
	}
	public void setMessages(String messages) {
		this.messages = messages;
	}
	

}

package com.telco.dao;


import java.util.Date;
import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.telco.entities.Utilisateurs;


public interface UtilisateursRepository  {
	
	/*public List<Utilisateurs> findByNom(String n);
	
	public Page<Utilisateurs> findByNom(String n, Pageable pageable);
	
	@Query("select e from Utilisateurs e where e.nom like :x")
	public Page<Utilisateurs> chercherUtilisateurs(@Param("x") String mc, Pageable pageable);
	
	@Query("select e from Utilisateurs e where e.dateNaissance >:x and e.dateNaissance <:y")
	public List<Utilisateurs> chercherUtlisateurs(@Param("x")Date d1, @Param("y")Date d2);*/
	
	

}

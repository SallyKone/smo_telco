package com.telco.dao;

import java.util.Date;
import java.util.List;


import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import com.telco.entities.Staff;




public interface StaffRepository extends JpaRepository<Staff, Long> {
	
	
	public Page<Staff> findByNom(String nom, Pageable pageable);
	@Query("select e from Staff e where e.nom like :x")
	public Page<Staff> chercherStaff(@Param("x")String mc, Pageable pageable);	
	
	@Query("select e from Staff e where e.dateNaissance >:x and e.dateNaissance <:y")
	public List<Staff> chercherStaff(@Param("x")Date d1, @Param("y")Date d2);
	
	@Query("select e from Staff e where e.id like :x")
	public Staff findOne(@Param("x")Long id);
	
	
	

}

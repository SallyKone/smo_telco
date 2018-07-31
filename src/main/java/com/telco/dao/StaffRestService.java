package com.telco.dao;

import java.util.List;

import com.telco.entities.Staff;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping(value="/staff")
public class StaffRestService {
	
	@Autowired
	private StaffRepository staffRepository;
			
	
		    //afficher tous le staff
			@RequestMapping(value="/getStaffs",method=RequestMethod.GET) 
			public List<Staff> getStaff(){
				return staffRepository.findAll();
			}
			
			//afficher le staff par identifiant
			@RequestMapping(value="/getStaffs/{id}",method=RequestMethod.GET)
			public Staff getSatff(@PathVariable ("id")Long id) {
				return staffRepository.findOne(id);
			}
					
			//Enregistrer un staff
			@RequestMapping(value="/saveStaffs", method=RequestMethod.POST) 
			public Staff save(@RequestBody Staff staff){
				return staffRepository.save(staff);
			}
			
			//supprimer un staff
			@RequestMapping(value="/deleteStaffs/{id}", method=RequestMethod.DELETE) 
			public Boolean deleteStaff(@PathVariable Staff id){
				staffRepository.delete(id);
				return true;
			}
			
			//modifier un staff
			@RequestMapping(value="/updateStaffs/{id}", method=RequestMethod.PUT) 
			public Staff update(@RequestBody Staff staff, @PathVariable Long id){
				staff.setId(id);
				return staffRepository.saveAndFlush(staff);
			}
			
			
			
}

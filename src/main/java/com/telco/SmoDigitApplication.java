package com.telco;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import com.telco.dao.StaffRepository;
import com.telco.entities.Staff;


@SpringBootApplication
public class SmoDigitApplication {

	public static void main(String[] args) throws ParseException {
		
	 ApplicationContext ctx=SpringApplication.run(SmoDigitApplication.class, args);
	 StaffRepository staffRepository=
			ctx.getBean(StaffRepository.class);
	 DateFormat df=new SimpleDateFormat("yyyy-MM-dd");
		staffRepository.save(
				new Staff ("komenan","parfait",df.parse("11-07-2018"),"56789876",
				"komenan@gmail","B6578976", "SALY.jpg" ));
		staffRepository.save(
				new Staff ("youin","nima",df.parse("11-07-2018"),"56789876",
				"nima@gmail","B6578976", "SALY.jpg" ));
		staffRepository.save(
				new Staff ("traore","Aly",df.parse("11-07-2018"),"56789876",
				"aly@gmail","B6578976", "SALY.jpg" ));
		
		@SuppressWarnings("deprecation")
		Page<Staff> etds=staffRepository.chercherStaff("%O%",new PageRequest(0, 5));
		
		etds.forEach(e->System.out.println(e.getNom()));
	}
}

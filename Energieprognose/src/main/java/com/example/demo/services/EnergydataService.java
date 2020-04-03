package com.example.demo.services;

import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
 
import com.example.demo.dao.EnergydataDao;
import com.example.demo.model.Energydata;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class EnergydataService implements ApplicationRunner{

	 private EnergydataDao energydataDAO;
	 
	 private static final DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
	
	 @Autowired
	    public EnergydataService(EnergydataDao energydataDAO) {
	        this.energydataDAO = energydataDAO;
	    }
	 
	 @Override
	    public void run(ApplicationArguments args) throws Exception {
	        long count = energydataDAO.count();

	        Energydata e1 = new Energydata();
	 
	        e1.setCosPhi(2);
	        Date d1 = df.parse("2020-04-04");
	        e1.setDateTime(d1);
	        e1.setPower(24000);
	        e1.setIdFacility(1L);
	        energydataDAO.save(e1);
	      

	 
	    }
	 
}

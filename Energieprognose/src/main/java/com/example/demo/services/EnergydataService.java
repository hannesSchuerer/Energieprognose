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

	        if (count == 0) {
	            Energydata e1 = new Energydata();
	 
	            e1.setCosPhi(10000);
	            Date d1 = df.parse("1980-12-20");
	            e1.setDateTime(d1);
	 
	            energydataDAO.save(e1);
	      
	        }
	 
	    }
	 
}

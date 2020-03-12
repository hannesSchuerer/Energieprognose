package com.example.demo.dao;

import java.util.Date;
import java.util.List;
 
import com.example.demo.model.Energydata;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnergydataDao extends CrudRepository<Energydata, Long>{
	 
    public List<Energydata> findBydateTimeGreaterThan(Date date);
    public List<Energydata> findBycosPhiGreaterThan(Integer cosPhi);
    public List<Energydata> findBypowerGreaterThan(Integer power);
    public List<Energydata> findByidFacilityGreaterThan(Long idFacility);
	
}

package com.fortna.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.fortna.entity.Edidc40;

public interface EdidcRepo extends CrudRepository<Edidc40, Long> {
	
	
	
	@Query("select dm from Edidc40 dm where lower(dm.mesTyp)=lower(:message)")
	List<Edidc40> getDeliveryMessage(@Param("message") String message);
}

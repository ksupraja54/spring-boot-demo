package com.fortna.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.fortna.entity.EsbShpConIDoc;
@Repository
public interface EsbShpConIDocRepo extends CrudRepository<EsbShpConIDoc, Long> {

}

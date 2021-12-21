package tn.spring.mongo.dao;

import java.util.Date;

import java.util.List;


import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;

import tn.spring.mongo.entites.Coli;





public interface ColiRepository extends MongoRepository<Coli, String>{

	
	
	
	


}

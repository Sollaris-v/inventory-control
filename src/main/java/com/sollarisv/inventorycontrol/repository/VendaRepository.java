package com.sollarisv.inventorycontrol.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.sollarisv.inventorycontrol.domain.Venda;

@Repository
public interface VendaRepository extends MongoRepository<Venda, String> {
	
	

}

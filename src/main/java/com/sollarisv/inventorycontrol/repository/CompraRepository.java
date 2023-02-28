package com.sollarisv.inventorycontrol.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.sollarisv.inventorycontrol.domain.Compra;

@Repository
public interface CompraRepository extends MongoRepository<Compra, String> {
	
	@Query("{ 'title': { $regex: ?0, $options: 'i' } }")
	List<Compra> buscaFornecedor(String text);
	

	List<Compra> buscarFornecedorIgnoreCase(String text);
	

}

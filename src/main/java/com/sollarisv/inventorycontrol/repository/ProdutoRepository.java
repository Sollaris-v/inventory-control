package com.sollarisv.inventorycontrol.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.sollarisv.inventorycontrol.domain.Produto;

@Repository
public interface ProdutoRepository extends MongoRepository<Produto, String> {

}

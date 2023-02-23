package com.sollarisv.inventorycontrol.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sollarisv.inventorycontrol.domain.Produto;
import com.sollarisv.inventorycontrol.repository.ProdutoRepository;

@Service
public class ProdutoService {
	
	@Autowired
	private ProdutoRepository repo;
	
	public List<Produto> findAll(){
		return repo.findAll();
	}

}

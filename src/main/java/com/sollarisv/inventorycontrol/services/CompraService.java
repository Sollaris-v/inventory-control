package com.sollarisv.inventorycontrol.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.sollarisv.inventorycontrol.domain.Compra;
import com.sollarisv.inventorycontrol.repository.CompraRepository;
import com.sollarisv.inventorycontrol.services.exception.ObjectNotFoundException;

@Service
public class CompraService {
	
	private CompraRepository repo;
	
	public List<Compra> findAll(){
		return repo.findAll();
	}
	
	public Compra findById(String id) {
		Optional<Compra> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado!"));
		}

	public Compra insert(Compra obj) {
		return repo.insert(obj);
	}
	
	
}

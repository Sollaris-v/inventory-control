package com.sollarisv.inventorycontrol.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.sollarisv.inventorycontrol.domain.Venda;
import com.sollarisv.inventorycontrol.repository.VendaRepository;
import com.sollarisv.inventorycontrol.services.exception.ObjectNotFoundException;

@Service
public class VendaService {
	
	private VendaRepository repo;
	
	public List<Venda> findAll(){
		return repo.findAll();
	}
	
	public Venda findById(String id) {
		Optional<Venda> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado!"));
		}

	public Venda insert(Venda obj) {
		return repo.insert(obj);
	}
	
	
}


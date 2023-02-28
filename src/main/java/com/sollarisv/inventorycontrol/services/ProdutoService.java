package com.sollarisv.inventorycontrol.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sollarisv.inventorycontrol.domain.Produto;
import com.sollarisv.inventorycontrol.dto.ProdutoDTO;
import com.sollarisv.inventorycontrol.repository.ProdutoRepository;
import com.sollarisv.inventorycontrol.services.exception.ObjectNotFoundException;

@Service
public class ProdutoService {
	
	@Autowired
	private ProdutoRepository repo;
	
	public List<Produto> findAll(){
		return repo.findAll();
	}
	
	public Produto findById(String id) {
		Optional<Produto> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado!"));
		}
	
	public Produto insert(Produto obj) {
		return repo.insert(obj);
	}
	
	public void delete(String id) {
		findById(id);
		repo.deleteById(id);
	}
	
	public Produto fromDTO(ProdutoDTO objDto) {
		return new Produto(objDto.getIdProd(), objDto.getNomeProd(), objDto.getCodigoProd(), objDto.getTotalEstoque());
	}
	
	public Produto update(Produto obj) {
		Produto newObj = findById(obj.getIdProd());
		updateData(newObj, obj);
		return repo.save(newObj);
	}

	private void updateData(Produto newObj, Produto obj) {
		newObj.setNomeProd(obj.getNomeProd());
		newObj.setCodigoProd(obj.getCodigoProd());
		
	}

}

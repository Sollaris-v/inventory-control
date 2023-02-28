package com.sollarisv.inventorycontrol.resources;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sollarisv.inventorycontrol.domain.Compra;
import com.sollarisv.inventorycontrol.resources.util.URL;
import com.sollarisv.inventorycontrol.services.CompraService;

@RestController
@RequestMapping(value="/compras")
public class CompraResource {
	
	@Autowired
	private CompraService service;
	
	@RequestMapping(value="/{id}", method=RequestMethod.GET)
 	public ResponseEntity<Compra> findById(@PathVariable String id) {
		Compra obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}
	
	
	/*
	@RequestMapping(value="/titlesearch", method=RequestMethod.GET)
 	public ResponseEntity<List<Compra>> findByTitle(@RequestParam(value="text", defaultValue="") String text) {
		text = URL.decodeParam(text);
		List<Compra> list = service.findByTitle(text);
		return ResponseEntity.ok().body(list);
	}
	*/

		

}

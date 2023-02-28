package com.sollarisv.inventorycontrol.config;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.TimeZone;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.sollarisv.inventorycontrol.domain.Compra;
import com.sollarisv.inventorycontrol.domain.Produto;
import com.sollarisv.inventorycontrol.dto.ProdRefDTO;
import com.sollarisv.inventorycontrol.repository.CompraRepository;
import com.sollarisv.inventorycontrol.repository.ProdutoRepository;
import com.sollarisv.inventorycontrol.repository.VendaRepository;

@Configuration
public class Instantiation implements CommandLineRunner {
	
	@Autowired
	private ProdutoRepository produtoRepository;
	
	@Autowired
	private CompraRepository compraRepository;
	
	@Autowired
	private VendaRepository vendaRepository;

	@Override
	public void run(String... args) throws Exception {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		sdf.setTimeZone(TimeZone.getTimeZone("GMT"));
		
		produtoRepository.deleteAll();
		compraRepository.deleteAll();
		vendaRepository.deleteAll();
		
		
		Produto livro = new Produto(null, "Harry Potter", "FGR134", 100);
		Produto celular = new Produto(null, "S22", "FED345", 500);
		Produto caneca = new Produto(null, "IloveU", "DRT542", 300);
		
		produtoRepository.saveAll(Arrays.asList(livro, celular, caneca));
		
		
		Compra compra1 = new Compra(null, 50, "Francs", 300.00, sdf.parse("20/02/2023"), new ProdRefDTO(caneca));
		
		
	}

}

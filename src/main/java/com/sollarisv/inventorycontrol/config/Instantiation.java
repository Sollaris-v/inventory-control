package com.sollarisv.inventorycontrol.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.sollarisv.inventorycontrol.domain.Produto;
import com.sollarisv.inventorycontrol.repository.ProdutoRepository;

@Configuration
public class Instantiation implements CommandLineRunner {
	
	@Autowired
	private ProdutoRepository produtoRepository;

	@Override
	public void run(String... args) throws Exception {
		
		produtoRepository.deleteAll();
		
		Produto livro = new Produto(null, "Harry Potter", "FGR134");
		Produto celular = new Produto(null, "S22", "FED345");
		
		produtoRepository.saveAll(Arrays.asList(livro, celular));
		
	}

}

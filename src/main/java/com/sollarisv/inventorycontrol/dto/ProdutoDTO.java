package com.sollarisv.inventorycontrol.dto;

import com.sollarisv.inventorycontrol.domain.Produto;

public class ProdutoDTO {
	
	private String idProd;
	private String nomeProd;
	private String codigoProd;
	
	public ProdutoDTO() {
		
	}
	
	public ProdutoDTO(Produto obj) {
		idProd = obj.getIdProd();
		nomeProd = obj.getNomeProd();
		codigoProd = obj.getCodigoProd();
	}

	public String getIdProd() {
		return idProd;
	}

	public void setIdProd(String idProd) {
		this.idProd = idProd;
	}

	
	
	public String getNomeProd() {
		return nomeProd;
	}

	public void setNomeProd(String nomeProd) {
		this.nomeProd = nomeProd;
	}

	public String getCodigoProd() {
		return codigoProd;
	}

	public void setCodigoProd(String codigoProd) {
		this.codigoProd = codigoProd;
	}
	
	

}

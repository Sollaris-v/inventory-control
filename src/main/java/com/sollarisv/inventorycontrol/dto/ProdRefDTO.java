package com.sollarisv.inventorycontrol.dto;

import com.sollarisv.inventorycontrol.domain.Produto;

public class ProdRefDTO {
	
	private String idProd;
	private String codigoProd;
	
public ProdRefDTO() {
		
	}

public ProdRefDTO(Produto obj) {
	idProd = obj.getIdProd();
	codigoProd = obj.getCodigoProd();
}


public String getIdProd() {
	return idProd;
}

public void setIdProd(String idProd) {
	this.idProd = idProd;
}

public String getCodigoProd() {
	return codigoProd;
}

public void setCodigoProd(String codigoProd) {
	this.codigoProd = codigoProd;
}



}

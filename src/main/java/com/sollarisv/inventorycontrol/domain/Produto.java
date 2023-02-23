package com.sollarisv.inventorycontrol.domain;

import java.util.Objects;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="produto")
public class Produto {
	
	@Id
	private String idProd;
	private String nomeProd;
	private String codigoProd;
	
	public Produto() {
		
	}

	public Produto(String idProd, String nomeProd, String codigoProd) {
		super();
		this.idProd = idProd;
		this.nomeProd = nomeProd;
		this.codigoProd = codigoProd;
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

	@Override
	public int hashCode() {
		return Objects.hash(idProd);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Produto other = (Produto) obj;
		return Objects.equals(idProd, other.idProd);
	}
	
	

}

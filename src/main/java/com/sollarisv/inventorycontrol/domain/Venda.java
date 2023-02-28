package com.sollarisv.inventorycontrol.domain;

import java.util.Date;
import java.util.Objects;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.sollarisv.inventorycontrol.dto.ProdRefDTO;

@Document(collection="venda")
public class Venda {
	
	@Id
	private String idVenda;
	private int quantVenda;
	private Date dataVenda;
	private ProdRefDTO produto;
	
	
	public Venda() {
		
	}


	public Venda(String idVenda, int quantVenda, Date dataVenda, ProdRefDTO produto) {
		super();
		this.idVenda = idVenda;
		this.quantVenda = quantVenda;
		this.dataVenda = dataVenda;
		this.produto = produto;
	}


	public String getIdVenda() {
		return idVenda;
	}


	public void setIdVenda(String idVenda) {
		this.idVenda = idVenda;
	}


	public int getQuantVenda() {
		return quantVenda;
	}


	public void setQuantVenda(int quantVenda) {
		this.quantVenda = quantVenda;
	}


	public Date getDataVenda() {
		return dataVenda;
	}


	public void setDataVenda(Date dataVenda) {
		this.dataVenda = dataVenda;
	}


	public ProdRefDTO getProduto() {
		return produto;
	}


	public void setProduto(ProdRefDTO produto) {
		this.produto = produto;
	}


	@Override
	public int hashCode() {
		return Objects.hash(idVenda);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Venda other = (Venda) obj;
		return Objects.equals(idVenda, other.idVenda);
	}
	
	

}

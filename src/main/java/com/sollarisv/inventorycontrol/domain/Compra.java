package com.sollarisv.inventorycontrol.domain;

import java.util.Date;
import java.util.Objects;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.sollarisv.inventorycontrol.dto.ProdRefDTO;


@Document(collection="compra")
public class Compra {
	
	@Id
	private String idCompra;
	private int quantComprada;
	private String fornecedor;
	private double valorPago;
	private Date dataCompra;
	private ProdRefDTO produto;
	
	
	
	public Compra () {
		
	}



	public Compra(String idCompra, int quantComprada, String fornecedor, double valorPago, Date dataCompra,
			ProdRefDTO produto) {
		super();
		this.idCompra = idCompra;
		this.quantComprada = quantComprada;
		this.fornecedor = fornecedor;
		this.valorPago = valorPago;
		this.dataCompra = dataCompra;
		this.produto = produto;
	}



	public String getIdCompra() {
		return idCompra;
	}



	public void setIdCompra(String idCompra) {
		this.idCompra = idCompra;
	}



	public int getQuantComprada() {
		return quantComprada;
	}



	public void setQuantComprada(int quantComprada) {
		this.quantComprada = quantComprada;
	}



	public String getFornecedor() {
		return fornecedor;
	}



	public void setFornecedor(String fornecedor) {
		this.fornecedor = fornecedor;
	}



	public double getValorPago() {
		return valorPago;
	}



	public void setValorPago(double valorPago) {
		this.valorPago = valorPago;
	}



	public Date getDataCompra() {
		return dataCompra;
	}



	public void setDataCompra(Date dataCompra) {
		this.dataCompra = dataCompra;
	}



	public ProdRefDTO getProduto() {
		return produto;
	}



	public void setProduto(ProdRefDTO produto) {
		this.produto = produto;
	}



	@Override
	public int hashCode() {
		return Objects.hash(idCompra);
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Compra other = (Compra) obj;
		return Objects.equals(idCompra, other.idCompra);
	}







}

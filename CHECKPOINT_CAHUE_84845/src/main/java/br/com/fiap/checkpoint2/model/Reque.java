package br.com.fiap.checkpoint2.model;

import java.math.BigDecimal;
import java.time.Instant;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "requests")
public class Reque {
	
	@Id
	@GeneratedValue
	private Long id;
	
	private Instant datReque;
	private Long codClient;
	private Instant datRegist;
	private BigDecimal totVal;
	
	public Reque() {}
	
	public Reque(Instant datReque, Long codClient, Instant datRegist, BigDecimal totVal) {
		this.datReque = datReque;
		this.codClient = codClient;
		this.datRegist = datRegist;
		this.totVal = totVal;
	}
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public Instant getDatReque() {
		return datReque;
	}
	public void setDatReque(Instant datReque) {
		this.datReque = datReque;
	}
	public Long getClientCod() {
		return codClient;
	}
	public void setClientCod(Long codClient) {
		this.codClient = codClient;
	}
	public Instant getDatRegist() {
		return datRegist;
	}
	public void setDatRegist(Instant datRegist) {
		this.datRegist = datRegist;
	}
	public BigDecimal getTotVal() {
		return totVal;
	}
	public void setTotVal(BigDecimal totVal) {
		this.totVal = totVal;
	}

}

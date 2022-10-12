package br.com.fiap.checkpoint2.dto;

import java.math.BigDecimal;
import java.time.Instant;

public class RequeCreationDto {

	private Instant requestDate;
	private Long clienteCod;
	private Instant registerDate;
	private BigDecimal totVal;
	
	public Instant getRequeDat() {
		return requestDate;
	}
	public void setRequeDate(Instant requestDate) {
		this.requestDate = requestDate;
	}
	public Long getClientCod() {
		return clienteCod;
	}
	public void setClientCod(Long clienteCod) {
		this.clienteCod = clienteCod;
	}
	public Instant getRegisterDat () {
		return registerDate;
	}
	public void setRegisterDat(Instant registerDate) {
		this.registerDate = registerDate;
	}
	public BigDecimal getTotVal() {
		return totVal;
	}
	public void setTotVal(BigDecimal totVal) {
		this.totVal = totVal;
	}
	
}

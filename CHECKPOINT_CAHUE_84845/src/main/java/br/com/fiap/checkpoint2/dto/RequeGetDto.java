package br.com.fiap.checkpoint2.dto;

import java.util.List;

import br.com.fiap.checkpoint2.model.Reque;

public class RequeGetDto {
	
	private List<Reque> listRequest;
	
	public RequeGetDto(List<Reque> requests) {
		this.listRequest = requests;
	}

	public List<Reque> getRequestList() {
		return listRequest;
	}

	public void setRequestList(List<Reque> requestList) {
		this.listRequest = requestList;
	}
	
}

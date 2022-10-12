package br.com.fiap.checkpoint2.command;

import java.util.List;

import br.com.fiap.checkpoint2.model.Reque;
import br.com.fiap.checkpoint2.repository.RequRepo;


public class CommandList {
	
	private RequRepo repository;
	
	public CommandList(RequRepo repository) {
		this.repository = repository;
	}
	
	public List<Reque> list() {
		return repository.findAll();
		}
	
	public Reque create(Reque reque) {
		try {
			return repository.save(reque);
		} catch(Exception e) {
			System.out.println("ERRO: " + e);
			return null;
		}
	}
	
	public String delete(Long id) {
		try {
			repository.deleteById(id);
		}
		catch(Exception e) {
			return "ERRO: " + e;
		}
		
		return "Request " + id + " deleted";
	}

	public Reque update(Long id, Reque requestAlt) {
		try {
			Reque newRequest = repository.getById(id);
			if (requestAlt.getClientCod() != null)
				newRequest.setClientCod(requestAlt.getClientCod());
			if (requestAlt.getDatRegist() != null)
				newRequest.setDatRegist(requestAlt.getDatRegist());
			if (requestAlt.getDatReque() != null)
				newRequest.setDatReque(requestAlt.getDatReque());
			if (requestAlt.getTotVal() != null)
				newRequest.setTotVal(requestAlt.getTotVal());
			return repository.save(newRequest);
		} catch(Exception e) {
			System.out.println("ERRO: " + e);
			return null;
		}
	}
	
}

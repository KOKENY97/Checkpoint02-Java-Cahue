package br.com.fiap.checkpoint2.dto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.fiap.checkpoint2.model.Reque;
import br.com.fiap.checkpoint2.repository.RequRepo;

@Service
public class RequeService {

	@Autowired
	private RequRepo requestRepository;
	
	public void delete(Long id) {
			requestRepository.deleteById(id);
	}
	
	public Reque add(Reque pedido) {
		return requestRepository.save(pedido);
	}
	
	public Reque edit(Reque pedido) {
		return requestRepository.save(pedido);
	}
	
	public RequeGetDto get() {
		return new RequeGetDto(requestRepository.findAll());
	}
}

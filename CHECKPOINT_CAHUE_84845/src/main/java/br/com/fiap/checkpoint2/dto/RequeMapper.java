package br.com.fiap.checkpoint2.dto;

import org.springframework.stereotype.Component;

import br.com.fiap.checkpoint2.model.Reque;

@Component
public class RequeMapper {
	
	public Reque toReque(RequeCreationDto dto) {
		
		return new Reque(dto.getRequeDat(), dto.getClientCod(), dto.getRequeDat(), dto.getTotVal());
	}

}

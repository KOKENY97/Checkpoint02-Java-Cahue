package br.com.fiap.checkpoint2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.fiap.checkpoint2.dto.RequeCreationDto;
import br.com.fiap.checkpoint2.dto.RequeGetDto;
import br.com.fiap.checkpoint2.dto.RequeIdDto;
import br.com.fiap.checkpoint2.dto.RequeMapper;
import br.com.fiap.checkpoint2.dto.RequeService;
import br.com.fiap.checkpoint2.model.Reque;

@RestController
@RequestMapping("api/requests")
public class RequeController {
	@Autowired
	private RequeService requeService;
	@Autowired
	private RequeMapper requeMapper;
	@DeleteMapping ("/{id}")
	public RequeIdDto deleteReque(@PathVariable Long id) {
		requeService.delete(id);
		return new RequeIdDto(id);
	}
	
	@PutMapping ("/{id}")
	public RequeIdDto updateReque(@PathVariable Long id ,@RequestBody RequeCreationDto requeDto) {
		Reque request = requeMapper.toReque(requeDto);
		request.setId(id);
		Reque editReque = requeService.edit(request);
		return new RequeIdDto(editReque.getId());
	}
	
	@PostMapping
	public RequeIdDto createReque(@RequestBody RequeCreationDto requestDto) {
		Reque reque = requeMapper.toReque(requestDto);
		Reque newReque = requeService.add(reque);
		return new RequeIdDto(newReque.getId());
	}
	
	@GetMapping
	public RequeGetDto getReque() {
		return requeService.get();
		
	}	
}

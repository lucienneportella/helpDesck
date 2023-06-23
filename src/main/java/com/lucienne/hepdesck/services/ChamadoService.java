package com.lucienne.hepdesck.services;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.lucienne.hepdesck.domain.Chamado;
import com.lucienne.hepdesck.repository.ChamadoRepository;
import com.lucienne.hepdesck.services.exceptions.ObjetcNotFoundException;

@Service
public class ChamadoService {
	
	@Autowired
	private ChamadoRepository repository;
	
	public Chamado findById(Integer id) {
		Optional<Chamado> obj = repository.findById(id);
		return obj.orElseThrow(() -> new ObjetcNotFoundException("Objeto não encontrado! ID: " + id));
		
	}

}

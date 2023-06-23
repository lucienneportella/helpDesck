package com.lucienne.hepdesck.services;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lucienne.hepdesck.domain.Chamado;
import com.lucienne.hepdesck.domain.Cliente;
import com.lucienne.hepdesck.domain.Tecnico;
import com.lucienne.hepdesck.domain.enums.Perfil;
import com.lucienne.hepdesck.domain.enums.Prioridade;
import com.lucienne.hepdesck.domain.enums.Status;
import com.lucienne.hepdesck.repository.ChamadoRepository;
import com.lucienne.hepdesck.repository.PessoaRepository;


@Service
public class DBService {
	
	@Autowired
	private ChamadoRepository chamadoRepository;
	
	@Autowired
	private PessoaRepository pessoaRepository;
	
	public void instanciaDB() {
		Tecnico tec1 = new Tecnico(null, "Lucienne", "77190806024", "lu@email.com", "123");
		tec1.addPerfil(Perfil.ADMIN);
		Tecnico tec2 = new Tecnico(null, "Guilherme", "77190806234", "gui@email.com", "123");
		tec2.addPerfil(Perfil.CLIENTE);
		
		Cliente cli1 = new Cliente(null, "Linus Torvalds", "05506620063", "linus@email.com", "123");
		Cliente cli2 = new Cliente(null, "Jose", "0550662012", "ze@email.com", "123");
		Chamado c1 = new Chamado(null, Prioridade.MEDIA, Status.ANDAMENTO, "Chamado 01", "Primeiro chamado", tec1, cli1);
		Chamado c2 = new Chamado(null, Prioridade.MEDIA, Status.ANDAMENTO, "Chamado 02", "Primeiro chamado", tec2, cli2);

		
		pessoaRepository.saveAll(Arrays.asList(tec1, tec2, cli1));
		chamadoRepository.saveAllAndFlush(Arrays.asList(c1, c2));
		
	}

}

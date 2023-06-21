package com.lucienne.hepdesck;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.lucienne.hepdesck.domain.Chamado;
import com.lucienne.hepdesck.domain.Cliente;
import com.lucienne.hepdesck.domain.Tecnico;
import com.lucienne.hepdesck.domain.enums.Perfil;
import com.lucienne.hepdesck.domain.enums.Prioridade;
import com.lucienne.hepdesck.domain.enums.Status;
import com.lucienne.hepdesck.repository.ChamadoRepository;
import com.lucienne.hepdesck.repository.ClienteRepository;
import com.lucienne.hepdesck.repository.TecnicoRepository;

@SpringBootApplication
public class HelpdesckApplication  implements CommandLineRunner{
	
	@Autowired
	private TecnicoRepository tecnicoRepository;
	@Autowired
	private ClienteRepository clienteRepository;
	@Autowired
	private ChamadoRepository chamadoRepository;

	public static void main(String[] args) {
		SpringApplication.run(HelpdesckApplication.class, args);
	}
	
	//vai rodar sempre que startar a aplicação
	@Override
	public void run(String... args) throws Exception {
		Tecnico tec1 = new Tecnico(null, "Lucienne", "77190806024", "lu@email.com", "123");
		tec1.addPerfil(Perfil.ADMIN);
		
		Cliente cli1 = new Cliente(null, "Linus Torvalds", "05506620063", "linus@email.com", "123");
		
		Chamado c1 = new Chamado(null, Prioridade.MEDIA, Status.ANDAMENTO, "Chamado 01", "Primeiro chamado", tec1, cli1);
		
		tecnicoRepository.saveAll(Arrays.asList(tec1));
		clienteRepository.saveAll(Arrays.asList(cli1));
		chamadoRepository.saveAll(Arrays.asList(c1));
		
	}

}

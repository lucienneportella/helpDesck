package com.lucienne.hepdesck.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lucienne.hepdesck.domain.Cliente;

public interface PessoaRepository extends JpaRepository<Cliente, Integer>{

}

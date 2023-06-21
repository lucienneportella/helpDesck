package com.lucienne.hepdesck.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lucienne.hepdesck.domain.Pessoa;

public interface ClienteRepository extends JpaRepository<Pessoa, Integer>{

}

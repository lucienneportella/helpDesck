package com.lucienne.hepdesck.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.lucienne.hepdesck.services.DBService;

@Configuration
@Profile("test")
public class TestConfig {
	
	@Autowired
	private DBService dbService;
	
	public void instanciaDB() {
		this.dbService.instanciaDB();
	}

}

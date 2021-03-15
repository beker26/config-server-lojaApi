package com.example.configserverloja;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class ConfigServerLojaApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigServerLojaApplication.class, args);
	}

}

package com.neo.configserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class BootConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootConfigServerApplication.class, args);
	}

}

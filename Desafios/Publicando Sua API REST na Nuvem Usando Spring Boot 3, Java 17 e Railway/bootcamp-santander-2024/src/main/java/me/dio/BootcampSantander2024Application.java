package me.dio;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.servers.Server;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@OpenAPIDefinition(servers = { @Server(url = "/", description = "Default Servr URL")})
@SpringBootApplication
public class BootcampSantander2024Application {

	public static void main(String[] args) {
		SpringApplication.run(BootcampSantander2024Application.class, args);
	}

}

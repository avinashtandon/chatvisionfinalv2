package com.chatvisionfinal;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.servers.Server;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition(
		info = @Info(
				title = "Vision Chat OpenApi",
				version = "1.0.0",
				description = "Chat OpenAPI Documentation"
		),
		servers =@Server(
				url = "http://localhost:8080"


		)
)
public class ChatvisionfinalApplication {

	public static void main(String[] args) {
		SpringApplication.run(ChatvisionfinalApplication.class, args);
	}

}

package br.com.petz.clientpet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/")
public class ClientPetApplication {
	
	public String getHomeTeste() {
		return "Cliente Pet - API Home";
	}

	public static void main(String[] args) {
		SpringApplication.run(ClientPetApplication.class, args);
	}

}

package br.com.deezer.daniloAPI;

import br.com.deezer.daniloAPI.Principal.Principal;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DaniloApiApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(DaniloApiApplication.class, args);
	}

    @Override
    public void run(String... args)throws Exception {
    Principal principal = new Principal();
    principal.menu();
    }

}


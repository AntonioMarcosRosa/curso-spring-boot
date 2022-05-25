package com.github.antoniomarcosrosa;

import com.github.antoniomarcosrosa.model.Cliente;
import com.github.antoniomarcosrosa.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class VendasApplication {

    @Bean
    public CommandLineRunner init(@Autowired ClienteRepository clienteRepository) {
        return args -> {
            Cliente cliente = new Cliente();
            cliente.setNome("Antônio");
            clienteRepository.save(cliente);

            Cliente cliente2 = new Cliente();
            cliente2.setNome("João");
            clienteRepository.save(cliente2);

            Cliente cliente3 = new Cliente();
            cliente3.setNome("Daiane");
            clienteRepository.save(cliente3);

            System.out.println(clienteRepository.buscarPorNome("Antônio"));

        };
    }

    public static void main(String[] args) {
        SpringApplication.run(VendasApplication.class, args);
    }
}

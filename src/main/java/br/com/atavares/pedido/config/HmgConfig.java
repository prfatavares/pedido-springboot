package br.com.atavares.pedido.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import br.com.atavares.pedido.entities.User;
import br.com.atavares.pedido.repositories.UserRepository;

@Configuration
@Profile("hmg")
public class HmgConfig implements CommandLineRunner {

 @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {
       
        User u1 = new User(null, "Maria Brown", "maria@gmail.com", "988888888", "123456");
        User u2 = new User(null, "Alex Green", "alex@gmail.com", "977777777", "123456");
        User u3 = new User(null, "Alexandre Tavares", "alexandre@atavares.com.br", "24992664385", "987654");

        userRepository.saveAll(Arrays.asList(u1, u2, u3));

    }

}

package com.example.springsecurity;

import com.example.springsecurity.domain.Livro;
import com.example.springsecurity.repository.LivroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class SpringSecurityApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(SpringSecurityApplication.class, args);
    }


    @Autowired
    private LivroRepository livroRepository;

    @Override
    public void run(String... args) throws Exception {

        Livro livro = new Livro("Game of trones", "Esqueci", "2000");
        Livro livro2 = new Livro("Naruto Shippuden", "Kishimoto", "2007");
        Livro livro3 = new Livro("Guerras secretas", "Marvel", "2015");

        livroRepository.saveAll(Arrays.asList(livro, livro2, livro3));

    }
}

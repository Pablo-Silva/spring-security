package com.example.springsecurity.controller;

import com.example.springsecurity.domain.Livro;
import com.example.springsecurity.repository.LivroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin
@RestController
public class LivroController {

    @Autowired
    private LivroRepository livroRepository;

    public LivroController(LivroRepository livroRepository) {
        this.livroRepository = livroRepository;
    }

    @GetMapping("/livros")
    public List<Livro> getAllLivros(){
        return livroRepository.findAll();
    }

    @PostMapping("/livros/save")
    public Livro save(@RequestBody Livro livro){
        return livroRepository.save(livro);
    }

    @GetMapping("/livros/{id}")
    public Optional<Livro> getByIdLivro(@PathVariable Integer id){
        return livroRepository.findById(id);
    }

    @PutMapping("/livros/update")
    public Livro updadeLivro(@RequestBody Livro livro){
        return livroRepository.saveAndFlush(livro);
    }

    @DeleteMapping("/livros/{id}")
    public void deleteLivro(@PathVariable Integer id){
        livroRepository.deleteById(id);
    }
}

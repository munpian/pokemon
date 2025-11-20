package com.example.pokemon.controller;

import com.example.pokemon.entity.Monster;
import com.example.pokemon.repository.MonsterRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/test")
public class MonsterController {

    private final MonsterRepository repository;

    public MonsterController(MonsterRepository repository) {
        this.repository = repository;
    }

    @PostMapping("/add")
    public Monster add(@RequestParam String name) {
        Monster m = new Monster();
        m.setName(name);
        return repository.save(m);
    }

    @GetMapping("/all")
    public List<Monster> all() {
        return repository.findAll();
    }
}

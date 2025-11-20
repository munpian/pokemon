package com.example.pokemon.repository;

import com.example.pokemon.entity.Monster;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MonsterRepository extends JpaRepository<Monster, Long> {
}
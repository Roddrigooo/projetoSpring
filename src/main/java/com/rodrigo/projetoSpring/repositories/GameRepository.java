package com.rodrigo.projetoSpring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rodrigo.projetoSpring.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {

}

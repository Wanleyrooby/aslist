package com.alexisfamily.aflist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alexisfamily.aflist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long>{
	
}

package com.alexisfamily.aflist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alexisfamily.aflist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long>{
	
}

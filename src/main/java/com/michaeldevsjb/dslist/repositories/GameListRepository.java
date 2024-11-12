package com.michaeldevsjb.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.michaeldevsjb.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long> {

}

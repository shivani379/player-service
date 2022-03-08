package com.abc.player.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.abc.player.entity.PlayerEntity;

public interface PlayerRepository extends JpaRepository<PlayerEntity, Integer> {

}

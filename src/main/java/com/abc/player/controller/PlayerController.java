package com.abc.player.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.abc.player.model.Player;
import com.abc.player.service.PlayerService;

@RestController
@RequestMapping("/player")
public class PlayerController {
	
	@Autowired
	private PlayerService playerService;
	
	@PostMapping("/save")
	public ResponseEntity<Player> addPlayer(@RequestBody Player player)
	{
		Player newPlayer = playerService.savePlayer(player);
		return new ResponseEntity<Player>(newPlayer, HttpStatus.CREATED);
	}
	
	@GetMapping("/get/all")
	public List<Player> getAllPlayerDetails()
	{
		return playerService.getAllPlayer();
	}
	
	@GetMapping("/get/{player_id}")
	public ResponseEntity<?> getPlayerDetailsById(@PathVariable("player_id") int playerid)
	{
		Player playerDetails = playerService.getPlayerById(playerid);
		return new ResponseEntity<>(playerDetails, HttpStatus.OK);
	}
	
	@DeleteMapping("/delete/{playerid}")
	public void deletePlayer(@PathVariable("playerid") int playerid)
	{
		playerService.deletePlayer(playerid);
	}
	
	@PutMapping("/update}")
	public Player updatePlayer(Player player)
	{
		return playerService.updatePlayer(player);
	}

}
